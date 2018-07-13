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


public class DesignCtxGame {
	public static void load(Context p_ctxUnder){
		/*DATA_BACKGROUND_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS*/
		/*DATA:0|Background|Bk_Game|/res/Backs/Game/BkGame.png|0|0|100|0|*/
		Background backBk_Game= new Background("/res/Backs/Game/BkGame.png");
		backBk_Game.setTextID("Bk_Game");
		backBk_Game.setPos(0, 0, 100);
		backBk_Game.load();
		p_ctxUnder.addChild(backBk_Game, true, true);

		/*DATA_BACKGROUND_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS*/
		/*DATA:1|Background|BkGameBorder|/res/Backs/Game/BkGameBorder.png|-100|0|99|1|*/
		Background backBkGameBorder= new Background("/res/Backs/Game/BkGameBorder.png");
		backBkGameBorder.setTextID("BkGameBorder");
		backBkGameBorder.setPos(-100, 0, 99);
		backBkGameBorder.load();
		p_ctxUnder.addChild(backBkGameBorder, false, false);

		/*DATA_BUTTON_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|STATEIDLE_NB_FRAMES|IDLE_SPEED|STATEOVER_NB_FRAMES|STATEOVER_SPEED|STATEDOWN_NB_FRAMES|STATEDOWN_SPEED|STATESELECTED_NB_FRAMES|STATESELECTED_SPEED*/
		/*DATA:30|Button|Bt_RotateClockwise|/res/Sprites/Game/Bt_RotateClockwise.png|20|285|1|1|1|0.0|1|0.0|1|0.0|1|0.0|*/
		Button btBt_RotateClockwise= new Button("/res/Sprites/Game/Bt_RotateClockwise.png", 1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
		btBt_RotateClockwise.setTextID("Bt_RotateClockwise");
		btBt_RotateClockwise.setPos(20, 285, 1);
		btBt_RotateClockwise.load();
		p_ctxUnder.addChild(btBt_RotateClockwise, false, false);
		/*DATA_BUTTON_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|STATEIDLE_NB_FRAMES|IDLE_SPEED|STATEOVER_NB_FRAMES|STATEOVER_SPEED|STATEDOWN_NB_FRAMES|STATEDOWN_SPEED|STATESELECTED_NB_FRAMES|STATESELECTED_SPEED*/
		/*DATA:33|Button|Bt_RotateCounterClockwise|/res/Sprites/Game/Bt_RotateCounterClockwise.png|-20|285|1|1|1|0.0|1|0.0|1|0.0|1|0.0|*/
		Button btBt_RotateCounterClockwise= new Button("/res/Sprites/Game/Bt_RotateCounterClockwise.png", 1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
		btBt_RotateCounterClockwise.setTextID("Bt_RotateCounterClockwise");
		btBt_RotateCounterClockwise.setPos(-20, 285, 1);
		btBt_RotateCounterClockwise.load();
		p_ctxUnder.addChild(btBt_RotateCounterClockwise, false, false);

		/*DATA_LABEL_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|FONT_SIZE|TEXT|ALIGNMENT|MULTILINE|REC_LEFT|REC_TOP|REC_WIDTH|RECT_HEIGHT*/
		/*DATA:34|Label|Lbl_ScoreTxt|/res/Fonts/FreeMonoBold.ttf|-350|-275|1|1|25|Score: |0|false|0|-18|100|37|*/
		Label lblLbl_ScoreTxt= new Label("/res/Fonts/FreeMonoBold.ttf", 25, "Score: ", 0, false, new Rectangle(0, -18, 100, 37));
		lblLbl_ScoreTxt.setTextID("Lbl_ScoreTxt");
		lblLbl_ScoreTxt.setPos(-350, -275, 1);
		lblLbl_ScoreTxt.load();
		p_ctxUnder.addChild(lblLbl_ScoreTxt, false, false);

		/*DATA_LABEL_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|FONT_SIZE|TEXT|ALIGNMENT|MULTILINE|REC_LEFT|REC_TOP|REC_WIDTH|RECT_HEIGHT*/
		/*DATA:35|Label|Lbl_ScoreValue|/res/Fonts/FreeMonoBold.ttf|-125|-275|1|1|25|000000|2|false|-100|-18|100|37|*/
		Label lblLbl_ScoreValue= new Label("/res/Fonts/FreeMonoBold.ttf", 25, "000000", 2, false, new Rectangle(-100, -18, 100, 37));
		lblLbl_ScoreValue.setTextID("Lbl_ScoreValue");
		lblLbl_ScoreValue.setPos(-125, -275, 1);
		lblLbl_ScoreValue.load();
		p_ctxUnder.addChild(lblLbl_ScoreValue, false, false);

		/*DATA_LABEL_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|FONT_SIZE|TEXT|ALIGNMENT|MULTILINE|REC_LEFT|REC_TOP|REC_WIDTH|RECT_HEIGHT*/
		/*DATA:36|Label|Lbl_NextPiecesTxt|/res/Fonts/FreeMonoBold.ttf|280|-275|1|1|30|Next Pieces|1|false|-100|-22|200|45|*/
		Label lblLbl_NextPiecesTxt= new Label("/res/Fonts/FreeMonoBold.ttf", 30, "Next Pieces", 1, false, new Rectangle(-100, -22, 200, 45));
		lblLbl_NextPiecesTxt.setTextID("Lbl_NextPiecesTxt");
		lblLbl_NextPiecesTxt.setPos(280, -275, 1);
		lblLbl_NextPiecesTxt.load();
		p_ctxUnder.addChild(lblLbl_NextPiecesTxt, false, false);

		/*DATA_SPRITE_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|DEFAULT_STATE|DEFAULT_FRAME|NB_STATES|STATE_NAME|STATE_NB_FRAMES|STATE_SPEED*/
		/*DATA:37|Sprite|Spr_Cursor|/res/Sprites/Spr_Cursor32.png|247|212|0|1|0|0|1|Idle|1|0.0|*/
		Sprite sprSpr_Cursor= new Sprite("/res/Sprites/Spr_Cursor32.png");
		sprSpr_Cursor.setTextID("Spr_Cursor");
		sprSpr_Cursor.setPos(247, 212, 0);
		sprSpr_Cursor.addState(sprSpr_Cursor.new State("Idle", 1, 0.0f));
		sprSpr_Cursor.load();
		sprSpr_Cursor.setCurState(0);
		sprSpr_Cursor.setCurFrame(0);
		p_ctxUnder.addChild(sprSpr_Cursor, false, false);

	}
}
