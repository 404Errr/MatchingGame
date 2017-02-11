package item;

import java.util.ArrayList;

import data.Data;

public class Items {
	private static ArrayList<Item> items = new ArrayList<>();

	public static void init() {
		System.out.println("Init items");
		items = Data.getItems();
	}

	public static ArrayList<Item> getItems() {
		return items;
	}
}
