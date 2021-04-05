package model;

import java.awt.Graphics;

import utill.PositionObjectOn2D;

/**
 * 선 위에 배치할 먹이. 점수 획득 용도
 */
public class Food extends PositionObjectOn2D { // 속성을 물려받자
	private static final int RADIUS_4_DRAWING = 5;
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

	public void drawFood(Graphics g) {
		// getX,getY는 중점.  upper left corner 기준이므로 반지름 값을 빼줘서 시작점을 구함.
		g.drawOval(getX() - RADIUS_4_DRAWING, getY() - RADIUS_4_DRAWING, 2 * RADIUS_4_DRAWING, 2 * RADIUS_4_DRAWING); 
	}
}
