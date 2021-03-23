package tictactoe.model;

import java.util.ArrayList;
import java.util.List;

public class Board {
	/** 판의 크기 */
	public static final int ROOT = 3; // 3 x 3 임으로 3을 상수로 지정
	private Cell[][] cells = new Cell[ROOT][ROOT];// 3x3 저장소를 만들자
	private List<Line> lines = new ArrayList<>(); // 줄 데이터(가로 세로 대각 기울대각) 를 담아 놓는 리스트

	public Board() { // 생성자
		// 이중 반복문으로 전체 9개의 칸 만들기
		for (int row = 0; row < ROOT; row++) {
			for (int col = 0; col < ROOT; col++) {
				cells[row][col] = new Cell(); // 9칸을 새롭게 답자
			}
		}
		// 가로줄 만들기 0 > 0 , 1 , 2
		for (int row = 0; row < ROOT; row++) {
			Line horizonline = new Line();
			for (int col = 0; col < ROOT; col++) {
				horizonline.addCell(cells[row][col]);
			}
			lines.add(horizonline);
		}
		// 새로줄 만들기 00 10 20 01 11 21
		for (int col = 0; col < ROOT; col++) {
			Line verticalline = new Line();
			for (int row = 0; row < ROOT; row++) {
				verticalline.addCell(cells[row][col]);
			}
			lines.add(verticalline);
		}
		// 대각선 만들기 00 11 22
		Line diagnaline = new Line();
		for (int row = 0; row < ROOT; row++) {
			diagnaline.addCell(cells[row][row]);
		}
		lines.add(diagnaline);
		// 기울어진 대각선 만들기 02 11 20
		Line slandiagnaline = new Line();
		for (int row = 0; row < ROOT; row++) {
			slandiagnaline.addCell(cells[row][ROOT - row - 1]);
		}
		lines.add(slandiagnaline);
	}

	public Cell[][] getCells() {
		return cells;
	}

	/**
	 * 조건
	 * 1. There is no empty(빈칸없을떄)
	 * 2. A line is fully filled with single stone type.(한 줄이 완성됐을때) 
	 * @return
	 */
	public boolean isEnded() {
		return false;
	}

	public void play() {
		// 모든 빈 칸을 대상으로 가장 높은 점수를 가진 칸을 찾아서 comStone을 놓자
		int max = Integer.MIN_VALUE;
		Cell bestCell = null;
		for (int row = 0; row < ROOT; row++) {
			for (int col = 0; col < ROOT; col++) {
				if (cells[row][col].getStone() == Stone.empty) {
					int val = cells[row][col].eval();
					if (max < val) {
						max = val;
						bestCell = cells[row][col];
					}
				}
			}
		}
		bestCell.setStone(Stone.comStone);
	}

}