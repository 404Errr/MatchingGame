package main;

import java.awt.image.BufferedImage;

public class Item {
	BufferedImage picture;
	String name;

	public Item(BufferedImage picture, String name) {
		this.picture = picture;
		this.name = name;
	}

	public BufferedImage getPicture() {
		return picture;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name;
	}
}
