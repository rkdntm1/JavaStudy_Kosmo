package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import util.Pair;

public enum Direction {
	N(-1, 0), NE(-1, 1), E(0, 1), SE(1, 1), S(1, 0), SW(1, -1), W(0, -1), NW(-1, -1);
	
	private int rowDelta, colDelta;

	private Direction(int rowDelta, int colDelta) {
		this.rowDelta = rowDelta;
		this.colDelta = colDelta;
	}
		
	public static List<Pair<Integer, Integer>> getAroundIndex(int row, int col) {
		return Arrays.asList(Direction.values()).parallelStream()// 성능 높이기, 아래 순차적 반복문 보다가
		.map(dir->{return new Pair<>(row + dir.rowDelta, col + dir.colDelta);})
		.collect(Collectors.toList());
	}
	/*
	public static List<Pair<Integer, Integer>> getAroundIndex(int row, int col) {
		List<Pair<Integer, Integer>> ret = new ArrayList<>();
		for (Direction dir : Direction.values()) {
			ret.add(new Pair<>(row + dir.rowDelta, col + dir.colDelta));
		}
		return ret;
	}
	*/
}
