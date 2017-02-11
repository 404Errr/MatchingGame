package main;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import data.Data;

@SuppressWarnings("serial")
public class Renderer extends JPanel {
	private Graphics2D g;

	@Override
	public void paint(Graphics g0) {
		g = (Graphics2D) g0;
		super.paintComponent(g);
		drawCurrentImage(g);
	}

	private void drawCurrentImage(Graphics2D g2) {
		if (Game.getCurrentItemSet()!=null&&Game.getCurrentItemSet().getActiveItem()!=null) {//null check
			BufferedImage image = Game.getCurrentItemSet().getActiveItem().picture;
			g.drawImage(image, 10, 10, Data.IMAGE_SIZE*(image.getWidth()/image.getHeight()), Data.IMAGE_SIZE, null);
		}
	}
}