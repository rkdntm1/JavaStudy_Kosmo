package binArray;

/**
 * 10 * 10�� �ǿ� ������ �߾ӿ� ���� 10���� ���� �������� �����鼭 �� ������ �������� ����Ұ���
 */
public class RandomWalk_byTeacher {

	public static void main(String[] args) {
		// 10 * 10�� ��
		final int ROOT = 10;
		boolean[][] board = new boolean[ROOT][ROOT];

		// ������ �� ��ġ, ������ �߾ӿ� ����
		int xPos = 5, yPos = 5;
		board[xPos][yPos] = true;

		// 10���� ���� �������� �����鼭 -> ���� ���̳� for���� �������
		for (int i = 0; i < 10; i++) {
			// ���� ����(0,1,2,3)�� ������
			int direction = (int) (Math.random() * 4); // 0~3
			if (direction == 0 && xPos > 0) { // �� ����
				xPos--;
			} else if (direction == 1 && yPos < ROOT - 1) { // �� ����
				yPos++;
			} else if (direction == 2 && xPos < ROOT - 1) { // �� ����
				xPos++;
			} else if (yPos > 0) { // �� ����
				yPos--;
			}
			board[xPos][yPos] = true; // �ɾ��ٴ� ǥ��

			// �� ������ �������� ����Ұ���
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
