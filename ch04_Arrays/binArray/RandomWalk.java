
package binArray;

public class RandomWalk {

	/**
	 * 10 x 10 Ÿ�Ͽ��� �߾ӿ� ��ġ�� Ÿ���� ���� 
	 * �� �������� �������� ǥ���Ͻÿ�
	 * @param args
	 */
	public static void main(String[] args) {
		final int ROOT = 10;
		boolean[][] tile = new boolean[ROOT][ROOT];
		int x = 5, y = 5; // Ÿ���� ��ġ
		tile[x][y] = true; // Ÿ���� ������ġ
		// Ÿ�� ������ ǥ��(10���� �ɾ��ٰ� ��������)
		for (int step = 0; step < 10; step++) {
			// �� �� �� �� (4���� ���� ǥ�ø� ���� 0~3 ���� ���� ��������)
			int direction = (int) (Math.random() * 4); // 0,1,2,3
			if (direction == 0 && x > 0) {  //��
				x++; 
			} else if (direction == 1 && x < 9) { // ��
				x--; 
			} else if (direction == 2 && y > 0 ) { // ��
				y--; 
			} else if (y < 9) { // ��
				y++; 
			}
			tile[x][y] = true; // �������� �ڸ��� true ������ ����

			// Ÿ�� �׸���
			for (int row = 0; row < tile.length; row++) {
				for (int col = 0; col < tile.length; col++) {
					if (tile[row][col]) {
						System.out.print("x "); // ������ �ڸ� x
					} else {
						System.out.print(". "); // �����ʴ� �ڸ� .
					}
				}
				System.out.println();
			}
			System.out.println("-----------------------");
		}
	}
}
