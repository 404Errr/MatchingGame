package main;

import java.util.ArrayList;
import java.util.Random;

public class ItemList {
	private ArrayList<Item> items = new ArrayList<>();

	public ItemList(ArrayList<Item> items) {
		for (Item item:items) {
			this.items.add(item);
		}
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public Item getRandomItem() {//returns a random item from items and removes it from the list
		return items.remove(new Random().nextInt(items.size()));
	}

}