package main;

import item.ItemList;
import item.ItemSet;
import item.Items;

public class Game {
	private static ItemList itemList;
	private static ItemSet currentItemSet;
	private static int playerScore;

	public static void init() {
		itemList = new ItemList(Items.getItems());
		newSet();
	}

	public static int getPlayerScore() {
		return playerScore;
	}

	public static void changePlayerScore(int dPlayerScore) {
		playerScore+=dPlayerScore;
	}

	public static void newSet() {
		itemList.resetOptions();
		currentItemSet = new ItemSet(itemList);
	}

	public static ItemList getItemList() {
		return itemList;
	}

	public static ItemSet getCurrentItemSet() {
		return currentItemSet;
	}
}
