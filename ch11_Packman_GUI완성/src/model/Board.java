package model;

import java.util.ArrayList;
import java.util.List;

/**
 * 게임 판. 스테이지 정보를 가짐. 지금은 한 스테이지만 개발.
 * @author KYH
 */
public class Board {
	// 화면 크기
	public static final int WIDTH = 500, HEIGHT = 400;
	// 단계별 전환점과 이로서 구성되는 선들
	private static final int[][][] pointsStage = {{{20, 200}, {200, 200}, {300, 200}, {450, 200}, {300, 150},
			{100, 300}, {200, 300}, {100, 300},
			{200,380}}};
	private static final int[][][] linesStage = {{{0, 1}, {1, 2}, {2, 3}, {2, 4}, {1, 6}, {2, 7}, {5, 6}, {6, 7}, {6, 8}}};
	
	private List<TurningPoint> points = new ArrayList<>();
	// 돌아다니는 팩맨
	private PackMan packMan;
	
	public Board(int stageNumber) {
		stageNumber = 0;
		
		// pointsStage에서 정의한 스테이지별 전환점을 통하여 객체를 만들고 이들을 points에 담자.
		for (int[] point : pointsStage[stageNumber]) {
			points.add(new TurningPoint(point[0], point[1]));
		}
		
		// linesStage에서 정의한 스테이지별 선 정보를 통하여 객체를 만들고 이들을 points에 찾아 정보 연결.
		for (int[] turningPointIndexOfLine : linesStage[stageNumber]) {
			new Line(points.get(turningPointIndexOfLine[0]), points.get(turningPointIndexOfLine[1]));
		}
	}
}
