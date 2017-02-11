package item;

import java.util.ArrayList;
import java.util.Collections;

import data.Data;
import main.Game;

public class ItemSet {
	private ArrayList<Item> itemChoices = new ArrayList<>();
	private Item correctItem;

	public ItemSet(ItemList itemList) {//TODO
		itemChoices.add(itemList.getNextItem());
		for (int i = 0;i<Data.CHOICE_COUNT-1;i++) {
			itemChoices.add(itemList.getRandomItem());
		}
		correctItem = itemChoices.get(0);
		Collections.shuffle(itemChoices);
		System.out.println("New Set: |"+correctItem+"| "+itemChoices);
	}

	public void buttonPressed(int button) {
		System.out.println("button "+button+" pressed");
		if (itemChoices.get(button)==correctItem) {
			Game.newSet();
		}
	}

	public ArrayList<Item> getChoices() {
		return itemChoices;
	}

	public Item getCorrectItem() {
		return correctItem;
	}
}
