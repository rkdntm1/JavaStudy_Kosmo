package step01_recursonTree;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class DrawTreeFrame extends JFrame {

	public DrawTreeFrame() {
		setSize(800, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);		
	}
	
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.BLACK); // 붓에 검정 물감 찍기
		drawTree(g, 400, 600, -90, 10); // 함수 만들기
	}
	private void drawTree(Graphics 붓, int xPos, int yPos, double degree, double depth) {
		if (depth == 0)
			return;
		int xPos2 = xPos + (int)(Math.cos(Math.toRadians(degree)) * depth * 10.0);
		int yPos2 = yPos + (int)(Math.sin(Math.toRadians(degree)) * depth * 10.0);
		붓.drawLine(xPos, yPos, xPos2, yPos2);
		drawTree(붓, xPos2, yPos2, degree - 20, depth - 1);
		drawTree(붓, xPos2, yPos2, degree + 20, depth - 1);
	}

	public static void main(String[] args) {
		new DrawTreeFrame();
	}

}
