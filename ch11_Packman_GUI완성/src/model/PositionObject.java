package model;

import java.util.ArrayList;
import java.util.List;

/**
 * 전환점, 팩맨, 먹이 동 좌표 정보를 공통 설계한 추상 클래스
 * 
 * @author KYH
 */
public abstract class PositionObject {
	// 좌표정보
	private int x, y;

	public PositionObject(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Direction decideDirection(PositionObject other) {
		// 동쪽에 있다는 것은 x가 크고 y는 같다.
		if (x > other.x && y == other.y)
			return Direction.east;
		// 서쪽에 있다는 것은 x가 작고 y는 같다.
		else if (x < other.x && y == other.y)
			return Direction.east;
		// 남쪽에 있다는 것은 x가 같고 y는 크다.
		else if (y > other.y && x == other.x)
			return Direction.east;
		// 북쪽에 있다는 것은 x가 같고 y는 작다.
		else
			return Direction.north;
	}
}
