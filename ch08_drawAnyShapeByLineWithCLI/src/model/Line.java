package model;

import view.DisplayBoard;

public class Line {
	private Point startPt, endPt;

	public Line(Point startPt, Point endPt) {
		this.startPt = startPt;
		this.endPt = endPt;
		startPt.addLine(this);
		endPt.addLine(this);
	}
	
	public void printToView(char[][] view) {
		double distance = calcDistance(); // 선의 길이 계산 
		//각 좌표의 차이값에 row나 col값의 최대개수만큼으로 나누어서 출력되도록 delta값 설정 
		int xDelta = (endPt.getX() - startPt.getX()) / DisplayBoard.getMaxSteps();
		int yDelta = (endPt.getY() - startPt.getY()) / DisplayBoard.getMaxSteps();
		int x = startPt.getX(), y = startPt.getY(); // 현재 위치 
		for (int step = 0; step < DisplayBoard.getMaxSteps(); step++) {
			view[l2pY(y)][l2pX(x)] = '*';
			x += xDelta;
			y += yDelta;
		}
	}
	
	/**
	 * 논리계에서 1300은 80으로 줄여 줄 것임
	 * 1300 : 80 = x : r 
	 * r = 80 * x / 1300 
	 * @param x
	 * @return
	 */
	private int l2pX(int x) {
		return DisplayBoard.COLS * x / Shape.WIDTH;
	}
	
	/**
	 * 논리계에서 1400은 30으로 줄여 줄 것임. 1400 -> 0,  0 -> 30
	 * 1400 : 30 = y : r 
	 * r = 30 - 30 * y / 1400 
	 * @param y
	 * @return
	 */
	private int l2pY(int y) { 
		// +1을 해줘서 오류해결
		return DisplayBoard.ROWS - (DisplayBoard.ROWS * y / Shape.HEIGHT + 1);
	}
	
	/** 선의 길이 구하기 */
	private double calcDistance() {
		return Math.sqrt((startPt.getX() - endPt.getX()) * (startPt.getX() - endPt.getX()) +
		(startPt.getY() - endPt.getY()) * (startPt.getY() - endPt.getY()));
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((endPt == null) ? 0 : endPt.hashCode());
		result = prime * result + ((startPt == null) ? 0 : startPt.hashCode());
		return result;
	}
}
