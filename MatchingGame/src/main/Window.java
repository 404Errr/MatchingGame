package main;

import java.awt.GridLayout;

import javax.swing.JFrame;

import user.input.UserInput;

@SuppressWarnings("serial")
public class Window extends JFrame {
	private static JFrame frame;
	private static UserInput input;
	static Renderer renderer;

	static void init() {
		renderer = new Renderer();
		input = new UserInput();
		frame = new JFrame();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout());
		frame.setExtendedState(MAXIMIZED_BOTH);
//		frame.setSize(Main.getWINDOW_WIDTH(), Main.getWINDOW_HEIGHT());
//		frame.setTitle(Main.getWINDOW_WIDTH()+"x"+Main.getWINDOW_HEIGHT());
		frame.setTitle("Blah");
		frame.setLocationRelativeTo(null);
		frame.addKeyListener(input);
		frame.addMouseMotionListener(input);
		frame.addMouseListener(input);
		frame.addMouseWheelListener(input);
		frame.add(renderer);
		frame.setVisible(true);
	}

	public static JFrame getFrame() {
		return frame;
	}

	public static Renderer getRenderer() {
		return renderer;
	}	
}
