package binArray;

import java.util.Scanner;

public class TicTacToc {

	/**
	 * ���� ���
	 * ����ڰ� ���� �д�
	 * ��ǻ�Ͱ� ù ��ĭ�� ���´�.
	 * �� ���� ���� ������ ����
	 * �� ��ü�� �ݺ� ��Ŵ 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int ROOT = 3;
		char[][] board = new char[ROOT][ROOT];	
		do {
			display(board); //board�� �޾Ƽ� ������ּ���.
			playByUser(scan, board);
			display(board); //board�� �޾Ƽ� ������ּ���.
			playByComputer(board);
		} while (true);		
	}
	
	/**
	 * ù��° ������ ������ ã�Ƽ� '0' ���� ����
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
	 * ����ڰ� ����
	 * @param scan
	 * @param board
	 */
	private static void playByUser(Scanner scan, char[][] board) {
		// ������ġ�� �����Ͽ���
		boolean isEmptyPosition = false;
		int x, y; // ��, ��
		do {
			x = scan.nextInt();
			y = scan.nextInt();
			if (!isSafeBoundary(board, x, y)) { // ������
				System.out.println("����� �Է��Ͻÿ�.[0~2]");
				continue; // �������� �ƴϸ� ���Է�
			}
			isEmptyPosition = board[x][y] == 0; // ������ �ƽ�Ű null����
		} while (!isEmptyPosition);
		board[x][y] = 'X'; //�����̸� X�� ��ŷ
	}
	
	/**
	 * ���� ���� ���� �ִ� ���� ����ڰ� �Է��Ͽ����ϱ�? ������ -> ���ؼ� ��
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
			} else { //�߰��� ���								
			System.out.println("---��---��---");
		}
			displayRow(board, i);									
		}
	}
	
	/**
	 * �� �� ��� 
	 * @param board ����
	 * @param i ����ϰ��� �ϴ� ��
	 */
	private static void displayRow(char[][] board, int i) {
		boolean isFirstCol = true;
		for (int j = 0; j < board[i].length; j++) {
			if(isFirstCol) {				
				isFirstCol = false;
			} else {
				System.out.print("��");	
			}
			System.out.print(" " + board[i][j] + " ");
		}
		System.out.println();
	}
}
