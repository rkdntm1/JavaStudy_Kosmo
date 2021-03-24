package tictactoe_view;

import tictactoe_model.Board;
import tictactoe_model.Cell;

public class CLIDisplayer {

	public static void display(Board board) {
		boolean isFirst = true;
		for (Cell[] row : board.getCells()){ //2차원
			 if (isFirst) {
				 isFirst = false;
			 } else {
				 System.out.println("---|---|---");
			 }
			 displayRow(row);
		}
	}

	private static void displayRow(Cell[] row) {
		boolean isFirst = true;
		for(Cell cell : row) {
			if (isFirst) {
				 isFirst = false;
			 } else {
				 System.out.print("|");
			 }
			 System.out.print(" " + cell.getStone().getDisplayChar() + " ");
		}
		System.out.println();
	}

}
