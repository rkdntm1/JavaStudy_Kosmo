package model;

import java.awt.Graphics;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import utill.Direction;
import utill.Pair;
import utill.PositionObjectOn2D;

/**
 * 전환점. 도로상의 교차로 같은 느낌
 */
public class TurningPoint extends PositionObjectOn2D {

	// 교차로에서 연결된 길들 
	private Map<Direction, Line> attachedLines = new HashMap<>(); // Map<key Set, value Set>
	
	public TurningPoint(int x, int y) {
		super(x, y);
	}

	public void addLine(Line line) {
		// 객체에 들어 있는 정보를 강제적으로 허용하여 (정보 은닉 원칙 위배)
		/*
		line.getPoint1() == this  ... 
		line.getPoint2()
		line.getOtherPoint(this);
		*/
		// 내가 어떤 정보를 줄테니 너가 판단하여 내가 필요한(요청하는) 정보를 생성해 다오.(이것이 정보 은닉)
		attachedLines.put(line.decideDirection(this), line); // 특정 포인트를 기준으로 어느방향에 있는지
	}

	public void drawLine(Set<Line> displayedLine, Graphics g) {
		for (Line line : attachedLines.values()) { // collection : 열거형(한꺼번에 넘어옴)
			if (!displayedLine.contains(line)) {
				line.drawLine(g);
				displayedLine.add(line);
			}
		}
	}
	
}
