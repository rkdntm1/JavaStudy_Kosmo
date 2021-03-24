package tictactoe_model;

import java.util.ArrayList;
import java.util.List;

public class Cell {
	private Stone stone = Stone.empty; // 맨처음 돌은 아무것도 안놓임
	private List<Line> lines = new ArrayList<>();

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
		// 내가 상관된 줄들의 평점을 총합하면 나의 평점
		int sum = 0;
		for ( Line line :  lines) {
			sum += line.eval(); //line아 평점 매겨라. 나온값을 sum에 더해줄게
		}
		return sum;
	}


}
