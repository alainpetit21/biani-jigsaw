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
import com.bianisoft.engine.Applet;


public class AppletJigsawPuzzle extends Applet{
	public static final int IDCTX_GAME= 0x0;


	public AppletJigsawPuzzle(){
		super("Applet Jigsaw Puzzle", 800, 600);
	}

	public String getVersion(){
		return "1.2";
	}

	public void load(){
		addContext(new CtxGame());
		setCurContext(IDCTX_GAME);
	}
}