package tictactoe_model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Line {	
	private List<Cell> cells = new ArrayList<>();
	
	private static Map<Integer, Integer> EVAL_TABLE = new HashMap<>(); 
	static {
		EVAL_TABLE.put(300, 1); // 300 - 1
	}	
	public void addCell(Cell cell) {
		cells.add(cell);
		cell.addLine(this);
	}
	
	/** 컴퓨터(0) 입장
	 * _ _ _    1     :  모든 칸이 비어 있는 상태면  1점
	 * _ _ 0    3     :  나만 한개 있으면 3점
	 * _ _ X    2     :  상대 한개 있으면 2점  
	 * X _ 0    0
	 * 0 0 _   20
	 * _ X X   15 
	 * 0 0 0   100
	 * X X X  -100
	 * @return
	 */
	public int eval() {
		//빈사컴
		//300 - 1
		//201 - 3
		//210 - 2
		int[] countOfStone = new int[Stone.values().length];  // values = {empty, userstone, comstone}
		for (Cell cell : cells) {
			countOfStone[cell.getStone().ordinal()]++; // ordinal : 순서 정보 가져오기			 
		}		
		int key = 0;
		for (Stone stone :Stone.values()) {
			key = key * 10 + countOfStone[stone.ordinal()];
		}				
		return EVAL_TABLE.get(key);		
	}
	
}