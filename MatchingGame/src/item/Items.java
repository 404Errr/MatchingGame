package item;

import java.util.ArrayList;

import data.Data;
import data.ItemData;

public class Items {
	private static ArrayList<Item> items = new ArrayList<>();

	public static void init() {
		System.out.println("Init items");
		items = ItemData.getItems();
		if (Data.CHOICE_COUNT>=items.size()) {
			System.out.println("Too many choices: ("+items.size()+"/"+Data.CHOICE_COUNT+")");
			System.exit(0);
		}
	}

	public static ArrayList<Item> getItems() {
		return items;
	}
}
