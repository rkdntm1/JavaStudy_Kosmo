package controll;


import model.Board;
import view.PackManWin;

public class PackManController {
	private PackManWin packManWin;
	
	private PackManController() {
		packManWin = new PackManWin();
	}
	
	public static void main(String[] args) {
		new PackManController();
	}
}
