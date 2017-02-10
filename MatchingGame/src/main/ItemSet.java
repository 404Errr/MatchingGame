package main;

import java.util.ArrayList;

public class ItemSet {
	private ArrayList<Item> itemsChoices = new ArrayList<>();
	Item activeItem;

	public ItemSet(ArrayList<Item> itemsChoices, Item activeItem) {
		this.itemsChoices = itemsChoices;
		this.activeItem = activeItem;
	}


}
