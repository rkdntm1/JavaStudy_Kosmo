package binArray;

public class MineSweeper {

	/**
	 * 10x10 �ǿ��� 30%�� Ȯ���� ���ڸ� ��ġ�غ��� �������� . ���� ä���
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// 10 x 10 ��
		final int ROOT = 10;
		boolean[][] board = new boolean[ROOT][ROOT];
		installMine(board); // ���� ��ġ �� �ƴ°� �����ϱ�
		displayGround(board); // ���÷����ϱ�
	}

	/**
	 * 10 x 10 ���� ������ ����(#)�� ���ڰ� �ƴѰ�(.) ä���
	 * 
	 * @param board
	 */
	private static void displayGround(boolean[][] board) {
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board.length; col++) {
				if (board[row][col] == true) {
					System.out.print("# ");
				} else {
					System.out.print(". ");
				}
			}
			System.out.println();
		}

	}

	/**
	 * 10x10�ǿ��� ���ڼ�ġ�ϱ�
	 * 
	 * @param board
	 */
	private static void installMine(boolean[][] board) {
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board.length; col++) {
				// 30%�� Ȯ���� ���� �ֱ�
				if (Math.random() < 0.3) { // 0.1 ~ 1 �߿� 0.3 �����Ƿ� 30%
					board[row][col] = true;
				}
			}
		}
	}

}
