package data;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.imageio.ImageIO;

import item.Item;

public class Data {
	private static final String picturePath = "src/data/pictures/", pictureExt = ".png";

	public static final boolean SHOW_CORRECT = true;

	public static final int IMAGE_SIZE = 400, UI_PADDING = 20, UI_BUTTON_HEIGHT = 40;

	public static final Color COLOR_UI_BUTTON = new Color(50,50,255,255);
	public static final Color COLOR_UI_BUTTON_HOVERED = new Color(100,100,255,255);

	public static final int CHOICE_COUNT = 6;

	public static ArrayList<Item> getItems() {
		ArrayList<Item> items = new ArrayList<>();
		try {
			items.addAll(Arrays.asList(
				//picture, name
				new Item(ImageIO.read(new File(picturePath+"black"+pictureExt)), "black"),
				new Item(ImageIO.read(new File(picturePath+"blue"+pictureExt)), "blue"),
				new Item(ImageIO.read(new File(picturePath+"cyan"+pictureExt)), "cyan"),
				new Item(ImageIO.read(new File(picturePath+"dark_grey"+pictureExt)), "dark_grey"),
				new Item(ImageIO.read(new File(picturePath+"green"+pictureExt)), "green"),
				new Item(ImageIO.read(new File(picturePath+"light_grey"+pictureExt)), "light_grey"),
				new Item(ImageIO.read(new File(picturePath+"orange"+pictureExt)), "orange"),
				new Item(ImageIO.read(new File(picturePath+"purple"+pictureExt)), "purple"),
				new Item(ImageIO.read(new File(picturePath+"red"+pictureExt)), "red"),
				new Item(ImageIO.read(new File(picturePath+"white"+pictureExt)), "white"),
				new Item(ImageIO.read(new File(picturePath+"yellow"+pictureExt)), "yellow")
			));
		}
		catch (IOException e) {
			System.out.println("Issue with loading images.");
			System.exit(0);
		}
		return items;
	}
}
