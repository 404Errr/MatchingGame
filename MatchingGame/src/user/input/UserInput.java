package user.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import main.Game;
import user.Cursor;

public class UserInput implements KeyListener, MouseMotionListener, MouseListener, MouseWheelListener {
	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode()==KeyEvent.VK_1) {
			Game.getCurrentItemSet().choiceSelected(0);
		}
		if (e.getKeyCode()==KeyEvent.VK_2) {
			Game.getCurrentItemSet().choiceSelected(1);
		}
		if (e.getKeyCode()==KeyEvent.VK_3) {
			Game.getCurrentItemSet().choiceSelected(2);
		}
		if (e.getKeyCode()==KeyEvent.VK_4) {
			Game.getCurrentItemSet().choiceSelected(3);
		}
		if (e.getKeyCode()==KeyEvent.VK_5) {
			Game.getCurrentItemSet().choiceSelected(4);
		}
		if (e.getKeyCode()==KeyEvent.VK_6) {
			Game.getCurrentItemSet().choiceSelected(5);
		}
		if (e.getKeyCode()==KeyEvent.VK_7) {
			Game.getCurrentItemSet().choiceSelected(6);
		}
		if (e.getKeyCode()==KeyEvent.VK_8) {
			Game.getCurrentItemSet().choiceSelected(7);
		}
		if (e.getKeyCode()==KeyEvent.VK_9) {
			Game.getCurrentItemSet().choiceSelected(8);
		}
		if (e.getKeyCode()==KeyEvent.VK_0) {
			Game.getCurrentItemSet().choiceSelected(9);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

	@Override
	public void keyTyped(KeyEvent e) {}
	@Override
	public void mouseClicked(MouseEvent e) {}
	@Override
	public void mouseDragged(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
	@Override
	public void mouseMoved(MouseEvent e) {Cursor.updateMouse(e);}
	@Override
	public void mousePressed(MouseEvent e) {Cursor.updateMouse(e);Cursor.click(e, true);}
	@Override
	public void mouseReleased(MouseEvent e) {Cursor.updateMouse(e);Cursor.click(e, false);}
	@Override
	public void mouseWheelMoved(MouseWheelEvent arg0) {}
}
