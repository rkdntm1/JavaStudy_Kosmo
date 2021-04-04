package utill;

import java.util.ArrayList;
import java.util.List;

/**
 * 전환점, 팩맨, 먹이 등 좌표 정보를 공통 설계한 추상 클래스
 */
public class PositionObjectOn2D {
	// 스크린 좌표계에 따른 정보.
	private int x, y;
	// 1~4개의 라인
	//private List<Line> attachedLines =  new ArrayList<>();  >> 시스템이 망가짐 why ? => Food 랑 PackMan이 필요한 내용인가? no.
	// 그렇다면 point에는 필요한데 어떻게 해야할가? => 추상 클래스를 만들어준다.

	public PositionObjectOn2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public PositionObjectOn2D(PositionObjectOn2D po) {
		x = po.x;
		y = po.y;
	}

	public Pair<PositionObjectOn2D, PositionObjectOn2D> findWestOrNorth(PositionObjectOn2D other) {
		Pair<PositionObjectOn2D, PositionObjectOn2D> ret = null;
		// 고품질 소프트웨어 개발 표준 중에... 함수에서 return은 단 한번만 문장으로 나타나야한다.
		switch(this.decideDirection(other)) {
		case east:
		case south:
			ret = new Pair(other, this);
		case west:
		case north:
			ret = new Pair(this, other);
		}		
		return ret;
	}
	
	public Direction decideDirection(PositionObjectOn2D other) {
		// 동쪽에 있다는 것은 x가 크고 y는 같다
		if (x > other.x && y == other.y) {
			return Direction.east;
		// 서쪽에 있다는 것은 x가 작고 y는 같다
		} else if (x < other.x && y == other.y) {
			return Direction.west; 
		// 남쪽에 있다는 것은 y가 크고 x는 같다
		} else if (y > other.y && x == other.x) {
			return Direction.south;
		// 북쪽에 있다는 것은 y가 작고 x는 같다
		} else {
			return Direction.north;
		}
	}
	
	/**
	 * 현재는 정수계 점들이 수직 수평으로 구성되어 있어 단순 빼기의 절대값만 하면 되지만.
	 * 피타고라스 정의를 쓰는 것은 점 사이의 거리 계산 기능의 공통성을 보장하기 위함임. 
	 */
	public double calcDistance(PositionObjectOn2D other) {
		return Math.sqrt(((x - other.x) * (x - other.x) + (y - other.y) * (y - other.y)));
	}
	
	public List<PositionObjectOn2D> bulidSteps(PositionObjectOn2D other, int gap) {
		List<PositionObjectOn2D> ret = new ArrayList<>();
		if (y == other.y) {
			// 2, 200        /  200, 200     /  나는 서 너는 동
			// 2 + gap, 200  / 2+ 2gap, 200  /  ...  / 2 + N*gap < 200
			for (int i = x + gap; i < other.x; i += gap) {
				ret.add(new PositionObjectOn2D(i, y));				
			}
		} else {
			// 2, 200        /    2, 400      /  나는 북 너는 남
			// 2, 200 + gap  / 2, 200 + 2gap  /  ...  / 200 + N*gap < 200
			for (int i = y + gap; i < other.y; i += gap) {
				ret.add(new PositionObjectOn2D(x, i));				
			}
		}
		return ret;
		
		
	}
	
	
}
