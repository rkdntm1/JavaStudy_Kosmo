package draw_by_for;

public class DrawArrow {

	public static void main(String[] args) {
		//filled();
		reversefilled();
	}
	/**        �ళ���� 7   
	 * 0 ****			4   -1
	 * 1 ***			3
	 * 2 **				2
	 * 3 *   �߾�			1 ������ȯ
	 * --------------------------
	 * 4 **				2	1
	 * 5 ***			3
	 * 6 ****			4
	 */
	private static void filled() {
		final int ROW_COUNT = 7, COL_COUNT = 4; // �� �� �� ���� 
		final int CENTER_ROW = ROW_COUNT / 2; //�߾� �� ����
		int delta = -1; // ù��� ��������
		
		int colRepeat = COL_COUNT;
		for (int rowIdx = 0; rowIdx < ROW_COUNT; rowIdx++) {			
			for (int colIdx = 0; colIdx < colRepeat; colIdx ++) {
				System.out.print("*");
			}
			System.out.println();
			if (rowIdx == CENTER_ROW) {
				delta *= -1;
			}
			colRepeat += delta;
		}
	}
	
	/**        �ళ���� 7               
	 * 0 ****			4   -1  1   0
	 * 1  ***			3           1  
	 * 2   **			2           2
 	 * 3    *   �߾�		1   ������ȯ  3 
	 * -------------------------------
	 * 4   **			2	1   -1  2
	 * 5  ***			3           1  
	 * 6 ****			4           0
	 */
	private static void reversefilled() {
		final int ROW_COUNT = 7, COL_COUNT = 4; // �� �� �� ���� 
		final int CENTER_ROW = ROW_COUNT / 2; //�߾� �� ����
		int delta1 = 1; // ������� ��������
		int delta2 = -1; // ��ǥ���� �������� 
		
		int colRepeat = COL_COUNT;
		int colRepeat2 = COL_COUNT;
		for (int rowIdx = 0; rowIdx < ROW_COUNT; rowIdx++) {
			//����
			for (int colIdx = COL_COUNT; colIdx < colRepeat ; colIdx ++) { 
				System.out.print("-");                                 
			}
			//��
			for (int colIdx = 0; colIdx <= colRepeat2; colIdx ++) {
				System.out.print("*");
			}
			System.out.println();
			if (rowIdx == CENTER_ROW) {
				delta1 *= -1;
				delta2 *= -1;
			}
			colRepeat += delta1;
			colRepeat2 += delta2;
			
		}
	}

}
