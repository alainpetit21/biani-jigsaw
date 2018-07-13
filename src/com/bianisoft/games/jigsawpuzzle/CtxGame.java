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

//Standard Java imports
import java.util.ArrayList;


//Bianisoft imports
import com.bianisoft.engine.helper.Random;
import com.bianisoft.engine.Camera;
import com.bianisoft.engine.Context;
import com.bianisoft.engine.Obj;
import com.bianisoft.engine.labels.Label;
import com.bianisoft.engine.manager.MngInput;
import com.bianisoft.engine.sprites.Sprite;
import org.lwjgl.util.Rectangle;


public class CtxGame extends Context{
	public static final int MODE_PREVIEW= 0;
	public static final int MODE_GAME	= 1;
	public static final int MODE_PIECES	= 2;
	
	//Private
	private Camera	m_cam2D;
	private Sprite	m_sprCursor;
	private Label	m_lblScore;
	
	private CtlMacSpriteList	m_ctlPiecesList;

	private MgrScoring			m_mgrScoring;
	private MgrGUI				m_mgrGUI;
	private SprPiece[][]		m_arSprPiece;
	private SprPiece			m_sprPieceInHand;

	private int	m_nModePlay= 1;
	private int	m_nMaxPiece;
	private int	m_nMaxPieceInRow;

	
	public void activate(){
		super.activate();

		//Load Design, Generic + Specific per puzzle
		//TODO - Trying to separate the puzzle ressources and make a package per puzzle
		DesignCtxGame.load(this);
		switch(GlobalSetting.m_nPuzzleID){
			case 0:DesignCtxGamePuzzle1_25.load(this);	break;
			case 1:DesignCtxGamePuzzle2_25.load(this);	break;
			case 2:DesignCtxGamePuzzle3_25.load(this);	break;
		}

		//Gather the GUI oject that we are going to need at the script level
		m_cam2D= Camera.getCur(Camera.TYPE_2D);
		m_sprCursor= (Sprite)findByTextID("Spr_Cursor");
		m_sprCursor.setHotSpot(0, 16);
		setCursor(m_sprCursor);
		
		m_lblScore= (Label)findByTextID("Lbl_ScoreValue");
		m_lblScore.set(GlobalSetting.m_nScore);
		
		//Init the pieces
		for(Obj obj : getCountainer(COUNTAINER_TYPE_WORLD_2D).getVectorChilds()){
			if(obj.isKindOf(SprPiece.IDCLASS_Piece)){
				SprPiece sprPiece= (SprPiece)obj;

				sprPiece.setAngleZ(Random.rand(4) * 90);
				sprPiece.init();
				
				m_nMaxPiece++;
			}
		}
		

		//Create Shortcut Buffers
		m_nMaxPieceInRow	= (int)Math.sqrt(m_nMaxPiece);
		m_arSprPiece	= new SprPiece[m_nMaxPieceInRow][m_nMaxPieceInRow];
		ArrayList<SprPiece> arTemp= new ArrayList<SprPiece>();
		
		
		//Assign Shortcut buffers, arTemp will be in a 1D array
		for(Obj obj : getCountainer(COUNTAINER_TYPE_WORLD_2D).getVectorChilds()){
			if(obj.isKindOf(SprPiece.IDCLASS_Piece)){
				SprPiece sprPiece= (SprPiece)obj;
				arTemp.add(sprPiece);
				m_arSprPiece[sprPiece.getOffsetY()][sprPiece.getOffsetX()]= sprPiece;
			}
		}

		
		//Randomize the Free Buffer from the arTempBuffer
		m_ctlPiecesList= new CtlMacSpriteList(new Rectangle(-50, -200, 100, 400), m_sprCursor);
		m_ctlPiecesList.setPos(275, 0, 50);
		
		if(m_nMaxPiece == 25)		m_ctlPiecesList.setZoom(0.2f, 1.5f);
		else if(m_nMaxPiece == 100)	m_ctlPiecesList.setZoom(0.4f, 3.0f);

		
		do{
			int idx= Random.rand(arTemp.size());
			
			m_ctlPiecesList.add(arTemp.get(idx));
			arTemp.remove(idx);
		}while(!arTemp.isEmpty());
		
		
		
		//Rest of the script activate
		m_mgrScoring= new MgrScoring(m_nMaxPiece, m_arSprPiece);
		m_mgrGUI= new MgrGUI(this);
//		m_objRules.cheat1();
	}
	public void rotatePieceClockwise(){
		if(m_sprPieceInHand != null){
			int nCurAngle= (int)m_sprPieceInHand.getAngleZ() / 90;

			m_sprPieceInHand.rotateTo(++nCurAngle*90, 1000);
		}
	}

	public void rotatePieceCounterClockwise(){
		if(m_sprPieceInHand != null){
			int nCurAngle= (int)m_sprPieceInHand.getAngleZ() / 90;

			m_sprPieceInHand.rotateTo(--nCurAngle*90, 1000);
		}
	}
	
	public boolean keyboardManage(MngInput p_mngInput){
		if(!super.keyboardManage(p_mngInput))
			return false;
		
		//Rotate the piece in hand
		if(p_mngInput.isKeyboardClicked(MngInput.K_ARROW_UP))			rotatePieceClockwise();
		else if(p_mngInput.isKeyboardClicked(MngInput.K_ARROW_DOWN))	rotatePieceCounterClockwise();
		
		
		return true;
	}

	public void mouseManage(MngInput p_mngInput) {
		Camera cam= Camera.getCur(Camera.TYPE_2D);
		int nMousePosX= (int)cam.doUnprojectionX(m_sprCursor.getPosX());
		int nMousePosY= (int)cam.doUnprojectionY(m_sprCursor.getPosY());

		if(p_mngInput.isMouseClicked(MngInput.M_LEFT)){
			if(m_sprPieceInHand == null){
				//try to find a piece
				if(m_ctlPiecesList.isActive()){
					SprPiece sprPiece= (SprPiece)m_ctlPiecesList.click();

					if((sprPiece != null) && (!sprPiece.isValid())){
						m_sprPieceInHand= sprPiece;
						m_sprPieceInHand.setInHand();
					}
				}
			}else{
				//If the mouse is using the GUI toolbar, ignore
				if(nMousePosY > 250)
					return;
					
				if(m_nModePlay == MODE_GAME)
					if(m_mgrScoring.validatePieceDropped(m_sprPieceInHand))
						m_ctlPiecesList.remove(m_sprPieceInHand);
					else
						m_sprPieceInHand.cancelInHand();
				
				m_lblScore.set(m_mgrScoring.getScore());
				m_sprPieceInHand.setInHand(false);
				m_sprPieceInHand= null;
			}
		}else if(p_mngInput.isMouseClicked(MngInput.M_RIGHT)){
			if(m_sprPieceInHand != null){
				m_sprPieceInHand.cancelInHand();
				m_sprPieceInHand= null;
			}
		}
	}

	public void manage(float p_fTimeScaleFactor){
		super.manage(p_fTimeScaleFactor);

		m_ctlPiecesList.manage(p_fTimeScaleFactor);
		
		if(m_sprPieceInHand != null){
			m_sprPieceInHand.setPos(m_cam2D.getPosX() + m_sprCursor.getPosX(), m_sprCursor.getPosY());
			m_sprPieceInHand.setZoom(1);
		}
	}

	public void drawDebug() {
		super.drawDebug();
		
		m_ctlPiecesList.drawDebug();
	}
}


