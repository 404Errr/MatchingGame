package data;

import java.awt.Color;

public interface Data {
	public static final int IMAGE_SIZE = 400, UI_PADDING = 20, UI_BUTTON_HEIGHT = 40;

	public static final Color COLOR_UI_BUTTON = new Color(50,50,255,255);
	public static final Color COLOR_UI_BUTTON_HOVERED = new Color(100,100,255,255);

	public static final int CHOICE_COUNT = 6;
	public static final boolean SHOW_CORRECT = false, REPEATING_SETS = true;

	public static final int REWARD_CORRECT = 1, REWARD_INCORRECT = -1;

}
