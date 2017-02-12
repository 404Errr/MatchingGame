package data;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.imageio.ImageIO;

import item.Item;

public class ItemData {

	private static final String PATH = "src/data/pictures/", EXT = ".png";

	public static ArrayList<Item> getItems() {
		ArrayList<Item> items = new ArrayList<>();
		try {
			items.addAll(Arrays.asList(
				//									picture location	name
				new Item(ImageIO.read(new File(PATH+"black"+EXT)),		"black"),
				new Item(ImageIO.read(new File(PATH+"blue"+EXT)),		"blue"),
				new Item(ImageIO.read(new File(PATH+"cyan"+EXT)),		"cyan"),
				new Item(ImageIO.read(new File(PATH+"dark_grey"+EXT)),	"light_black"),
				new Item(ImageIO.read(new File(PATH+"green"+EXT)),		"green"),
				new Item(ImageIO.read(new File(PATH+"light_grey"+EXT)),	"dark_white"),
				new Item(ImageIO.read(new File(PATH+"orange"+EXT)),		"orange"),
				new Item(ImageIO.read(new File(PATH+"purple"+EXT)),		"purple"),
				new Item(ImageIO.read(new File(PATH+"red"+EXT)),		"red"),
				new Item(ImageIO.read(new File(PATH+"white"+EXT)),		"white"),
				new Item(ImageIO.read(new File(PATH+"yellow"+EXT)),		"yellow")
			));
		}
		catch (IOException e) {
			System.out.println("Issue with loading images.");
			System.exit(0);
		}
		return items;
	}
}
