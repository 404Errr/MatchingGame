package main;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

public class Main {
	private static int SCREEN_HEIGHT, SCREEN_WIDTH, WINDOW_HEIGHT, WINDOW_WIDTH;

	static {
		GraphicsDevice screen = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
		int width = screen.getDisplayMode().getWidth(), height = screen.getDisplayMode().getHeight();
		SCREEN_WIDTH = width-100;
		SCREEN_HEIGHT = height-200;
		WINDOW_WIDTH = SCREEN_WIDTH+3+3;
		WINDOW_HEIGHT = SCREEN_HEIGHT+25+3;
		System.out.println("WxH: "+width+"x"+height);
	}

	public static final int UPS = 60;

	public final static boolean RUNNING = true;
	private static UpdateLoop updateLoop;

	private static Game game;

	public static void main(String[] args) {
		updateLoop = new UpdateLoop();
		Window.init();
		Items.init();
		game = new Game();
		Thread update = new Thread(updateLoop, "Loop");
		update.start();
	}

	public static Game getGame() {
		return game;
	}

	public static int getSCREEN_HEIGHT() {
		return SCREEN_HEIGHT;
	}

	public static int getSCREEN_WIDTH() {
		return SCREEN_WIDTH;
	}

	public static int getWINDOW_HEIGHT() {
		return WINDOW_HEIGHT;
	}

	public static int getWINDOW_WIDTH() {
		return WINDOW_WIDTH;
	}

}
