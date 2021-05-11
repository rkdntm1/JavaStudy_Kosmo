package model;

import java.util.ArrayList;
import java.util.List;

public class Point2 {
	private int x, y; //x, y좌표
	private List<Line2> listOfLi = new ArrayList<>();

	public Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void addLine(Line2 line2) {
		listOfLi.add(line2);
	}
}
