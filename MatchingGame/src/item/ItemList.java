package item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ItemList {
	private ArrayList<Item> items = new ArrayList<>(), itemOptions = new ArrayList<>();

	public ItemList(ArrayList<Item> items) {
		for (Item item:items) {
			this.items.add(item);
			this.itemOptions.add(item);
		}
		Collections.shuffle(this.items);
		System.out.println("New item list: "+this.items);
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public Item getNextItem() {//returns (and removes) the first item in items
		return itemOptions.remove(0);
	}

	public void resetOptions() {
		itemOptions.clear();
		for (Item item:items) {
			itemOptions.add(item);
		}
	}

	public Item getRandomItem() {//returns a random item from items
		Item item = itemOptions.get(new Random().nextInt(itemOptions.size()));
		itemOptions.remove(item);
		return item;
	}

}