package model;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import utill.Direction;
import utill.Pair;
import utill.PositionObjectOn2D;

/**
 * 미로를 구성하는 개별적인 선. 도로
 * @author KYH
 */
public class Line {
	// 선을 구성하는 두개의 점
	private TurningPoint pointOfWestOrNorth, pointOpposite; 
	//선에 놓인 먹이들
	private List<Food> foods = new ArrayList<>();
	
	// 매개변수를 대명사로 바꿔준다
	public Line(TurningPoint turningPoint1, TurningPoint turningPoint2) {
		Pair<PositionObjectOn2D, PositionObjectOn2D> pair = turningPoint1.findWestOrNorth(turningPoint2);
		pointOfWestOrNorth = (TurningPoint) pair.getFrist();
		pointOpposite = (TurningPoint) pair.getSecond();
		
		pointOfWestOrNorth.addLine(this); // 0번 입장
		pointOpposite.addLine(this); // 1번 입장
		
		// Food를 만드는 것은 서, 북에 있는 점을 기준으로 동, 남으로 걸어 가면서 간격별로 하나씩 만들겠습니다.
		List<PositionObjectOn2D> steps = pointOfWestOrNorth.buildSteps(pointOpposite, Food.GAP); // GAP과 반대편 점의 데이터를 보내 먹이를 생성
		for (PositionObjectOn2D po : steps) {
			foods.add(new Food(po)); // 새로운 Food를 생성
		}
	}
	
	public Direction decideDirection(PositionObjectOn2D positionObject) { // positionObject: 기준포인트
		if (pointOfWestOrNorth == positionObject) {
			return pointOpposite.decideDirection(positionObject);
		}
		return pointOfWestOrNorth.decideDirection(positionObject);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pointOfWestOrNorth == null) ? 0 : pointOfWestOrNorth.hashCode());
		result = prime * result + ((pointOpposite == null) ? 0 : pointOpposite.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Line other = (Line) obj;
		if (pointOfWestOrNorth == null) {
			if (other.pointOfWestOrNorth != null)
				return false;
		} else if (!pointOfWestOrNorth.equals(other.pointOfWestOrNorth))
			return false;
		if (pointOpposite == null) {
			if (other.pointOpposite != null)
				return false;
		} else if (!pointOpposite.equals(other.pointOpposite))
			return false;
		return true;
	}

	public void drawLine(Graphics g) {
		g.drawLine(pointOfWestOrNorth.getX(), pointOfWestOrNorth.getY(), pointOpposite.getX(), pointOpposite.getY());
	}
	
}
