package user.input;

import java.awt.Rectangle;

import data.Data;
import main.Game;
import user.Cursor;

public class Button implements Data {
	protected Rectangle bounds;
	int id;
	protected boolean hovered, pressed;

	public Button(int pos) {
		bounds = new Rectangle(UI_PADDING, IMAGE_SIZE+(UI_PADDING*4)+((UI_BUTTON_HEIGHT+UI_PADDING)*pos), IMAGE_SIZE*3/4, UI_BUTTON_HEIGHT);
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
			Game.getCurrentItemSet().choiceSelected(id);
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
