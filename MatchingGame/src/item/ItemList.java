package item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import data.Data;

public class ItemList implements Data {
	private ArrayList<Item> items = new ArrayList<>(), itemOptions = new ArrayList<>();

	public ItemList(List<Item> list) {
		resetList();
		System.out.println("New item list: "+list);
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void resetOptions() {
		itemOptions.clear();
		List<Item> list = Items.getItems();
		if (!REPEATING_SETS) list = items;
		for (Item item:list) {
			itemOptions.add(item);
		}
		shuffleLists();
	}

	private void resetList() {
		items.clear();
		itemOptions.clear();
		for (Item item:Items.getItems()) {
			items.add(item);
			itemOptions.add(item);
		}
		shuffleLists();
	}

	private void shuffleLists() {
		int seed = new Random().nextInt();
		Collections.shuffle(items, new Random(seed));
		Collections.shuffle(itemOptions, new Random(seed));
	}

	public Item getNextItem() {
		Item nextItem = items.get(0);
		if (!REPEATING_SETS) items.remove(nextItem);
		itemOptions.remove(nextItem);
		return nextItem;
	}

	public Item getRandomItem() {
		Item item = itemOptions.get(new Random().nextInt(itemOptions.size()));
		itemOptions.remove(item);
		return item;
	}

}