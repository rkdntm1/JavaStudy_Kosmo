package tictactoe_model;

public enum Stone {
	empty(' '), userStone('x'), comStone('o');
	private char displayChar;
	
	private Stone(char c) {
		displayChar = c;
	}

	public char getDisplayChar() {
		return displayChar;
	}
	
	
}


