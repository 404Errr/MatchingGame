package item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import data.Data;

public class ItemList implements Data {
	private ArrayList<Item> items = new ArrayList<>(), itemOptions = new ArrayList<>();

	public ItemList(ArrayList<Item> items) {
		resetList();
		System.out.println("New item list: "+this.items);
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void resetOptions() {
		itemOptions.clear();
		if (!REPEATING_CHOICES) {
			for (Item item:items) {
				this.itemOptions.add(item);
			}
		}
		else {
			for (Item item:Items.getItems()) {
				this.itemOptions.add(item);
			}
		}
		shuffleLists();
	}

	private void resetList() {
		items.clear();
		itemOptions.clear();
		for (Item item:Items.getItems()) {
			this.items.add(item);
			this.itemOptions.add(item);
		}
		shuffleLists();
	}

	private void shuffleLists() {
		int seed = new Random().nextInt();
		Collections.shuffle(this.items, new Random(seed));
		Collections.shuffle(this.itemOptions, new Random(seed));
	}

	public Item getNextItem() {//returns (and removes) the first item in items
		Item nextItem = items.get(0);
		if (!REPEATING_CHOICES) {
			items.remove(nextItem);
		}
		itemOptions.remove(nextItem);
		return nextItem;
	}

	public Item getRandomItem() {//returns a random item from items
		Item item = itemOptions.get(new Random().nextInt(itemOptions.size()));
		itemOptions.remove(item);
		return item;
	}

}