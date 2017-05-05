package user;

import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.SwingUtilities;

import main.Window;
import user.input.Button;
import user.input.Buttons;

public class Cursor {
	private static int x, y;

	public static void click(MouseEvent e, boolean down) {
		ArrayList<Button> buttons = Buttons.getButtons();
		for (int i = 0;i<buttons.size();i++) {
			Button b = buttons.get(i);
			b.updatePress(down);
		}
	}

	public static void updateMouse(MouseEvent e) {
		e = SwingUtilities.convertMouseEvent(Window.getFrame(), e, Window.getRenderer());
		x = e.getX();
		y = e.getY();
	}

	public static int getX() {
		return x;
	}

	public static int getY() {
		return y;
	}
}