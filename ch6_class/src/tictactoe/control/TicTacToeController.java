package tictactoe.control;

import tictactoe.model.Board;
import tictactoe.view.CLIDisplayer;

public class TicTacToeController {

	public static void main(String[] args) {
		Board board = new Board(); //보드를 가져옴

		
		boolean turn = true; // 컴퓨터가 플레이한다
		do {
			if (turn) { 
				board.play();
			} else { 
				//스캐너
			}
			CLIDisplayer.display(board);		 //보드값을 던져줘서 view 가져옴
			
			turn = !turn; // 순서 뒤집어 주기
		} while (board.isEnded());		
	}

}
