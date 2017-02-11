package user.input;

import java.awt.Rectangle;

import data.Data;
import main.Game;
import user.Cursor;

public class Button {
	protected Rectangle bounds;
	int id;
	protected boolean hovered, pressed;

	public Button(int pos) {
		bounds = new Rectangle(Data.UI_PADDING, Data.IMAGE_SIZE+(Data.UI_PADDING*2)+((Data.UI_BUTTON_HEIGHT+Data.UI_PADDING)*pos), Data.IMAGE_SIZE*3/4, Data.UI_BUTTON_HEIGHT);
		id = pos;
	}

	public Rectangle getBounds() {
		return bounds;
	}

	public boolean isHovered() {
		return hovered;
	}

	public boolean isPressed() {
		return pressed;
	}

	public void updatePress(boolean down) {
		if (down&&bounds.contains(Cursor.getX(), Cursor.getY())) {
			pressed = true;
			Game.getCurrentItemSet().buttonPressed(id);
		}
		else {
			pressed = false;
		}
	}

	public void tick() {
		if (bounds.contains(Cursor.getX(), Cursor.getY())) {
			hovered = true;
		}
		else {
			hovered = false;
		}
	}
}
