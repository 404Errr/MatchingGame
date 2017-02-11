package main;

import java.awt.Font;
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
		drawCurrentImage();
		drawChoices();
	}

	private void drawChoices() {
		if (Game.getCurrentItemSet()!=null) {
			g.setFont(new Font("Helvetica", Font.BOLD, 20));
			for (int i = 0;i<Game.getCurrentItemSet().getChoices().size();i++) {
				g.drawString(Game.getCurrentItemSet().getChoices().get(i).getName(), 10, Data.IMAGE_SIZE+30+(20*i));//FIXME
			}
		}
	}

	private void drawCurrentImage() {
		if (Game.getCurrentItemSet()!=null&&Game.getCurrentItemSet().getActiveItem()!=null) {//null check
			BufferedImage image = Game.getCurrentItemSet().getActiveItem().getPicture();
			g.drawImage(image, 10, 10, Data.IMAGE_SIZE*(image.getWidth()/image.getHeight()), Data.IMAGE_SIZE, null);
		}
	}
}