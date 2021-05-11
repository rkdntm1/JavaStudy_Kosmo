package view;

public class DisplayBoard {
	public static final int ROWS = 30, COLS = 80; //해상도   

	private char[][] view = new char[ROWS][COLS];
	
	/** 최대 칸수 */
	public static int getMaxSteps() {
		return ROWS > COLS ? ROWS : COLS; 
	}
	
	public char[][] getView() {
		return view;
	}

	public void display() {
		for (int r = 0; r < ROWS; r++) {
			for (int c = 0; c < COLS; c++) {
				if (view[r][c] != '*') {
					System.out.print(' ');
				} else {
					System.out.print(view[r][c]);	
				}
			}
			System.out.println();
		} 
	}
}
