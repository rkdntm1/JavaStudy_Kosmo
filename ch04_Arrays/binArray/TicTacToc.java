package binArray;

import java.util.Scanner;

public class TicTacToc {

	/**
	 * 판을 출력
	 * 사용자가 먼저 둔다
	 * 컴퓨터가 첫 빈칸에 놓는다.
	 * 더 놓을 곳이 없으면 중지
	 * 위 전체는 반복 시킴 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int ROOT = 3;
		char[][] board = new char[ROOT][ROOT];	
		do {
			display(board); //board를 받아서 출력해주세요.
			playByUser(scan, board);
			display(board); //board를 받아서 출력해주세요.
			playByComputer(board);
		} while (true);		
	}
	
	/**
	 * 첫번째 만나는 공백을 찾아서 '0' 돌을 놓자
	 * @param board
	 */
	private static void playByComputer(char[][] board) {
		OUTER:
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board.length; col++) {
				if (board[row][col] == 0) {
					board[row][col] = '0';
					break OUTER;
				}
			}	
		}
	}
	
	/**
	 * 사용자가 선택
	 * @param scan
	 * @param board
	 */
	private static void playByUser(Scanner scan, char[][] board) {
		// 공백위치를 선택하였나
		boolean isEmptyPosition = false;
		int x, y; // 행, 열
		do {
			x = scan.nextInt();
			y = scan.nextInt();
			if (!isSafeBoundary(board, x, y)) { // 가독성
				System.out.println("제대로 입력하시오.[0~2]");
				continue; // 안전범위 아니면 재입력
			}
			isEmptyPosition = board[x][y] == 0; // 공백을 아스키 null으로
		} while (!isEmptyPosition);
		board[x][y] = 'X'; //공백이면 X로 마킹
	}
	
	/**
	 * 안전 범위 내에 있는 값을 사용자가 입력하였습니까? 가독성 -> 이해성 업
	 * @param board
	 * @param x
	 * @param y
	 * @return
	 */
	private static boolean isSafeBoundary(char[][] board, int x, int y) {
		return x >= 0 && x <= board.length && y >= 0 && y <= board.length;
	}

	private static void display(char[][] board) {
		boolean isFirstRow = true;
		for (int i = 0; i < board.length; i++) {
			if(isFirstRow) {				
				isFirstRow = false;
			} else { //중간줄 출력								
			System.out.println("---ㅣ---ㅣ---");
		}
			displayRow(board, i);									
		}
	}
	
	/**
	 * 한 줄 출력 
	 * @param board 보드
	 * @param i 출력하고자 하는 줄
	 */
	private static void displayRow(char[][] board, int i) {
		boolean isFirstCol = true;
		for (int j = 0; j < board[i].length; j++) {
			if(isFirstCol) {				
				isFirstCol = false;
			} else {
				System.out.print("ㅣ");	
			}
			System.out.print(" " + board[i][j] + " ");
		}
		System.out.println();
	}
}
