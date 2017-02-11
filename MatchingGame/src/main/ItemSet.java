package main;

import java.util.ArrayList;

import data.Data;

public class ItemSet {
	private ArrayList<Item> itemChoices = new ArrayList<>();
	private Item activeItem;

	public ItemSet(ItemList itemList) {//TODO
		itemChoices.add(itemList.getNextItem());
		for (int i = 0;i<Data.CHOICE_COUNT-1;i++) {
			itemChoices.add(itemList.getRandomItem());
		}
	}

	public ArrayList<Item> getItemChoices() {
		return itemChoices;
	}

	public Item getActiveItem() {
		return activeItem;
	}
}
