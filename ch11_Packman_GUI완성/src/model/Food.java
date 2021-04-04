package model;

import utill.PositionObjectOn2D;

/**
 * 선 위에 배치할 먹이. 점수 획득 용도
 */
public class Food extends PositionObjectOn2D { // 속성을 물려받자
	// 먹이 배치 간격. 	Food는 동일 간격으로 배치할 것임. 초당 하나 정도의 식사 하실 수 있도록 설정
	public static final int GAP = Board.WIDTH / PackMan.TOT_WALK_TIME;
	// 기본 점수
	private static final int BASIC_SCORE = 3; 
	// 획득 할 점수
	private int score;
	
	public Food(PositionObjectOn2D po) {
		super(po);
		score = BASIC_SCORE;
	}
}
