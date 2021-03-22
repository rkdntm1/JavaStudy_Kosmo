package binArray;

/**
 * 10 * 10의 판에 벌레를 중앙에 놓고 10번의 임의 방향으로 걸으면서 그 궤적을 걸음마다 출력할것임
 */
public class RandomWalk_byTeacher {

	public static void main(String[] args) {
		// 10 * 10의 판
		final int ROOT = 10;
		boolean[][] board = new boolean[ROOT][ROOT];

		// 벌레의 현 위치, 벌레를 중앙에 놓고
		int xPos = 5, yPos = 5;
		board[xPos][yPos] = true;

		// 10번의 임의 방향으로 걸으면서 -> 고정 값이나 for문을 사용하자
		for (int i = 0; i < 10; i++) {
			// 임의 방향(0,1,2,3)을 만들어내자
			int direction = (int) (Math.random() * 4); // 0~3
			if (direction == 0 && xPos > 0) { // 상 방향
				xPos--;
			} else if (direction == 1 && yPos < ROOT - 1) { // 우 방향
				yPos++;
			} else if (direction == 2 && xPos < ROOT - 1) { // 하 방향
				xPos++;
			} else if (yPos > 0) { // 좌 방향
				yPos--;
			}
			board[xPos][yPos] = true; // 걸었다는 표시

			// 그 궤적을 걸음마다 출력할것임
			for (int row = 0; row < board.length; row++) {
				for (int col = 0; col < board.length; col++) {
					if (board[row][col]) {
						System.out.print("# ");
					} else {
						System.out.print(". ");
					}
				}
				System.out.println();

			}
		}
	}
}
