package draw_by_for;

public class DrawRect {
	/**
	 * ���߽� ���⵵ ������ ���ؼ� Nesting Level�� 4 �ʰ��� ���˸� �������� ��
	 */ 
	
	
	 /** 
	 * 5�� 8���� �簢�� �׸���
	 * ********
	   ********
	   ********
	   ********
	   ********	  
	 */
	public static void main(String[] args) {
//		filled();
		empty();
	}

	private static void filled() {
		// ��� ���� �����
		final int ROW_COUNT = 5, COL_COUNT = 8;
		// 5��
		for (int rowIdx = 0; rowIdx < ROW_COUNT; rowIdx++) {
			// 8�� �����
			for (int colIdx = 0; colIdx < COL_COUNT; colIdx++) {
				System.out.print('*');
			}			
			// ���� ������
			System.out.println();
		}
	}
	
	/**
	 * 0 ******* n  
	 * 1 *     * 2
	 * 2 *     * 2
	 * 3 *     * 2
	 * 4 ******* n    
	 */
	private static void empty() {
		// ��� ���� �����
		final int ROW_COUNT = 5, COL_COUNT = 8;
		// 5��
		for (int rowIdx = 0; rowIdx < ROW_COUNT; rowIdx++) {
			// 8�� �����
			for (int colIdx = 0; colIdx < COL_COUNT; colIdx++) {
				if (rowIdx == 0 || rowIdx == ROW_COUNT - 1) {
					// ù ��� ������ ���� ���
					System.out.print('*');
				} else if (colIdx == 0 || colIdx == COL_COUNT - 1){
					// ù ���� ������ ���� ���
					System.out.print('*');					
				} else {
					// ��� ���� ä���
					System.out.print('-');
				}
			}	
			// ���� ������
			System.out.println();
		}
	}

}