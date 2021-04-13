package model;

public class Cell {
	private int row, col;
	private boolean hasMine = false;
	private int aroundMineCount = 0;
	
	public Cell(int row, int col) {
		this.row = row;
		this.col = col;
	}

	protected int getRow() {
		return row;
	}

	protected int getCol() {
		return col;
	}

	
	public boolean hasMine() {
		return hasMine;
	}

	public void setMine() {
		hasMine = true;
	}
	
	public int getAroundMineCount() {
		return aroundMineCount;
	}

	public void incMineCount() {
		aroundMineCount++;
	}

}
