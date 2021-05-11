package model;

import java.util.ArrayList;
import java.util.List;

public class Point {
	private int x, y;
	private List<Line> listLine = new ArrayList<>();

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public List<Line> getListLine() {
		return listLine;
	}

	public void addLine(Line line) {
		listLine.add(line);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
}
