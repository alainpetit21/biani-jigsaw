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
 * 24/11/11			0.1 First beta initial Version.
 *
 *-----------------------------------------------------------------------
 */
package com.bianisoft.games.jigsawpuzzle;


import com.bianisoft.engine.Obj;
import com.bianisoft.engine.sprites.Sprite;


public class SprPiece extends Sprite{
	public static final int IDCLASS_Piece	= (1<<16) | Obj.IDCLASS_GAME | Obj.IDCLASS_Sprite;
	public static final int STATE_IDLE		= 0;

	private boolean m_isValid;
	private boolean m_isInHand;
	private int m_nValidX= -1;
	private int m_nValidY= -1;
	private int m_nPosInitX;
	private int m_nPosInitY;
	

	public SprPiece(String p_stResFile)		{super(p_stResFile);	setClassID(IDCLASS_Piece, "IDCLASS_Piece");}
	public SprPiece(Sprite p_sprTemplate)	{super(p_sprTemplate);	setClassID(IDCLASS_Piece, "IDCLASS_Piece");}
	
	public boolean isValid()	{return m_isValid;}
	public boolean isInHand()	{return m_isInHand;}

	public int getOffsetX()	{return m_nValidX;}
	public int getOffsetY()	{return m_nValidY;}
	
	public void init(){
		String stName= getTextID().substring(4);
		String stPosX= stName.substring(0, stName.indexOf('_'));
		String stPosY= stName.substring(stName.indexOf('_') + 1);
		
		m_nValidX= Integer.parseInt(stPosX);
		m_nValidY= Integer.parseInt(stPosY);
	}		

	public void setValidated(){
		m_isValid= true;
		setPosZ(getPosZ()+1);
	}

	public void setInHand()	{setInHand(true);}
	public void setInHand(boolean p_isInHand){
		m_isInHand= p_isInHand;
		
		if(p_isInHand){
			m_nPosInitX= (int)getPosX();
			m_nPosInitY= (int)getPosY();
			setPosZ(getPosZ()-1);
		}else
			setPosZ(getPosZ()+1);
	}

	public void cancelInHand(){
		if(!isInHand())
			return;

		setPos(m_nPosInitX, m_nPosInitY);
		setPosZ(getPosZ()+1);
		m_isInHand= false;
	}
}
