package step12_ScribbleAdapter;

import java.awt.Graphics;

public class Point {
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void draw(Graphics g) {
		g.drawRect(x, y, 1, 1);
	}
	
}
