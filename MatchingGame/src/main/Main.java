package main;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;


public class Main {
	static int SCREEN_HEIGHT, SCREEN_WIDTH, WINDOW_HEIGHT, WINDOW_WIDTH, UI_HEIGHT, UI_WIDTH;
	
	static {
		GraphicsDevice screen = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
		int width = screen.getDisplayMode().getWidth(), height = screen.getDisplayMode().getHeight();
		SCREEN_WIDTH = width-100;
		SCREEN_HEIGHT = height-200;
		WINDOW_WIDTH = SCREEN_WIDTH+3+3;
		WINDOW_HEIGHT = SCREEN_HEIGHT+25+3;
		System.out.println("WxH: "+width+"x"+height);
	}

	static final int UPS = 60;

	static boolean RUNNING = true;
	private static UpdateLoop updateLoop;

	public static void main(String[] args) {
		updateLoop = new UpdateLoop();
		Window.init();
		Thread update = new Thread(updateLoop, "TD Update");
		update.start();
	}
}
