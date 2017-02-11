package item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ItemList {
	private ArrayList<Item> items = new ArrayList<>(), itemOptions = new ArrayList<>();

	public ItemList(ArrayList<Item> items) {
		resetList();
		System.out.println("New item list: "+this.items);
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public Item getNextItem() {//returns (and removes) the first item in items
		return itemOptions.remove(0);
	}

	public void resetList() {
		items.clear();
		itemOptions.clear();
		for (Item item:Items.getItems()) {
			this.items.add(item);
			this.itemOptions.add(item);
		}
		int seed = new Random().nextInt();
		Collections.shuffle(this.items, new Random(seed));
		Collections.shuffle(this.itemOptions, new Random(seed));
	}

	public Item getRandomItem() {//returns a random item from items
		Item item = itemOptions.get(new Random().nextInt(itemOptions.size()));
		itemOptions.remove(item);
		return item;
	}

}