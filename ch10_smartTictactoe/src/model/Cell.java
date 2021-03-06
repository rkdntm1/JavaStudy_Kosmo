package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cell {
	private int row, col;
	private Stone stone = Stone.empty; //나에게 놓인 돌은 ? 
	private List<Line> lines = new ArrayList<>(); //이 칸이 담긴 줄들
	
	public Cell(int row, int col) {
		this.row = row;
		this.col = col;
	}
	
	public int getRow() {
		return row;
	}

	public int getCol() {
		return col;
	}

	public Stone getStone() {
		return stone;
	}
	
	public void setStone(Stone stone) {
		this.stone = stone;
		//이 cell이 참여한 라인 중 돌이 섞여있어 더이상의 판단이 필요없는 것은 연관 관계를 제거하여..
		//성능을 향상 시키자. ConcurrentModificationException 발생시키지않도록 개발
		Iterator<Line> iter = lines.iterator();
		while(iter.hasNext()) {
			Line line = iter.next();
			if (line.eval() == 0) {
				line.notifyUseless(this);
				iter.remove();
			}
		}
	}
	
	//cardinality 
	public void addLine(Line line) {
		lines.add(line);
	}
	
	void removeLine(Line line) {
		lines.remove(line);
	}

	/**
	 * 내가 상관된 줄들의 평점을 총합하면 나의 평점이야. 
	 * @return
	 */
	public int eval() {
		int sum = 0;
		for (Line line : lines) {
			sum += line.eval();
		}
		return sum;
	}
	
	/**
	 * 조건) A line is fully filled with single stone type.(한 줄이 완성됐을때)
	 * @return
	 */
	public boolean isSomeoneWin() {
		for (Line line : lines) { 
			if (Math.abs(line.eval()) == 100)
				return true;
		}		
		return false;
	}

	public boolean isEmpty() {
		return stone == Stone.empty;
	}

}
