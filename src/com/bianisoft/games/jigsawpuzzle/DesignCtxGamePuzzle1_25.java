package com.bianisoft.games.jigsawpuzzle;


//LWJGL library imports
import org.lwjgl.util.Rectangle;

//Bianisoft imports
import com.bianisoft.engine.Context;
import com.bianisoft.engine.backgrounds.Background;
import com.bianisoft.engine.labels.Label;
import com.bianisoft.engine.sprites.Sprite;
import com.bianisoft.engine.sprites.Sprite.State;
import com.bianisoft.engine.sprites.Button;


public class DesignCtxGamePuzzle1_25{
	public static void load(Context p_ctxUnder){
		/*DATA_BACKGROUND_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS*/
		/*DATA:2|Background|Bk_PuzzleCompleted|/resPuzzle1/Backs/Game/BkPuzzle1.png|-800|0|100|1|*/
		Background backBk_PuzzleCompleted= new Background("/resPuzzle1/Backs/Game/BkPuzzle1.png");
		backBk_PuzzleCompleted.setTextID("Bk_PuzzleCompleted");
		backBk_PuzzleCompleted.setPos(-800, 0, 100);
		backBk_PuzzleCompleted.load();
		p_ctxUnder.addChild(backBk_PuzzleCompleted, false, false);

		/*DATA_BACKGROUND_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS*/
		/*DATA:1|Background|BkAnchors|/res/Backs/Game/BkAnchors25.png|-100|0|98|1|*/
		Background backBkAnchors= new Background("/res/Backs/Game/BkAnchors25.png");
		backBkAnchors.setTextID("BkAnchors");
		backBkAnchors.setPos(-100, 0, 98);
		backBkAnchors.load();
		p_ctxUnder.addChild(backBkAnchors, false, false);

		/*DATA_CUSTOM_SPRITE_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|DEFAULT_STATE|DEFAULT_FRAME|NB_STATES|STATE_NAME|STATE_NB_FRAMES|STATE_SPEED*/
		/*DATA:3|com.bianisoft.games.jigsawpuzzle.SprPiece|Spr_0_0|/resPuzzle1/Sprites/Game/Puzzle1/Puzzle1_25Half_xcf-Pasted_Layer_1.png|853|159|50|1|0|0|1|Idle|1|0.0|*/
		com.bianisoft.games.jigsawpuzzle.SprPiece sprSpr_0_0= new com.bianisoft.games.jigsawpuzzle.SprPiece("/resPuzzle1/Sprites/Game/Puzzle1/Puzzle1_25Half_xcf-Pasted_Layer_1.png");
		sprSpr_0_0.setTextID("Spr_0_0");
		sprSpr_0_0.setPos(853, 159, 50);
		sprSpr_0_0.addState(sprSpr_0_0.new State("Idle", 1, 0.0f));
		sprSpr_0_0.load();
		sprSpr_0_0.setCurState(0);
		sprSpr_0_0.setCurFrame(0);
		p_ctxUnder.addChild(sprSpr_0_0, false, false);

		/*DATA_CUSTOM_SPRITE_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|DEFAULT_STATE|DEFAULT_FRAME|NB_STATES|STATE_NAME|STATE_NB_FRAMES|STATE_SPEED*/
		/*DATA:4|com.bianisoft.games.jigsawpuzzle.SprPiece|Spr_1_0|/resPuzzle1/Sprites/Game/Puzzle1/Puzzle1_25Half_xcf-Pasted_Layer_2.png|870|-96|50|1|0|0|1|Idle|1|0.0|*/
		com.bianisoft.games.jigsawpuzzle.SprPiece sprSpr_1_0= new com.bianisoft.games.jigsawpuzzle.SprPiece("/resPuzzle1/Sprites/Game/Puzzle1/Puzzle1_25Half_xcf-Pasted_Layer_2.png");
		sprSpr_1_0.setTextID("Spr_1_0");
		sprSpr_1_0.setPos(870, -96, 50);
		sprSpr_1_0.addState(sprSpr_1_0.new State("Idle", 1, 0.0f));
		sprSpr_1_0.load();
		sprSpr_1_0.setCurState(0);
		sprSpr_1_0.setCurFrame(0);
		p_ctxUnder.addChild(sprSpr_1_0, false, false);

		/*DATA_CUSTOM_SPRITE_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|DEFAULT_STATE|DEFAULT_FRAME|NB_STATES|STATE_NAME|STATE_NB_FRAMES|STATE_SPEED*/
		/*DATA:5|com.bianisoft.games.jigsawpuzzle.SprPiece|Spr_2_0|/resPuzzle1/Sprites/Game/Puzzle1/Puzzle1_25Half_xcf-Pasted_Layer_3.png|885|67|50|1|0|0|1|Idle|1|0.0|*/
		com.bianisoft.games.jigsawpuzzle.SprPiece sprSpr_2_0= new com.bianisoft.games.jigsawpuzzle.SprPiece("/resPuzzle1/Sprites/Game/Puzzle1/Puzzle1_25Half_xcf-Pasted_Layer_3.png");
		sprSpr_2_0.setTextID("Spr_2_0");
		sprSpr_2_0.setPos(885, 67, 50);
		sprSpr_2_0.addState(sprSpr_2_0.new State("Idle", 1, 0.0f));
		sprSpr_2_0.load();
		sprSpr_2_0.setCurState(0);
		sprSpr_2_0.setCurFrame(0);
		p_ctxUnder.addChild(sprSpr_2_0, false, false);

		/*DATA_CUSTOM_SPRITE_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|DEFAULT_STATE|DEFAULT_FRAME|NB_STATES|STATE_NAME|STATE_NB_FRAMES|STATE_SPEED*/
		/*DATA:6|com.bianisoft.games.jigsawpuzzle.SprPiece|Spr_3_0|/resPuzzle1/Sprites/Game/Puzzle1/Puzzle1_25Half_xcf-Pasted_Layer_4.png|711|76|50|1|0|0|1|Idle|1|0.0|*/
		com.bianisoft.games.jigsawpuzzle.SprPiece sprSpr_3_0= new com.bianisoft.games.jigsawpuzzle.SprPiece("/resPuzzle1/Sprites/Game/Puzzle1/Puzzle1_25Half_xcf-Pasted_Layer_4.png");
		sprSpr_3_0.setTextID("Spr_3_0");
		sprSpr_3_0.setPos(711, 76, 50);
		sprSpr_3_0.addState(sprSpr_3_0.new State("Idle", 1, 0.0f));
		sprSpr_3_0.load();
		sprSpr_3_0.setCurState(0);
		sprSpr_3_0.setCurFrame(0);
		p_ctxUnder.addChild(sprSpr_3_0, false, false);

		/*DATA_CUSTOM_SPRITE_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|DEFAULT_STATE|DEFAULT_FRAME|NB_STATES|STATE_NAME|STATE_NB_FRAMES|STATE_SPEED*/
		/*DATA:7|com.bianisoft.games.jigsawpuzzle.SprPiece|Spr_4_0|/resPuzzle1/Sprites/Game/Puzzle1/Puzzle1_25Half_xcf-Pasted_Layer_5.png|715|-111|50|1|0|0|1|Idle|1|0.0|*/
		com.bianisoft.games.jigsawpuzzle.SprPiece sprSpr_4_0= new com.bianisoft.games.jigsawpuzzle.SprPiece("/resPuzzle1/Sprites/Game/Puzzle1/Puzzle1_25Half_xcf-Pasted_Layer_5.png");
		sprSpr_4_0.setTextID("Spr_4_0");
		sprSpr_4_0.setPos(715, -111, 50);
		sprSpr_4_0.addState(sprSpr_4_0.new State("Idle", 1, 0.0f));
		sprSpr_4_0.load();
		sprSpr_4_0.setCurState(0);
		sprSpr_4_0.setCurFrame(0);
		p_ctxUnder.addChild(sprSpr_4_0, false, false);

		/*DATA_CUSTOM_SPRITE_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|DEFAULT_STATE|DEFAULT_FRAME|NB_STATES|STATE_NAME|STATE_NB_FRAMES|STATE_SPEED*/
		/*DATA:8|com.bianisoft.games.jigsawpuzzle.SprPiece|Spr_0_1|/resPuzzle1/Sprites/Game/Puzzle1/Puzzle1_25Half_xcf-Pasted_Layer_6.png|927|-3|50|1|0|0|1|Idle|1|0.0|*/
		com.bianisoft.games.jigsawpuzzle.SprPiece sprSpr_0_1= new com.bianisoft.games.jigsawpuzzle.SprPiece("/resPuzzle1/Sprites/Game/Puzzle1/Puzzle1_25Half_xcf-Pasted_Layer_6.png");
		sprSpr_0_1.setTextID("Spr_0_1");
		sprSpr_0_1.setPos(927, -3, 50);
		sprSpr_0_1.addState(sprSpr_0_1.new State("Idle", 1, 0.0f));
		sprSpr_0_1.load();
		sprSpr_0_1.setCurState(0);
		sprSpr_0_1.setCurFrame(0);
		p_ctxUnder.addChild(sprSpr_0_1, false, false);

		/*DATA_CUSTOM_SPRITE_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|DEFAULT_STATE|DEFAULT_FRAME|NB_STATES|STATE_NAME|STATE_NB_FRAMES|STATE_SPEED*/
		/*DATA:9|com.bianisoft.games.jigsawpuzzle.SprPiece|Spr_1_1|/resPuzzle1/Sprites/Game/Puzzle1/Puzzle1_25Half_xcf-Pasted_Layer_7.png|637|184|50|1|0|0|1|Idle|1|0.0|*/
		com.bianisoft.games.jigsawpuzzle.SprPiece sprSpr_1_1= new com.bianisoft.games.jigsawpuzzle.SprPiece("/resPuzzle1/Sprites/Game/Puzzle1/Puzzle1_25Half_xcf-Pasted_Layer_7.png");
		sprSpr_1_1.setTextID("Spr_1_1");
		sprSpr_1_1.setPos(637, 184, 50);
		sprSpr_1_1.addState(sprSpr_1_1.new State("Idle", 1, 0.0f));
		sprSpr_1_1.load();
		sprSpr_1_1.setCurState(0);
		sprSpr_1_1.setCurFrame(0);
		p_ctxUnder.addChild(sprSpr_1_1, false, false);

		/*DATA_CUSTOM_SPRITE_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|DEFAULT_STATE|DEFAULT_FRAME|NB_STATES|STATE_NAME|STATE_NB_FRAMES|STATE_SPEED*/
		/*DATA:10|com.bianisoft.games.jigsawpuzzle.SprPiece|Spr_2_1|/resPuzzle1/Sprites/Game/Puzzle1/Puzzle1_25Half_xcf-Pasted_Layer_8.png|576|-63|50|1|0|0|1|Idle|1|0.0|*/
		com.bianisoft.games.jigsawpuzzle.SprPiece sprSpr_2_1= new com.bianisoft.games.jigsawpuzzle.SprPiece("/resPuzzle1/Sprites/Game/Puzzle1/Puzzle1_25Half_xcf-Pasted_Layer_8.png");
		sprSpr_2_1.setTextID("Spr_2_1");
		sprSpr_2_1.setPos(576, -63, 50);
		sprSpr_2_1.addState(sprSpr_2_1.new State("Idle", 1, 0.0f));
		sprSpr_2_1.load();
		sprSpr_2_1.setCurState(0);
		sprSpr_2_1.setCurFrame(0);
		p_ctxUnder.addChild(sprSpr_2_1, false, false);

		/*DATA_CUSTOM_SPRITE_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|DEFAULT_STATE|DEFAULT_FRAME|NB_STATES|STATE_NAME|STATE_NB_FRAMES|STATE_SPEED*/
		/*DATA:11|com.bianisoft.games.jigsawpuzzle.SprPiece|Spr_3_1|/resPuzzle1/Sprites/Game/Puzzle1/Puzzle1_25Half_xcf-Pasted_Layer_9.png|1065|-102|50|1|0|0|1|Idle|1|0.0|*/
		com.bianisoft.games.jigsawpuzzle.SprPiece sprSpr_3_1= new com.bianisoft.games.jigsawpuzzle.SprPiece("/resPuzzle1/Sprites/Game/Puzzle1/Puzzle1_25Half_xcf-Pasted_Layer_9.png");
		sprSpr_3_1.setTextID("Spr_3_1");
		sprSpr_3_1.setPos(1065, -102, 50);
		sprSpr_3_1.addState(sprSpr_3_1.new State("Idle", 1, 0.0f));
		sprSpr_3_1.load();
		sprSpr_3_1.setCurState(0);
		sprSpr_3_1.setCurFrame(0);
		p_ctxUnder.addChild(sprSpr_3_1, false, false);

		/*DATA_CUSTOM_SPRITE_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|DEFAULT_STATE|DEFAULT_FRAME|NB_STATES|STATE_NAME|STATE_NB_FRAMES|STATE_SPEED*/
		/*DATA:12|com.bianisoft.games.jigsawpuzzle.SprPiece|Spr_4_1|/resPuzzle1/Sprites/Game/Puzzle1/Puzzle1_25Half_xcf-Pasted_Layer_10.png|1026|153|50|1|0|0|1|Idle|1|0.0|*/
		com.bianisoft.games.jigsawpuzzle.SprPiece sprSpr_4_1= new com.bianisoft.games.jigsawpuzzle.SprPiece("/resPuzzle1/Sprites/Game/Puzzle1/Puzzle1_25Half_xcf-Pasted_Layer_10.png");
		sprSpr_4_1.setTextID("Spr_4_1");
		sprSpr_4_1.setPos(1026, 153, 50);
		sprSpr_4_1.addState(sprSpr_4_1.new State("Idle", 1, 0.0f));
		sprSpr_4_1.load();
		sprSpr_4_1.setCurState(0);
		sprSpr_4_1.setCurFrame(0);
		p_ctxUnder.addChild(sprSpr_4_1, false, false);

		/*DATA_CUSTOM_SPRITE_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|DEFAULT_STATE|DEFAULT_FRAME|NB_STATES|STATE_NAME|STATE_NB_FRAMES|STATE_SPEED*/
		/*DATA:13|com.bianisoft.games.jigsawpuzzle.SprPiece|Spr_0_2|/resPuzzle1/Sprites/Game/Puzzle1/Puzzle1_25Half_xcf-Pasted_Layer_11.png|782|181|50|1|0|0|1|Idle|1|0.0|*/
		com.bianisoft.games.jigsawpuzzle.SprPiece sprSpr_0_2= new com.bianisoft.games.jigsawpuzzle.SprPiece("/resPuzzle1/Sprites/Game/Puzzle1/Puzzle1_25Half_xcf-Pasted_Layer_11.png");
		sprSpr_0_2.setTextID("Spr_0_2");
		sprSpr_0_2.setPos(782, 181, 50);
		sprSpr_0_2.addState(sprSpr_0_2.new State("Idle", 1, 0.0f));
		sprSpr_0_2.load();
		sprSpr_0_2.setCurState(0);
		sprSpr_0_2.setCurFrame(0);
		p_ctxUnder.addChild(sprSpr_0_2, false, false);

		/*DATA_CUSTOM_SPRITE_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|DEFAULT_STATE|DEFAULT_FRAME|NB_STATES|STATE_NAME|STATE_NB_FRAMES|STATE_SPEED*/
		/*DATA:14|com.bianisoft.games.jigsawpuzzle.SprPiece|Spr_1_2|/resPuzzle1/Sprites/Game/Puzzle1/Puzzle1_25Half_xcf-Pasted_Layer_12.png|1066|26|50|1|0|0|1|Idle|1|0.0|*/
		com.bianisoft.games.jigsawpuzzle.SprPiece sprSpr_1_2= new com.bianisoft.games.jigsawpuzzle.SprPiece("/resPuzzle1/Sprites/Game/Puzzle1/Puzzle1_25Half_xcf-Pasted_Layer_12.png");
		sprSpr_1_2.setTextID("Spr_1_2");
		sprSpr_1_2.setPos(1066, 26, 50);
		sprSpr_1_2.addState(sprSpr_1_2.new State("Idle", 1, 0.0f));
		sprSpr_1_2.load();
		sprSpr_1_2.setCurState(0);
		sprSpr_1_2.setCurFrame(0);
		p_ctxUnder.addChild(sprSpr_1_2, false, false);

		/*DATA_CUSTOM_SPRITE_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|DEFAULT_STATE|DEFAULT_FRAME|NB_STATES|STATE_NAME|STATE_NB_FRAMES|STATE_SPEED*/
		/*DATA:15|com.bianisoft.games.jigsawpuzzle.SprPiece|Spr_2_2|/resPuzzle1/Sprites/Game/Puzzle1/Puzzle1_25Half_xcf-Pasted_Layer_13.png|988|-139|50|1|0|0|1|Idle|1|0.0|*/
		com.bianisoft.games.jigsawpuzzle.SprPiece sprSpr_2_2= new com.bianisoft.games.jigsawpuzzle.SprPiece("/resPuzzle1/Sprites/Game/Puzzle1/Puzzle1_25Half_xcf-Pasted_Layer_13.png");
		sprSpr_2_2.setTextID("Spr_2_2");
		sprSpr_2_2.setPos(988, -139, 50);
		sprSpr_2_2.addState(sprSpr_2_2.new State("Idle", 1, 0.0f));
		sprSpr_2_2.load();
		sprSpr_2_2.setCurState(0);
		sprSpr_2_2.setCurFrame(0);
		p_ctxUnder.addChild(sprSpr_2_2, false, false);

		/*DATA_CUSTOM_SPRITE_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|DEFAULT_STATE|DEFAULT_FRAME|NB_STATES|STATE_NAME|STATE_NB_FRAMES|STATE_SPEED*/
		/*DATA:16|com.bianisoft.games.jigsawpuzzle.SprPiece|Spr_3_2|/resPuzzle1/Sprites/Game/Puzzle1/Puzzle1_25Half_xcf-Pasted_Layer_14.png|651|-70|50|1|0|0|1|Idle|1|0.0|*/
		com.bianisoft.games.jigsawpuzzle.SprPiece sprSpr_3_2= new com.bianisoft.games.jigsawpuzzle.SprPiece("/resPuzzle1/Sprites/Game/Puzzle1/Puzzle1_25Half_xcf-Pasted_Layer_14.png");
		sprSpr_3_2.setTextID("Spr_3_2");
		sprSpr_3_2.setPos(651, -70, 50);
		sprSpr_3_2.addState(sprSpr_3_2.new State("Idle", 1, 0.0f));
		sprSpr_3_2.load();
		sprSpr_3_2.setCurState(0);
		sprSpr_3_2.setCurFrame(0);
		p_ctxUnder.addChild(sprSpr_3_2, false, false);

		/*DATA_CUSTOM_SPRITE_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|DEFAULT_STATE|DEFAULT_FRAME|NB_STATES|STATE_NAME|STATE_NB_FRAMES|STATE_SPEED*/
		/*DATA:17|com.bianisoft.games.jigsawpuzzle.SprPiece|Spr_4_2|/resPuzzle1/Sprites/Game/Puzzle1/Puzzle1_25Half_xcf-Pasted_Layer_15.png|778|-135|50|1|0|0|1|Idle|1|0.0|*/
		com.bianisoft.games.jigsawpuzzle.SprPiece sprSpr_4_2= new com.bianisoft.games.jigsawpuzzle.SprPiece("/resPuzzle1/Sprites/Game/Puzzle1/Puzzle1_25Half_xcf-Pasted_Layer_15.png");
		sprSpr_4_2.setTextID("Spr_4_2");
		sprSpr_4_2.setPos(778, -135, 50);
		sprSpr_4_2.addState(sprSpr_4_2.new State("Idle", 1, 0.0f));
		sprSpr_4_2.load();
		sprSpr_4_2.setCurState(0);
		sprSpr_4_2.setCurFrame(0);
		p_ctxUnder.addChild(sprSpr_4_2, false, false);

		/*DATA_CUSTOM_SPRITE_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|DEFAULT_STATE|DEFAULT_FRAME|NB_STATES|STATE_NAME|STATE_NB_FRAMES|STATE_SPEED*/
		/*DATA:18|com.bianisoft.games.jigsawpuzzle.SprPiece|Spr_0_3|/resPuzzle1/Sprites/Game/Puzzle1/Puzzle1_25Half_xcf-Pasted_Layer_16.png|657|65|50|1|0|0|1|Idle|1|0.0|*/
		com.bianisoft.games.jigsawpuzzle.SprPiece sprSpr_0_3= new com.bianisoft.games.jigsawpuzzle.SprPiece("/resPuzzle1/Sprites/Game/Puzzle1/Puzzle1_25Half_xcf-Pasted_Layer_16.png");
		sprSpr_0_3.setTextID("Spr_0_3");
		sprSpr_0_3.setPos(657, 65, 50);
		sprSpr_0_3.addState(sprSpr_0_3.new State("Idle", 1, 0.0f));
		sprSpr_0_3.load();
		sprSpr_0_3.setCurState(0);
		sprSpr_0_3.setCurFrame(0);
		p_ctxUnder.addChild(sprSpr_0_3, false, false);

		/*DATA_CUSTOM_SPRITE_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|DEFAULT_STATE|DEFAULT_FRAME|NB_STATES|STATE_NAME|STATE_NB_FRAMES|STATE_SPEED*/
		/*DATA:19|com.bianisoft.games.jigsawpuzzle.SprPiece|Spr_1_3|/resPuzzle1/Sprites/Game/Puzzle1/Puzzle1_25Half_xcf-Pasted_Layer_17.png|925|137|50|1|0|0|1|Idle|1|0.0|*/
		com.bianisoft.games.jigsawpuzzle.SprPiece sprSpr_1_3= new com.bianisoft.games.jigsawpuzzle.SprPiece("/resPuzzle1/Sprites/Game/Puzzle1/Puzzle1_25Half_xcf-Pasted_Layer_17.png");
		sprSpr_1_3.setTextID("Spr_1_3");
		sprSpr_1_3.setPos(925, 137, 50);
		sprSpr_1_3.addState(sprSpr_1_3.new State("Idle", 1, 0.0f));
		sprSpr_1_3.load();
		sprSpr_1_3.setCurState(0);
		sprSpr_1_3.setCurFrame(0);
		p_ctxUnder.addChild(sprSpr_1_3, false, false);

		/*DATA_CUSTOM_SPRITE_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|DEFAULT_STATE|DEFAULT_FRAME|NB_STATES|STATE_NAME|STATE_NB_FRAMES|STATE_SPEED*/
		/*DATA:20|com.bianisoft.games.jigsawpuzzle.SprPiece|Spr_2_3|/resPuzzle1/Sprites/Game/Puzzle1/Puzzle1_25Half_xcf-Pasted_Layer_18.png|977|66|50|1|0|0|1|Idle|1|0.0|*/
		com.bianisoft.games.jigsawpuzzle.SprPiece sprSpr_2_3= new com.bianisoft.games.jigsawpuzzle.SprPiece("/resPuzzle1/Sprites/Game/Puzzle1/Puzzle1_25Half_xcf-Pasted_Layer_18.png");
		sprSpr_2_3.setTextID("Spr_2_3");
		sprSpr_2_3.setPos(977, 66, 50);
		sprSpr_2_3.addState(sprSpr_2_3.new State("Idle", 1, 0.0f));
		sprSpr_2_3.load();
		sprSpr_2_3.setCurState(0);
		sprSpr_2_3.setCurFrame(0);
		p_ctxUnder.addChild(sprSpr_2_3, false, false);

		/*DATA_CUSTOM_SPRITE_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|DEFAULT_STATE|DEFAULT_FRAME|NB_STATES|STATE_NAME|STATE_NB_FRAMES|STATE_SPEED*/
		/*DATA:21|com.bianisoft.games.jigsawpuzzle.SprPiece|Spr_3_3|/resPuzzle1/Sprites/Game/Puzzle1/Puzzle1_25Half_xcf-Pasted_Layer_19.png|961|-30|50|1|0|0|1|Idle|1|0.0|*/
		com.bianisoft.games.jigsawpuzzle.SprPiece sprSpr_3_3= new com.bianisoft.games.jigsawpuzzle.SprPiece("/resPuzzle1/Sprites/Game/Puzzle1/Puzzle1_25Half_xcf-Pasted_Layer_19.png");
		sprSpr_3_3.setTextID("Spr_3_3");
		sprSpr_3_3.setPos(961, -30, 50);
		sprSpr_3_3.addState(sprSpr_3_3.new State("Idle", 1, 0.0f));
		sprSpr_3_3.load();
		sprSpr_3_3.setCurState(0);
		sprSpr_3_3.setCurFrame(0);
		p_ctxUnder.addChild(sprSpr_3_3, false, false);

		/*DATA_CUSTOM_SPRITE_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|DEFAULT_STATE|DEFAULT_FRAME|NB_STATES|STATE_NAME|STATE_NB_FRAMES|STATE_SPEED*/
		/*DATA:22|com.bianisoft.games.jigsawpuzzle.SprPiece|Spr_4_3|/resPuzzle1/Sprites/Game/Puzzle1/Puzzle1_25Half_xcf-Pasted_Layer_20.png|608|-184|50|1|0|0|1|Idle|1|0.0|*/
		com.bianisoft.games.jigsawpuzzle.SprPiece sprSpr_4_3= new com.bianisoft.games.jigsawpuzzle.SprPiece("/resPuzzle1/Sprites/Game/Puzzle1/Puzzle1_25Half_xcf-Pasted_Layer_20.png");
		sprSpr_4_3.setTextID("Spr_4_3");
		sprSpr_4_3.setPos(608, -184, 50);
		sprSpr_4_3.addState(sprSpr_4_3.new State("Idle", 1, 0.0f));
		sprSpr_4_3.load();
		sprSpr_4_3.setCurState(0);
		sprSpr_4_3.setCurFrame(0);
		p_ctxUnder.addChild(sprSpr_4_3, false, false);

		/*DATA_CUSTOM_SPRITE_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|DEFAULT_STATE|DEFAULT_FRAME|NB_STATES|STATE_NAME|STATE_NB_FRAMES|STATE_SPEED*/
		/*DATA:23|com.bianisoft.games.jigsawpuzzle.SprPiece|Spr_0_4|/resPuzzle1/Sprites/Game/Puzzle1/Puzzle1_25Half_xcf-Pasted_Layer_21.png|574|121|50|1|0|0|1|Idle|1|0.0|*/
		com.bianisoft.games.jigsawpuzzle.SprPiece sprSpr_0_4= new com.bianisoft.games.jigsawpuzzle.SprPiece("/resPuzzle1/Sprites/Game/Puzzle1/Puzzle1_25Half_xcf-Pasted_Layer_21.png");
		sprSpr_0_4.setTextID("Spr_0_4");
		sprSpr_0_4.setPos(574, 121, 50);
		sprSpr_0_4.addState(sprSpr_0_4.new State("Idle", 1, 0.0f));
		sprSpr_0_4.load();
		sprSpr_0_4.setCurState(0);
		sprSpr_0_4.setCurFrame(0);
		p_ctxUnder.addChild(sprSpr_0_4, false, false);

		/*DATA_CUSTOM_SPRITE_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|DEFAULT_STATE|DEFAULT_FRAME|NB_STATES|STATE_NAME|STATE_NB_FRAMES|STATE_SPEED*/
		/*DATA:24|com.bianisoft.games.jigsawpuzzle.SprPiece|Spr_1_4|/resPuzzle1/Sprites/Game/Puzzle1/Puzzle1_25Half_xcf-Pasted_Layer_22.png|878|109|50|1|0|0|1|Idle|1|0.0|*/
		com.bianisoft.games.jigsawpuzzle.SprPiece sprSpr_1_4= new com.bianisoft.games.jigsawpuzzle.SprPiece("/resPuzzle1/Sprites/Game/Puzzle1/Puzzle1_25Half_xcf-Pasted_Layer_22.png");
		sprSpr_1_4.setTextID("Spr_1_4");
		sprSpr_1_4.setPos(878, 109, 50);
		sprSpr_1_4.addState(sprSpr_1_4.new State("Idle", 1, 0.0f));
		sprSpr_1_4.load();
		sprSpr_1_4.setCurState(0);
		sprSpr_1_4.setCurFrame(0);
		p_ctxUnder.addChild(sprSpr_1_4, false, false);

		/*DATA_CUSTOM_SPRITE_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|DEFAULT_STATE|DEFAULT_FRAME|NB_STATES|STATE_NAME|STATE_NB_FRAMES|STATE_SPEED*/
		/*DATA:25|com.bianisoft.games.jigsawpuzzle.SprPiece|Spr_2_4|/resPuzzle1/Sprites/Game/Puzzle1/Puzzle1_25Half_xcf-Pasted_Layer_23.png|1049|74|50|1|0|0|1|Idle|1|0.0|*/
		com.bianisoft.games.jigsawpuzzle.SprPiece sprSpr_2_4= new com.bianisoft.games.jigsawpuzzle.SprPiece("/resPuzzle1/Sprites/Game/Puzzle1/Puzzle1_25Half_xcf-Pasted_Layer_23.png");
		sprSpr_2_4.setTextID("Spr_2_4");
		sprSpr_2_4.setPos(1049, 74, 50);
		sprSpr_2_4.addState(sprSpr_2_4.new State("Idle", 1, 0.0f));
		sprSpr_2_4.load();
		sprSpr_2_4.setCurState(0);
		sprSpr_2_4.setCurFrame(0);
		p_ctxUnder.addChild(sprSpr_2_4, false, false);

		/*DATA_CUSTOM_SPRITE_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|DEFAULT_STATE|DEFAULT_FRAME|NB_STATES|STATE_NAME|STATE_NB_FRAMES|STATE_SPEED*/
		/*DATA:26|com.bianisoft.games.jigsawpuzzle.SprPiece|Spr_3_4|/resPuzzle1/Sprites/Game/Puzzle1/Puzzle1_25Half_xcf-Pasted_Layer_24.png|681|-23|50|1|0|0|1|Idle|1|0.0|*/
		com.bianisoft.games.jigsawpuzzle.SprPiece sprSpr_3_4= new com.bianisoft.games.jigsawpuzzle.SprPiece("/resPuzzle1/Sprites/Game/Puzzle1/Puzzle1_25Half_xcf-Pasted_Layer_24.png");
		sprSpr_3_4.setTextID("Spr_3_4");
		sprSpr_3_4.setPos(681, -23, 50);
		sprSpr_3_4.addState(sprSpr_3_4.new State("Idle", 1, 0.0f));
		sprSpr_3_4.load();
		sprSpr_3_4.setCurState(0);
		sprSpr_3_4.setCurFrame(0);
		p_ctxUnder.addChild(sprSpr_3_4, false, false);

		/*DATA_CUSTOM_SPRITE_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|DEFAULT_STATE|DEFAULT_FRAME|NB_STATES|STATE_NAME|STATE_NB_FRAMES|STATE_SPEED*/
		/*DATA:27|com.bianisoft.games.jigsawpuzzle.SprPiece|Spr_4_4|/resPuzzle1/Sprites/Game/Puzzle1/Puzzle1_25Half_xcf-Pasted_Layer_25.png|829|-20|50|1|0|0|1|Idle|1|0.0|*/
		com.bianisoft.games.jigsawpuzzle.SprPiece sprSpr_4_4= new com.bianisoft.games.jigsawpuzzle.SprPiece("/resPuzzle1/Sprites/Game/Puzzle1/Puzzle1_25Half_xcf-Pasted_Layer_25.png");
		sprSpr_4_4.setTextID("Spr_4_4");
		sprSpr_4_4.setPos(829, -20, 50);
		sprSpr_4_4.addState(sprSpr_4_4.new State("Idle", 1, 0.0f));
		sprSpr_4_4.load();
		sprSpr_4_4.setCurState(0);
		sprSpr_4_4.setCurFrame(0);
		p_ctxUnder.addChild(sprSpr_4_4, false, false);
	}
}
