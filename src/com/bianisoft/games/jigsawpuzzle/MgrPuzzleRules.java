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

import com.bianisoft.engine.App;


public class MgrPuzzleRules{
	public static final int[][] CORRECT_COORD_X_25= {{-198, -110,  -10,   90,  188}, 
													{ -198, -100,   10,  110,  198}, 
													{ -198, -100,    0,  100,  198}, 
													{ -198, -110,  -10,   90,  188}, 
													{ -198, -110,  -10,  100,  198}};
	public static final int[][] CORRECT_COORD_Y_25= {{-198, -188, -198, -198, -198}, 
													{ -100, -100, -100, -110, -110}, 
													{   10,  -10,    0,    0,  -10}, 
													{  100,   90,  100,  100,  100}, 
													{  188,  188,  198,  188,  198}};
	public static final int[][] CORRECT_COORD_X_100= {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
													{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
													{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
													{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
													{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
													{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
													{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
													{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
													{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
													{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
	public static final int[][] CORRECT_COORD_Y_100= {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
													{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
													{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
													{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
													{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
													{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
													{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
													{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
													{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
													{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
	
	
	private int[][]			m_ar2DCorrectPositionX;
	private int[][]			m_ar2DCorrectPositionY;
	private SprPiece[][]	m_arSprPiece;
	private int				m_nNbPieces;


	MgrPuzzleRules(int p_nbPieces){
		switch(m_nNbPieces= p_nbPieces){
			case 25:
				m_ar2DCorrectPositionX= CORRECT_COORD_X_25;
				m_ar2DCorrectPositionY= CORRECT_COORD_Y_25;
				break;
			case 100:
				m_ar2DCorrectPositionX= CORRECT_COORD_X_100;
				m_ar2DCorrectPositionY= CORRECT_COORD_Y_100;
				break;
			default:
				System.out.print("***ERROR*** in Rules Puzzles\n****Wrong number of pieces input***\n");
				App.exit();
		}
	}
	
	public void setShortcuts(SprPiece[][] p_arSprPiece)	{m_arSprPiece= p_arSprPiece;}
	
	public void load(){
		
	}

	public void cheat1(){
		setPieceToValidPosition(0, 0);
		setPieceToValidPosition(1, 0);
		setPieceToValidPosition(2, 0);
		setPieceToValidPosition(3, 0);
		setPieceToValidPosition(4, 0);
	}

	public void cheat2(){
		setPieceToValidPosition(0, 1);
		setPieceToValidPosition(1, 1);
		setPieceToValidPosition(2, 1);
		setPieceToValidPosition(3, 1);
		setPieceToValidPosition(4, 1);
	}

	public void cheat3(){
		setPieceToValidPosition(0, 2);
		setPieceToValidPosition(1, 2);
		setPieceToValidPosition(2, 2);
		setPieceToValidPosition(3, 2);
		setPieceToValidPosition(4, 2);
	}

	public void cheat4(){
		setPieceToValidPosition(0, 3);
		setPieceToValidPosition(1, 3);
		setPieceToValidPosition(2, 3);
		setPieceToValidPosition(3, 3);
		setPieceToValidPosition(4, 3);
	}

	public void cheat5(){
		setPieceToValidPosition(0, 4);
		setPieceToValidPosition(1, 4);
		setPieceToValidPosition(2, 4);
		setPieceToValidPosition(3, 4);
		setPieceToValidPosition(4, 4);
	}

	public void cheatA(){
		setPieceToValidPosition(0, 0);
		setPieceToValidPosition(0, 1);
		setPieceToValidPosition(0, 2);
		setPieceToValidPosition(0, 3);
		setPieceToValidPosition(0, 4);
	}

	public void cheatB(){
		setPieceToValidPosition(1, 0);
		setPieceToValidPosition(1, 1);
		setPieceToValidPosition(1, 2);
		setPieceToValidPosition(1, 3);
		setPieceToValidPosition(1, 4);
	}

	public void cheatC(){
		setPieceToValidPosition(2, 0);
		setPieceToValidPosition(2, 1);
		setPieceToValidPosition(2, 2);
		setPieceToValidPosition(2, 3);
		setPieceToValidPosition(2, 4);
	}

	public void cheatD(){
		setPieceToValidPosition(3, 0);
		setPieceToValidPosition(3, 1);
		setPieceToValidPosition(3, 2);
		setPieceToValidPosition(3, 3);
		setPieceToValidPosition(3, 4);
	}

	public void cheatE(){
		setPieceToValidPosition(4, 0);
		setPieceToValidPosition(4, 1);
		setPieceToValidPosition(4, 2);
		setPieceToValidPosition(4, 3);
		setPieceToValidPosition(4, 4);
	}

	public void setPieceToValidPosition(SprPiece p_sprPiece){
		p_sprPiece.setPosX(-100 + m_ar2DCorrectPositionX[p_sprPiece.getOffsetY()][p_sprPiece.getOffsetX()]);
		p_sprPiece.setPosY(   0 + m_ar2DCorrectPositionY[p_sprPiece.getOffsetY()][p_sprPiece.getOffsetX()]);
		p_sprPiece.setValidated();
	}	
	public void setPieceToValidPosition(int p_nOffsetX, int p_nOffsetY){
		m_arSprPiece[p_nOffsetY][p_nOffsetX].setPosX(-100 + m_ar2DCorrectPositionX[p_nOffsetY][p_nOffsetX]);
		m_arSprPiece[p_nOffsetY][p_nOffsetX].setPosY(   0 + m_ar2DCorrectPositionY[p_nOffsetY][p_nOffsetX]);
		m_arSprPiece[p_nOffsetY][p_nOffsetX].setValidated();
	}	
	
	public boolean validatePieceDropped(SprPiece p_sprPiece){
		int nOffsetX= p_sprPiece.getOffsetX();
		int nOffsetY= p_sprPiece.getOffsetY();
		int nPosPieceX= (int)p_sprPiece.getPosX();
		int nPosPieceY= (int)p_sprPiece.getPosY();
		int nOffsetPosX= -100 + m_ar2DCorrectPositionX[nOffsetY][nOffsetX];
		int nOffsetPosY=    0 + m_ar2DCorrectPositionY[nOffsetY][nOffsetX];
		int nAngle= (int)p_sprPiece.getAngleZ() / 90;
	
		nAngle%= 4;
		if(nAngle < 0)
			nAngle+= 4;
		else if(nAngle > 3)
			nAngle-= 4;
		
		if((Math.abs(nPosPieceX-nOffsetPosX) < 20) && (Math.abs(nPosPieceY-nOffsetPosY) < 20) && (nAngle == 0)){
			setPieceToValidPosition(p_sprPiece);
			return true;
		}
		
		return false;
	}
}
