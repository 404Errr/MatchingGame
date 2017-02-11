package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ItemList {
	private ArrayList<Item> items = new ArrayList<>();

	public ItemList(ArrayList<Item> items) {

		for (Item item:items) {
			this.items.add(item);
		}
		Collections.shuffle(this.items);
		System.out.println("New item list: "+this.items);
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public Item getNextItem() {//returns (and removes) the first item in items
		return items.remove(0);
	}

	public Item getRandomItem() {//returns a random item from items
		//FIXME duplicates
		return items.get(new Random().nextInt(items.size()));
	}

//	public Item getRandomItem() {//returns a random item from items and removes it from the list
//		return items.remove(new Random().nextInt(items.size()));
//	}

}