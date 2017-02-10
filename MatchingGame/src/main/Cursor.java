package main;

import java.awt.event.MouseEvent;

public class Cursor {
	private static int x, y;

	static void click(MouseEvent e, boolean down) {

	}

	static void updateMouse(MouseEvent e) {
		x = e.getX()-3;//offset 3
		y = e.getY()-25;//offset 25
	}

	static int getX() {
		return x;
	}

	static int getY() {
		return y;
	}
}