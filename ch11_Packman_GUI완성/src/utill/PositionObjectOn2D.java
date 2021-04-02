package utill;

import java.util.ArrayList;
import java.util.List;

/**
 * 전환점, 팩맨, 먹이 동 좌표 정보를 공통 설계한 추상 클래스
 */
public class PositionObjectOn2D {
	// 스크린 좌표계에 따른 정보
	private int x, y;
	
	public PositionObjectOn2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public PositionObjectOn2D(PositionObjectOn2D po) {
		x = po.x;
		y = po.y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Pair<PositionObjectOn2D, PositionObjectOn2D> findWestOrNorth(PositionObjectOn2D other) {
		Pair<PositionObjectOn2D, PositionObjectOn2D> ret = null;
		// 고품질 소프트웨어 개발 표준 중에 .. 함수에서 return은 단 한번만 문장으로 나타나야한다.
		// 나 너의 @쪽에 있다.
		switch (this.decideDirection(other)) {
		//east or south 일때 처리
		case east:
		case south:
			ret = new Pair(other, this);
			break;
		//west or north 일때 처리
		case west:
		case north:
			ret = new Pair(this, other);
			break;
		}		
		return ret;
	}
	
	public Direction decideDirection(PositionObjectOn2D other) {
		// 동쪽에 있다는 것은 x가 크고 y는 같다.
		if (x > other.x && y == other.y)
			return Direction.east;
		// 서쪽에 있다는 것은 x가 작고 y는 같다.
		else if (x < other.x && y == other.y)
			return Direction.west;
		// 남쪽에 있다는 것은 x가 같고 y는 크다.
		else if (y > other.y && x == other.x)
			return Direction.south;
		// 북쪽에 있다는 것은 x가 같고 y는 작다.
		else
			return Direction.north;
	}
	
	/**
	 * 현재는 정수계 점들이 수직 수평으로 구성되어 있어 단순 빼기의 절대값만 되지만...
	 * 피타고라스를 쓴 것은 점 사이의 거리 계산 기능의 공통성을 보장하기 위함임.
	 */
	public double calcDistance(PositionObjectOn2D other) {
		//선의 길이 구하기 . sqrt +정보만 나옴 
		return Math.sqrt((x - other.x) * (x - other.x) + (y - other.y) * (y - other.y)); 
	}
	
	public List<PositionObjectOn2D> buildSteps(PositionObjectOn2D other, int gap) {
		List<PositionObjectOn2D> ret = new ArrayList<>();
		if (y == other.y) { // 수평일때
			// 2, 200   200, 200 => 나는 서 너는 동
			// 2 + gap, 200  |  2 + 2gap, 200  |  ...  | 2 + N*gap < 200
			for (int i = x + gap; i < other.x; i += gap) {
				ret.add(new PositionObjectOn2D(i, y));
			}
		} else { //수직일때
			// 2, 200   2, 400 => 나는 북 너는 남
			// 2, 200 + gap  |  2, 200 + 2gap  |  ...  | 200 + N*gap < 400
			for (int i = y + gap; i < other.y; i += gap) {
				ret.add(new PositionObjectOn2D(x, i));
			}
		}
		return ret;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
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
		PositionObjectOn2D other = (PositionObjectOn2D) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
}
