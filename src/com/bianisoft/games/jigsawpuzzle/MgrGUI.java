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

//Bianisoft imports
import com.bianisoft.engine.sprites.Button;


public class MgrGUI{
	private Button	m_butRotateRight;
	private Button	m_butRotateLeft;
	private CtxGame	m_ctxGame;

	
	public MgrGUI(CtxGame p_ctxGame){
		m_ctxGame= p_ctxGame;
		
		m_butRotateRight= (Button)m_ctxGame.findByTextID("Bt_RotateClockwise");
		m_butRotateLeft= (Button)m_ctxGame.findByTextID("Bt_RotateCounterClockwise");

		m_butRotateRight.setCallback(new BtGame_RotatePieceRightCallback());
		m_butRotateLeft.setCallback(new BtGame_RotateLeftCallback());
	}

	class BtGame_RotatePieceRightCallback implements Button.I_Callback{
		public void callbackStateChanged(int p_nNewState, Button p_obj){
			if(p_nNewState == Button.ST_CLICKED)
				m_ctxGame.rotatePieceClockwise();
		}
	}

	class BtGame_RotateLeftCallback implements Button.I_Callback{
		public void callbackStateChanged(int p_nNewState, Button p_obj){
			if(p_nNewState == Button.ST_CLICKED)
				m_ctxGame.rotatePieceCounterClockwise();
		}
	}
}

