package data;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.imageio.ImageIO;

import main.Item;

public class Data {
	static final String picturePath = "src/data/pictures/", pictureExt = ".png";

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
