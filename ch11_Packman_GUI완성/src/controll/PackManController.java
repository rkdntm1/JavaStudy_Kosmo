package controll;

import model.Board;
import view.PackManWin;

public class PackManController {
	private Board board;
	private PackManWin packManWin;
	
	private PackManController() {
		board = new Board(333);
		packManWin = new PackManWin(board);
	}
	
	public static void main(String[] args) {
		new PackManController();
	}
}
