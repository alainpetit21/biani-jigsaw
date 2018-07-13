/* This file is part of the JigsawPuzzle game
 *
 * This game is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This game is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 *----------------------------------------------------------------------
 * Copyright (C) Alain Petit - alainpetit21@hotmail.com
 *
 * 01/12/11			0.1 First beta initial Version.
 *
 *-----------------------------------------------------------------------
 */
package com.bianisoft.games.jigsawpuzzle;


public class MgrScoring{
	private MgrPuzzleRules	m_objRules;
	private double			m_nPerfectScore;
	private double			m_nScore;
	private double			m_nNbInARow;


	public MgrScoring(int p_nMaxPieces, SprPiece[][] p_arSprPieces){
		switch(p_nMaxPieces){
			case 25:	m_nPerfectScore= 5500;
			case 100:	m_nPerfectScore= 10000;	//TODO - Change this
		}
		
		m_objRules= new MgrPuzzleRules(p_nMaxPieces);
		m_objRules.setShortcuts(p_arSprPieces);
	}
	
	public boolean validatePieceDropped(SprPiece p_sprPiece){
		boolean ret;
		
		if(ret= m_objRules.validatePieceDropped(p_sprPiece)){
			m_nScore+= 100 + ((m_nNbInARow / 10) *100);
			m_nNbInARow++;
			
		}else{
			m_nNbInARow= 0;
			if((m_nScore-= 100) < 0)
				m_nScore= 0;
		}
		
		GlobalSetting.m_nScore= (int)m_nScore;
		return ret;
	}

	public int getScore()	{return (int)m_nScore;}
	public boolean isPerfect()	{return m_nScore >= m_nPerfectScore;}
	public void resetCounterInARow()	{m_nNbInARow= 0;}
}
