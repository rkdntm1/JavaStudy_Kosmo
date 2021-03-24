package tictactoe_model;

import java.util.ArrayList;
import java.util.List;

/**
 * 3 x 3 의 칸으로 이루어진 틱택톡 게임 판은 9개의 칸 과 8개의 줄로 이루어져 있으며 줄은 3개의 칸으로 이루어져 있다.
 * 
 * @author KYH
 *
 */
public class Board {
	// 3 의 정의, 3 x 3 틀 짜기
	private static final int ROOT = 3;
	private Cell[][] cells = new Cell[ROOT][ROOT];
	private List<Line> lines = new ArrayList<>();

	public Board() {
		// 판 만들기 9개의 칸으로 이루어져있음
		Cell prev = null;
		for (int row = 0; row < ROOT; row++) {
			for (int col = 0; col < ROOT; col++) {
				cells[row][col] = new Cell();
				 
			}
		}
		// 판은 8개의 줄로 이루어져있다.
		// 그런데 줄은 3개의 칸으로 이루어져있다.
		// 가로줄(3)x3 00 01 02
		for (int row = 0; row < ROOT; row++) {
			Line line = new Line(); // 줄들을 넣기위해서
			for (int col = 0; col < ROOT; col++) {
				line.addCell(cells[row][col]);
			}
			lines.add(line);
		}
		// 세로줄(3)x3
		for (int row = 0; row < ROOT; row++) {
			Line line = new Line(); // 줄들을 넣기위해서
			for (int col = 0; col < ROOT; col++) {
				line.addCell(cells[col][row]);
			}
			lines.add(line);
		}
		// 대각선1(1)x3
		Line line = new Line(); // 줄들을 넣기위해서
		for (int col = 0; col < ROOT; col++) {
			line.addCell(cells[col][col]);
		}
		lines.add(line);

		// 대각선2(1)x3
		line = new Line(); // 줄들을 넣기위해서
		for (int col = 0; col < ROOT; col++) {
			line.addCell(cells[col][ROOT - col - 1]);
		}
		lines.add(line);

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
		// 모든 빈칸을 대상으로 가장 높은 점수를 가진 것을 찾아 comStone을 놓자.
		int max = Integer.MIN_VALUE;
		Cell bestCell = null;
		for (int row = 0; row < ROOT; row++) {
			for (int col = 0; col < ROOT; col++) {
				if(cells[row][col].getStone() == Stone.empty) { // 비어 있으면
					int val = cells[row][col].eval(); // 점수계산해줘라
					if ( max < val) {
						max = val;
						bestCell = cells[row][col];
					}
				} 
			}
		}
		bestCell.setStone(Stone.comStone);
	}
	
}
