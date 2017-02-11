package main;

import item.ItemList;
import item.ItemSet;
import item.Items;

public class Game {
	private static ItemList itemList;
	private static ItemSet currentItemSet;

	public static void init() {
		itemList = new ItemList(Items.getItems());
		newSet();
	}

	public static void newSet() {
		currentItemSet = new ItemSet(itemList);
	}

	public static ItemList getItemList() {
		return itemList;
	}

	public static ItemSet getCurrentItemSet() {
		return currentItemSet;
	}
}
