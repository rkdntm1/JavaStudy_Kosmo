package draw_by_for;

public class DrawReversedLeftTriangle2 {
	
	public static void main(String[] args) {
		extracted();
		System.out.println();
		empty();
		System.out.println();
		empty2();
	}
	 /** 
		 * ���� ���� 4�� 4���� �������� ���ʿ� ġ������ �ﰢ�� �׸���
		 * 
		 * **** 4
		 * *** 3
		 * ** 2
		 * * 1	   
		 */
	private static void extracted() {
		// �� �ʱⰪ ����
		final int ROW_COUNT = 6;
		// �� �����
		for (int rowIdx = ROW_COUNT; rowIdx >= 0;  rowIdx--) {
			// �� �����
			for (int colIdx = 0; colIdx < rowIdx; colIdx++) {
				System.out.print('*');
			}			
			// ���� ������
			System.out.println();
		}
	}
	
	/** ���ʱ��� ������ ���� ����� �ﰢ�� �����
	 * 1**** 
	 * 2* *
	 * 3**
	 * 4*
	 *  
	 */
	private static void empty() {
		// �� �ʱⰪ ����
		final int ROW_COUNT = 6;
		// �� �����
		for (int rowIdx = ROW_COUNT; rowIdx >= 0;  rowIdx--) {
			// �� �����
			for (int colIdx = 0; colIdx < rowIdx; colIdx++) {
				if (rowIdx == ROW_COUNT || rowIdx == 0) {
					// ù ��(ROW_COUNT)�� ������ ��(0)�� ���
					System.out.print('*');
				} else if (colIdx == 0 || colIdx == rowIdx - 1){
					// ù ��(0)�� ������ ��(rowIdx - 1)�� ���
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
	
	/** ���� ����� ���� ���� �ﰢ�� 
	 * 
	 * 1*
	 * 2**
	 * 3*-*
	 * 4*--*
	 *  �����  
	 */
	private static void empty2() {
		// �� �ʱⰪ ����
		final int ROW_COUNT = 6;
		// �� �����
		for (int rowIdx = 0; rowIdx < ROW_COUNT ;  rowIdx++) {
			// �� �����
			for (int colIdx = 0; colIdx <= rowIdx; colIdx++) {
				if (rowIdx == 0 || rowIdx == ROW_COUNT-1) {
					// ù ��(0)�� ������ ��(ROW_COUNT)�� ���
					System.out.print('*');
				} else if (colIdx == 0 || colIdx == rowIdx){
					// ù ��(0)�� ������ ��(rowIdx)�� ���
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
