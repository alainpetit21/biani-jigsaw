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


//Special static LWJGL library imports
import static org.lwjgl.opengl.GL11.*;

//Standard Java imports
import java.util.ArrayList;

//LWJGL imports
import org.lwjgl.util.Rectangle;

//Bianisoft imports
import com.bianisoft.engine.Camera;
import com.bianisoft.engine.PhysObj;
import com.bianisoft.engine.resmng.Texture;
import com.bianisoft.engine.sprites.Sprite;


public class CtlMacSpriteList extends PhysObj{
	private ArrayList<Sprite>	m_lstSprite= new ArrayList<Sprite>();
	
	//Drawing option
	private float	m_nMinZoom= 0.5f;
	private float	m_nMaxZoom= 1.0f;
	
	//Manage data
	private Sprite		m_sprCursor;
	private Rectangle	m_recAreaManage;

	private	float		m_nPercentileHighlighted= 0.5f;
	private	float		m_nIdxHighlighted;
	private Sprite		m_sprHighlighted;
	private boolean		m_isActive;
			
			
	public CtlMacSpriteList()	{super();}
	public CtlMacSpriteList(CtlMacSpriteList p_ref){
		super();
		m_nMinZoom= p_ref.m_nMinZoom;
		m_nMaxZoom= p_ref.m_nMaxZoom;
		m_sprCursor= p_ref.m_sprCursor;
		m_recAreaManage= p_ref.m_recAreaManage;
	}
	
	public CtlMacSpriteList(Rectangle p_recArea, Sprite p_sprCursor){
		super();
		m_recAreaManage= p_recArea;
		m_sprCursor= p_sprCursor;
	}

	public CtlMacSpriteList(Rectangle p_recArea, Sprite p_sprCursor, float p_nMinZoom, float p_nMaxZoom){
		this(p_recArea, p_sprCursor);
		m_nMinZoom= p_nMinZoom;
		m_nMaxZoom= p_nMaxZoom;
	}

	public void remove(Sprite p_spr){m_lstSprite.remove(p_spr);}
	public int size()				{return m_lstSprite.size();}
	
	public void setZoom(float p_nMinZoom, float p_nMaxZoom)	{m_nMinZoom= p_nMinZoom;m_nMaxZoom= p_nMaxZoom;}
	public void setMinZoom(float p_nMinZoom)	{m_nMinZoom= p_nMinZoom;}
	public void setMaxZoom(float p_nMaxZoom)	{m_nMaxZoom= p_nMaxZoom;}
	public float getMinZoom()					{return m_nMinZoom;}
	public float getMaxZoom()					{return m_nMinZoom;}
	public boolean isActive()					{return m_isActive;}
	
	public Sprite click()	{return m_sprHighlighted;}

	public void add(Sprite p_spr){
		m_lstSprite.add(p_spr);
		p_spr.setZoom(m_nMinZoom);
	}

	private void manageCalcultationHighlighted(float p_nPosMouseY){
		if(m_isActive){
			p_nPosMouseY-= m_recAreaManage.getY();
			m_nPercentileHighlighted= p_nPosMouseY / m_recAreaManage.getHeight();
		}else{
			m_nPercentileHighlighted= 0.5f;
		}
		
		m_nIdxHighlighted= (m_lstSprite.size() * m_nPercentileHighlighted);
		m_sprHighlighted= m_lstSprite.get((int)m_nIdxHighlighted);
	}

	private void manageEmpty(){
		m_nPercentileHighlighted= 0.5f;
		m_nIdxHighlighted= -1;
		m_sprHighlighted= null;
	}

	private void manageListPositioningNotActive(){
		if(m_lstSprite.size() <= 0)
			return;
		
		int nStartPosY= (int)getPosY();
		int nCurPosY= nStartPosY;

		//First Set the Highlight at max zoom
		m_sprHighlighted.setPos(getPosX(), nCurPosY);
		m_sprHighlighted.zoomTo(m_nMinZoom, 300);
		nCurPosY-= m_sprHighlighted.getHeight() * m_nMinZoom;

		//Draw all the rest before, at min zoom
		for(int i= (int)m_nIdxHighlighted - 1; i >= 0; --i){
			Sprite spr= m_lstSprite.get(i);
			spr.setPos(getPosX(), nCurPosY);
			spr.zoomTo(m_nMinZoom, 300);
			nCurPosY-= (m_sprHighlighted.getHeight() * m_nMinZoom);			
		}

		//Now everything after the highlighted
		nCurPosY= nStartPosY;
		nCurPosY+= m_sprHighlighted.getHeight() * m_nMinZoom;

		//Draw all the rest after, at min zoom
		for(int i= (int)m_nIdxHighlighted + 1; i < m_lstSprite.size(); ++i){
			Sprite spr= m_lstSprite.get(i);
			spr.setPos(getPosX(), nCurPosY);
			spr.zoomTo(m_nMinZoom, 300);
			nCurPosY+= (m_sprHighlighted.getHeight() * m_nMinZoom);			
		}
	}

	private void manageListPositioningActive(float p_nPosMouseY){
		float nIntraStepPosY= m_nIdxHighlighted - (int)m_nIdxHighlighted;
		int nCurPosY= (int)p_nPosMouseY - (int)(nIntraStepPosY*100);

		//Draw all before, at parabolic formula for zoom
		for(float i= m_nIdxHighlighted; i >= 0; --i){
			Sprite spr= m_lstSprite.get((int)i);
			float nZoom= Math.max(-(((i-m_nIdxHighlighted)/1.5f)*((i-m_nIdxHighlighted))/1.5f)+m_nMaxZoom, m_nMinZoom);

			spr.setPos(getPosX(), nCurPosY, getPosZ());
			spr.zoomTo(nZoom, 300);
			nCurPosY-= (m_sprHighlighted.getHeight() * nZoom)/1.25;			
		}

		//Now everything after the highlighted
		nCurPosY= nCurPosY= (int)p_nPosMouseY - (int)(nIntraStepPosY*100);
		//Draw all after, at parabolic formula for zoom
		for(int i= (int)m_nIdxHighlighted; i < m_lstSprite.size(); ++i){
			Sprite spr= m_lstSprite.get((int)i);
			float nZoom= Math.max(-(((i-m_nIdxHighlighted)/1.5f)*((i-m_nIdxHighlighted))/1.5f)+m_nMaxZoom, m_nMinZoom);

			spr.setPos(getPosX(), nCurPosY, getPosZ());
			spr.zoomTo(nZoom, 300);
			nCurPosY+= (m_sprHighlighted.getHeight() * nZoom)/1.25;			
		}

		m_sprHighlighted.setPosZ(getPosZ()-1);
	}
	

	public void manage(float p_fTimeScaleFactor){
		super.manage(p_fTimeScaleFactor);

		//Detect if Mouse is within operational rectangle
		Camera cam= Camera.getCur(Camera.TYPE_2D);
		int nMousePosX= (int)cam.doUnprojectionX(m_sprCursor.getPosX());
		int nMousePosY= (int)cam.doUnprojectionY(m_sprCursor.getPosY());
		
		nMousePosX-= getPosX();
		nMousePosY-= getPosY();
		m_isActive= m_recAreaManage.contains(nMousePosX, nMousePosY);
		
		if(!m_lstSprite.isEmpty()){
			manageCalcultationHighlighted(nMousePosY);
			if(isActive())
				manageListPositioningActive(nMousePosY);
			else
				manageListPositioningNotActive();
		}else
			manageEmpty();
	}
	
	public void drawDebug(){
		glPushMatrix();

		Texture.bindNone();

		glTranslated(getPosX(), getPosY(), 0);
		glColor3d(1.0, 0.0, 0.0);
		glPolygonMode(GL_FRONT_AND_BACK, GL_LINE);

		glBegin(GL_LINE_LOOP);
			glVertex2d(m_recAreaManage.getX(), m_recAreaManage.getY());		
			glVertex2d(m_recAreaManage.getX() + m_recAreaManage.getWidth(), m_recAreaManage.getY());

			glVertex2d(m_recAreaManage.getX() + m_recAreaManage.getWidth(), m_recAreaManage.getY());	
			glVertex2d(m_recAreaManage.getX() + m_recAreaManage.getWidth(), m_recAreaManage.getY() + m_recAreaManage.getHeight());

			glVertex2d(m_recAreaManage.getX() + m_recAreaManage.getWidth(), m_recAreaManage.getY() + m_recAreaManage.getHeight());
			glVertex2d(m_recAreaManage.getX(), m_recAreaManage.getY() + m_recAreaManage.getHeight());

			glVertex2d(m_recAreaManage.getX(), m_recAreaManage.getY() + m_recAreaManage.getHeight());
			glVertex2d(m_recAreaManage.getX(), m_recAreaManage.getY());		
		glEnd();
		glPolygonMode(GL_FRONT_AND_BACK, GL_FILL);
		glEnable(GL_TEXTURE_2D);
	}
}
