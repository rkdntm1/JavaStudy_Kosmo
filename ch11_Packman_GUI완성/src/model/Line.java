package model;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import utill.Direction;
import utill.Pair;
import utill.PositionObjectOn2D;

/**
 * 미로를 구성하는 개별적인 선. 도로
 */
public class Line {
	// 선을 구성하는 두개의 점
	private TurningPoint pointofWestOrNorth, pointOpposite;
	//선에 놓인 먹이들
	private List<Food> foods = new ArrayList<>();	
	// private List<Point> points = new ArrayList<>(); // 너무 결합시켜놓지 마시오. 분리할 수 있을때 미리미리 분리
	
	public Line(TurningPoint turningPoint1, TurningPoint turningPoint2) {
		Pair<PositionObjectOn2D, PositionObjectOn2D> pair = turningPoint1.findWestOrNorth(turningPoint2);
		pointofWestOrNorth = (TurningPoint) pair.getFrist();
		pointOpposite = (TurningPoint) pair.getSecond();
		
		pointofWestOrNorth.addLine(this); // TurningPoint 에서 만든 attached 에다가 기억시키기
		pointOpposite.addLine(this);
		
		//선의 길이 구하기 
		//length = (int) pointofWestOrNorth.calcDistance(pointOpposite);
		// Food를 만드는 것은 서, 북에 있는 점을 기준으로 동, 남으로 걸어가면서 간격별로 하나씩 만들겠습니다.
		List<PositionObjectOn2D> steps = pointofWestOrNorth.bulidSteps(pointOpposite, Food.GAP);
		for (PositionObjectOn2D po : steps) {
			foods.add(new Food(po));
		}
		
		
		
	}

	public Direction decideDirection(PositionObjectOn2D positionObject) { 
		if (pointofWestOrNorth == positionObject) {
			return pointOpposite.decideDirection(positionObject);
		}
		return pointofWestOrNorth.decideDirection(positionObject);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pointOpposite == null) ? 0 : pointOpposite.hashCode());
		result = prime * result + ((pointofWestOrNorth == null) ? 0 : pointofWestOrNorth.hashCode());
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
		if (pointOpposite == null) {
			if (other.pointOpposite != null)
				return false;
		} else if (!pointOpposite.equals(other.pointOpposite))
			return false;
		if (pointofWestOrNorth == null) {
			if (other.pointofWestOrNorth != null)
				return false;
		} else if (!pointofWestOrNorth.equals(other.pointofWestOrNorth))
			return false;
		return true;
	}

	public void drawLine(Graphics g) {
		g.drawLine(pointofWestOrNorth.getX(), pointofWestOrNorth.getY(), pointOpposite.getX(), pointOpposite.getY());
		
		// 미로에 놓인 먹이 그려주기.
		for (Food food : foods) {
			food.drawFood(g);
		}
	}

	public boolean isPointOnYou(PositionObjectOn2D nextPos) {
		// 수평 일 때
		if (pointofWestOrNorth.getY() == pointOpposite.getY() && pointofWestOrNorth.getY() == nextPos.getY() 
				&& pointofWestOrNorth.getX() <= nextPos.getX() && nextPos.getX() <= pointOpposite.getX()) {
			return true;
		}
		//수직 일 떄
		if (pointofWestOrNorth.getX() == pointOpposite.getX() && pointofWestOrNorth.getY() == nextPos.getX()
				&& pointofWestOrNorth.getY() <= nextPos.getY() && nextPos.getY() <= pointOpposite.getY()) {
			return true;
		}
		return false;
	}
	                           //팩맨이 걷고 있는 방향 정보
	public boolean canWork(Direction currentDirection) {
		switch(this.decideDirection(pointofWestOrNorth)) {
		case west:
		case east:
			return currentDirection == Direction.west || currentDirection == Direction.east;
		case north:
		case south:
			return currentDirection == Direction.north || currentDirection == Direction.south;
		}
		return false;
	}

	public TurningPoint getEndPoint(Direction currentDirection) {
		switch(currentDirection) {
		case west:
		case north:
			return pointofWestOrNorth;
		case east:
		case south:
			return pointOpposite;
		}
		return null;
	}
	
}
