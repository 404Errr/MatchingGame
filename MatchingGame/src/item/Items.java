package item;

import java.util.List;

import data.Data;
import data.ItemData;

public class Items {
	private static List<Item> items;

	public static void init() {
		items = ItemData.getItems();
		if (Data.CHOICE_COUNT>=items.size()) {
			System.out.println("Too many choices: ("+items.size()+"/"+Data.CHOICE_COUNT+")");
			System.exit(0);
		}
	}

	public static List<Item> getItems() {
		return items;
	}
}
