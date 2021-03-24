package tictactoe.model;

import java.util.ArrayList;
import java.util.List;

public class Cell {
	private Stone stone = Stone.empty; //빈칸 
	private List<Line> lines =new ArrayList<>();
	// 생성자를 정의 해놓지 않으면 ... 기본 생성자(Default Constructor)가 자동적으로 만들어져 있다.
	/*
	public Cell() {		
	}
	*/

	public Stone getStone() {
		return stone;
	}

	public void setStone(Stone stone) {
		this.stone = stone;
	}
	public void addLine(Line line) {
		lines.add(line);
	}

	public int eval() {
		//내가 상관된 줄들의 평점을 총합하면 나의 평점이야.
		int sum = 0;
		for (Line line : lines) {
			sum += line.eval();
		}
		return sum;
	}

	
	
}
