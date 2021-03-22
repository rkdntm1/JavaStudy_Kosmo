package binArray;

public class MineSweeper {

	/**
	 * 10x10 판에서 30%의 확률로 지뢰를 설치해보자 나머지는 . 으로 채우기
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// 10 x 10 판
		final int ROOT = 10;
		boolean[][] board = new boolean[ROOT][ROOT];
		installMine(board); // 지뢰 설치 및 아는곳 설정하기
		displayGround(board); // 디스플레이하기
	}

	/**
	 * 10 x 10 판을 만들자 지뢰(#)와 지뢰가 아닌곳(.) 채우기
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
	 * 10x10판에서 지뢰설치하기
	 * 
	 * @param board
	 */
	private static void installMine(boolean[][] board) {
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board.length; col++) {
				// 30%의 확률로 지뢰 넣기
				if (Math.random() < 0.3) { // 0.1 ~ 1 중에 0.3 까지므로 30%
					board[row][col] = true;
				}
			}
		}
	}

}
