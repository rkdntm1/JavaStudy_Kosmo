package control;

import model.Board;
import view.TicTacToeWin;

public class TicTacToeController {
	private TicTacToeWin win;
	private Board board;
	
	private TicTacToeController() {
		board = new Board();
		board.play();
		win = new TicTacToeWin(board);
	}		
	
	public static void main(String[] args) {
		new TicTacToeController();		

	}
}
