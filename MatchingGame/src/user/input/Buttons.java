package user.input;

import java.util.ArrayList;

import data.Data;

public class Buttons {
	private static ArrayList<Button> buttons = new ArrayList<>();

	public static ArrayList<Button> getButtons() {
		return buttons;
	}

	public static void init() {
		for (int i = 0;i<Data.CHOICE_COUNT;i++) {
			buttons.add(new Button(i));
		}
	}
}
