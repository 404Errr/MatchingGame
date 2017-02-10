package main;

import java.awt.GridLayout;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;

public class Window extends JFrame {
	private static JFrame frame;
	private static UserInput input;
	static Renderer renderer;
	static Rectangle2D bounds;

	static void init() {
		renderer = new Renderer();
		input = new UserInput();
		frame = new JFrame();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout());
		frame.setSize(Main.WINDOW_WIDTH, Main.WINDOW_HEIGHT);
		frame.setTitle(Main.WINDOW_WIDTH+"x"+Main.WINDOW_HEIGHT);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.addKeyListener(input);
		frame.addMouseMotionListener(input);
		frame.addMouseListener(input);
		frame.addMouseWheelListener(input);
		frame.add(renderer);
		frame.setVisible(true);
	}
}
