package model;

import java.util.ArrayList;
import java.util.List;

/**
 * 미로를 구성하는 개별적인 선. 도로
 * @author KYH
 */
public class Line {
	// 선을 구성하는 두개의 점
	private TurningPoint point1, point2; 
	//선에 놓인 먹이들
	private List<Food> foods = new ArrayList<>();
	//선의 길이
	private int lengtht;
	
	public Line(TurningPoint turningPoint1, TurningPoint turningPoint2) {
		point1 = turningPoint1;
		point2 = turningPoint2;
		
		point1.addLine(this);
		point2.addLine(this);
	}

	public Direction decideDirection(PositionObject positionObject) {
		if (point1 == positionObject) {
			return point2.decideDirection(positionObject);
		}
		return point1.decideDirection(positionObject);
	}
}
