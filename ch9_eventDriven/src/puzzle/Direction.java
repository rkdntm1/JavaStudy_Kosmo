package puzzle;

public enum Direction {
	north(-1, 0), east(0, 1), south(1, 0), west(0, -1);

	private int rowDelta, colDelta;
	
	Direction(int i, int j) {
		rowDelta = i;
		colDelta = j;
	}

	public int getRowDelta() {
		return rowDelta;
	}

	public int getColDelta() {
		return colDelta;
	}
	
	
}
