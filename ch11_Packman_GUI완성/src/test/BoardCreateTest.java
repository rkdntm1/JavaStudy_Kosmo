package test;

import org.junit.jupiter.api.Test;

import model.Board;

class BoardCreateTest {
	// 회귀 테스트. Regression Test
	@Test
	void test() {
		try {
			Board board = new Board(12);	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
