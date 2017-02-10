package main;

import java.awt.Graphics;
import java.awt.Graphics2D;

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
		g.drawImage(Data.getItems().get(2).picture, 10, 10, 400, 400, null);
	}
}