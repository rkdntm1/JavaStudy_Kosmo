package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Line {
	private List<Cell> cells = new ArrayList<>(); // 칸을 담을 ArrayList 만들기

	public void addCell(Cell cell) { // 한개의 Cell 받으면 cells에 담아 놓을거다.
		cells.add(cell);
		cell.addLine(this); // cell아 넌 this 줄에 달렸다.
	}

	private static Map<Integer, Integer> EVAL_TABLE = new HashMap<>();
	static {
		//빈칸 개수, 플레이어 돌 개수, 컴퓨터 돌 개수
		EVAL_TABLE.put(300, 1);   // _ _ _ 1 : 모든 칸이 비어 있는 상태면 1점
		EVAL_TABLE.put(201, 3);   // _ _ _ 1 : 모든 칸이 비어 있는 상태면 1점
		EVAL_TABLE.put(210, 2);   // _ _ X 2 : 상대 한개있으면 2점
		EVAL_TABLE.put(111, 0);   // X _ 0 0
		EVAL_TABLE.put(12, 0);    // 0 X 0 0  
		EVAL_TABLE.put(21, 0);    // X 0 X 0 
		EVAL_TABLE.put(102, 20);  // 0 0 _ 20 
		EVAL_TABLE.put(120, 15);  // _ X X 15 
		EVAL_TABLE.put(3, 100);   // 0 0 0 100 
		EVAL_TABLE.put(30, -100); // X X X -100 
	}

	public int eval() {
		int[] countOfStone = new int[Stone.values().length]; // values = {empty, userstone, comstone}
		for (Cell cell : cells) {
			countOfStone[cell.getStone().ordinal()]++; // ordinal : 순서 정보 가져오기
		}

		int key = 0;
		for (Stone stone : Stone.values()) {
			key = key * 10 + countOfStone[stone.ordinal()];
		}
		return EVAL_TABLE.get(key);
	}

	/**
	 * 줄에 들어있는 Cell 들에게 본 줄은 필요없다고 통보해 줄 것이야.
	 */
	void notifyUseless(Cell dontcareCell) {
		for (Cell cell : cells) {
			if(cell != dontcareCell)
				cell.removeLine(this);
		}
	}
	
}
