package main;

public class Game {
	private static ItemList itemList;
	private static ItemSet currentItemSet;

	public Game() {
		System.out.println("New game");
		itemList = new ItemList(Items.getItems());
		newSet();
	}

	public static void newSet() {
		System.out.println("New Set");
		currentItemSet = new ItemSet(itemList);
	}

	public static ItemList getItemList() {
		return itemList;
	}

	public static ItemSet getCurrentItemSet() {
		return currentItemSet;
	}
}
