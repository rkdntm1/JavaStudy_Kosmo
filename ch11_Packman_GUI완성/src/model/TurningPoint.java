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
	
	// 교차로에서 연결된 길들 // 1~4개
	private Map<Direction, Line> attachedLines = new HashMap<>();
	
	public TurningPoint(int x, int y) {
		super(x, y);
	}

	public void addLine(Line line) {
		/* 객체지향 ) 객체에 들어 있는 정보를 강제적으로 허용하면 -> 정보 은닉 원칙 위배.
		line.getPoint1() == this
		line.getPoint2() == this
		line.getOtherPoint(this)
		*/
		// 객체지향 ) 내가 어떤 정보를 줄테니 너가 판단하여 내가 필요한(요청하는) 정보를 생성해 -> 정보 은닉
		// 교차로에 도로를 뚫어 놓을때는 그 도로가 동쪽 도로인지 서쪽 도로인지 등 판단해서 담아 놓을거다 
		attachedLines.put(line.decideDirection(this), line);
	}

	public void drawLine(Set<Line> displayedLine, Graphics g) {
		for (Line line : attachedLines.values()) {
			if (!displayedLine.contains(line)) {
				line.drawLine(g);
				displayedLine.add(line);
			}
		}
	}
	
}
