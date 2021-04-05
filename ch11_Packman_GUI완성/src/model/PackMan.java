package model;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import utill.Direction;
import utill.PositionObjectOn2D;

/**
 * 플레이어의 조정을 받으면서 화면 상에 걸어다니며 먹이를 먹는 캐릭터.
 */
public class PackMan extends PositionObjectOn2D {
	private static final int RADIUS_4_DRAWING = 10;
	// 한 면을 걸을 때 걸리는 총 시간(초). 플레이 속도 조절용도
	public static final int TOT_WALK_TIME = 25; // 여유 시간을 더 주자
	// 면의 길이와 시간으로 산출한 걸어가는 속도.
	private static final int SPEED = Board.WIDTH / TOT_WALK_TIME;

	// 획득 점수
	private int earnedScore = 0;
	// 현재 걸어가는 방향과 다음 전환점에서 바꿀 방향
	private Direction currentDirection = Direction.north, nextDirection = currentDirection;
	private boolean isWorking;
	private Line currentLine;

	public PackMan(TurningPoint startPoint, Line line) {
		super(startPoint);
		currentLine = line;
	}

	public void draw(Graphics g) {
		g.drawOval(getX() - RADIUS_4_DRAWING, getY() - RADIUS_4_DRAWING, 2 * RADIUS_4_DRAWING, 2 * RADIUS_4_DRAWING);
	}

	/**
	 * @param timePeriod 단위는 millisecond
	 */
	public void timeElapsed(int timePeriod) {
		isWorking = false;
		PositionObjectOn2D nextPos = null;
		switch (currentDirection) {
		case north:
			nextPos = new PositionObjectOn2D(getX(), getY() - SPEED * timePeriod / 1000);
			break;
		case south:
			nextPos = new PositionObjectOn2D(getX(), getY() + SPEED * timePeriod / 1000);
			break;
		case east:
			nextPos = new PositionObjectOn2D(getX() + SPEED * timePeriod / 1000, getY());
			break;
		case west:
			nextPos = new PositionObjectOn2D(getX() - SPEED * timePeriod / 1000, getY());
			break;
		}
		
		// 같은 방향 일때
		if (currentLine.canWork(currentDirection)) {
			isWorking = true;
			// 그 선 안에 있을때
			if (currentLine.isPointOnYou(nextPos)) {
				super.setX(nextPos.getX());
				super.setY(nextPos.getY());
			} else {
				// 그 선안에 없을때
				TurningPoint tpOnLineEnd = currentLine.getEndPoint(currentDirection);
				super.setX(tpOnLineEnd.getX());
				super.setY(tpOnLineEnd.getY());
				
				Line nextLine = tpOnLineEnd.getLineOnDirection(nextDirection);
				if (nextLine != null) {
					currentDirection = nextDirection;
					currentLine = nextLine;
				} else {
					isWorking = false;		
				}
			}
		} else {
			//직각 방향일때 
			isWorking = false;
		}	
	}

	/**
	 * 동서로 움직이고 있을 때 반대편 명령이 떨어지면 즉시 변경 
	 * 남북으로 방향지시가 오면 다음 전환점에 도달시 그 방향으로 수정하여 걸어가자
	 */
	public void changeDirection(Direction direction) {
		nextDirection = direction; // 전환점 도달 시 적용.
		if (isWorking) {
			if (!currentDirection.is90Degree(direction)) {
				currentDirection = direction; // 반대편 명령이 떨어지면 즉시 변경
			} 
		} else {
			currentDirection = direction;
		}
	}
}
