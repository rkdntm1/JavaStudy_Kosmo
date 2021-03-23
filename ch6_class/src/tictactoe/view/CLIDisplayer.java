package tictactoe.view;

import tictactoe.model.Board;
import tictactoe.model.Cell;

public class CLIDisplayer {

	public static void display(Board board) {
		boolean isFirst = true; // 맨처음만 그냥 출력시키고 그다음에는 무늬가 추가되어 반복되도록
		for (Cell[] row : board.getCells()) { // 이중배열을 단일배열로 변경 됨 . 3번 반복
			if (isFirst) {
				isFirst = false;
			} else {
				System.out.println("---ㅣ---ㅣ---");
			}
			displayRow(row);
		}
	}

	private static void displayRow(Cell[] row) {
		boolean isFirst = true; 
		for (Cell cell : row ) {
			if (isFirst) {
				isFirst = false;
			} else {
				System.out.print("ㅣ");
			}	
			System.out.print(" " + cell.getStone().getDisplayChar() + " ");			
		}
		System.out.println();
	}
	
}
