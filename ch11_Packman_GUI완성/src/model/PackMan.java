package model;

import utill.Direction;
import utill.PositionObjectOn2D;

/**
 * 플레이어의 조정을 받으면서 화면 상에서 걸어다니며 먹이를 먹는 케릭터
 */
public class PackMan extends PositionObjectOn2D {
	// 한 면을 걸을 때 걸리는 총 시간. 플레이 속도 조절 용도
	public static final int TOT_WALK_TIME = 25;
	// 면의 길이와 시간을 산출 한 걸어가는 속도
	private static final int SPEED = Board.WIDTH / TOT_WALK_TIME;
	
	// 획득 점수 
	private int earnedScore = 0; 
	// 현재 걸어가는 방향과 다음 전환점에서 바꿀 방향
	private Direction currentDirection = Direction.north, nextDirection = currentDirection; //방향	
	
	public PackMan(int x, int y) {
		super(x, y); // 생성된 팩맨의 위치데이터들을 상위클래스에서 처리
	}
}
