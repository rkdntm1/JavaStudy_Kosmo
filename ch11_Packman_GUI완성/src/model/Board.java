package model;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 게임 판. 스테이지 정보를 가짐. 지금은 한 스테이지만 개발함. 
 */
public class Board {
	private static final int POSITIONPACKMAN = 1;
	// 화면 크기
	public static final int WIDTH = 500, HEIGHT = 400;
	// 단계별 전환점과 이로서 구성되는 선들
	private static int[][][] pointStage = {{ 
		{ 20, 200, POSITIONPACKMAN }, { 200, 200, 0 }, { 300, 200, 0 }, { 450, 200, 0 }, { 300, 150, 0 } ,
		{ 100, 300, 0 }, { 200, 300, 0 }, { 300, 300, 0 },
		{ 200, 380, 0 }
		}};
	private static int[][][] linesStage = {{ { 0, 1 }, { 1, 2 }, { 2, 3 }, { 2, 4 }, { 1, 6 }, { 2, 7 }, { 5, 6 }, { 6, 7 }, { 6, 8 } }};
	
	//보드에 포인트 넣을거야. 여러개 있으니 리스트로
	private List<TurningPoint> points = new ArrayList<>();
	
	//돌아 다니는 팩맨
	private PackMan packMan;
	
	public Board(int stageNumber) { // 스테이지를 받아서 생성 (현재는 하나)
		stageNumber = 0;	
		
		// pointStage에서 정의한 스테이지별 전환점을 통하여 객체를 만들고 이를 points에 담자
		for (int[] point : pointStage[stageNumber]) {
			points.add(new TurningPoint(point[0], point[1]));
			if (point[2] == POSITIONPACKMAN) {
				packMan = new PackMan(point[0], point[1]);
			}
		}
		
		// linesStage에서 정의한 스테이지별 선 정보를 통하여 객체를 만들고 이를 points에서 찾아 정보 연결
		for (int[] indexOfPoints : linesStage[stageNumber]) {
			new Line(points.get(indexOfPoints[0]), points.get(indexOfPoints[1]));
		}
	}

	public void display(Graphics g) {
		Set<Line> displayedLine = new HashSet<>();
		for (TurningPoint pt : points) {	
			pt.drawLine(displayedLine, g);
		}
	}
	
}
