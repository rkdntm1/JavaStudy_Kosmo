package model;

public class Line2 {
	private Point2 startPt, endPt; // 시작점과 끝점

	public Line2(Point2 startPt, Point2 endPt) {
		this.startPt = startPt;
		this.endPt = endPt;
		
		startPt.addLine(this);
		endPt.addLine(this);
	}
}
