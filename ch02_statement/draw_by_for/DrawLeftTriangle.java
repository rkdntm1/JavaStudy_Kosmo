package draw_by_for;

public class DrawLeftTriangle {
	 /** 
	 * 4�� 4���� ���� ���ʿ� ġ������ �ﰢ�� �׸���
	 * 
	 * ****
	 * ***
	 * **
	 * *	  
	 */
	public static void main(String[] args) {
		// ��� ���� �����
		final int ROW_COUNT = 4;
		// 4��
		for (int rowIdx = 0; rowIdx < ROW_COUNT; rowIdx--) {
			// 4�� �����
			for (int colIdx = 0; colIdx <= rowIdx; colIdx++) {
				System.out.print('*');
			}			
			// ���� ������
			System.out.println();
		}
	}
}
