package tictactoe_control;

import tictactoe_model.Board;
import tictactoe_view.CLIDisplayer;

public class TicTacToeController {

	public static void main(String[] args) {
		Board board = new Board();
				
		boolean turn = true; //컴퓨터가 플레이 한다.
		do {
			if(turn) {
				board.play();
			} else {
				
			}
			CLIDisplayer.display(board);
			turn = !turn; // 순서 뒤집기
		} while (!board.isEnded());
	}

}
