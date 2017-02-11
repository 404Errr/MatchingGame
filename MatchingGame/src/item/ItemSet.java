package item;

import java.util.ArrayList;
import java.util.Collections;

import data.Data;
import main.Game;

public class ItemSet implements Data {
	private ArrayList<Item> itemChoices = new ArrayList<>();
	private Item correctItem;

	public ItemSet(ItemList itemList) {//TODO
		itemChoices.add(itemList.getNextItem());
		for (int i = 0;i<CHOICE_COUNT-1;i++) {
			itemChoices.add(itemList.getRandomItem());
		}
		correctItem = itemChoices.get(0);
		Collections.shuffle(itemChoices);
		System.out.println("New Set: |"+correctItem+"| "+itemChoices);
	}

	public void choiceSelected(int button) {
		if (button>=itemChoices.size()) return;//out of bounds check
		System.out.print("button "+button+" pressed - ");
		if (itemChoices.get(button)==correctItem) {//if correct choice
			System.out.println("correct");
			Game.changePlayerScore(REWARD_CORRECT);
		}
		else {//if incorrect choice
			System.out.println("incorrect");
			Game.changePlayerScore(REWARD_INCORRECT);
		}
		Game.newSet();
	}

	public ArrayList<Item> getChoices() {
		return itemChoices;
	}

	public Item getCorrectItem() {
		return correctItem;
	}
}
