package draw_by_for;
/**
 * State Transition Machine  = Computer 
 * ���� - ����, ��� (�������� ���� �����ڸ� ���� ��� ��ȭ�� �ϴ��� ���󰡾��Ѵ�)
 * ��ȯ - 
 *
 */
public class DrawRightTriangle {
	 
	public static void main(String[] args) {
		filled();
		System.out.println();
		empty();
	}

	/**
	 * 6�� �����ʿ� ġ������ �ﰢ�� �׸���
	 *        rowIdx   ���鰳��   ������    �־����ళ��
	 *      *	1         5       1         6
	 *     **   2         4       2
	 *    ***   3         3       3
	 *   ****   4         2       4
	 *  *****   5         1       5
	 * ******   6         0       6
	 */

	private static void filled() {
		// ��� ���� �����
		final int ROW_COUNT =6; 
		// ��
		for (int rowIdx = 1 ; rowIdx <= ROW_COUNT; rowIdx++) {
			// �� ����� (����ä���)
			for (int colIdx = 0; colIdx < ROW_COUNT - rowIdx; colIdx++) {
				System.out.print('-');
			}//(��ǥä���)
			for (int colIdx = 0; colIdx < rowIdx; colIdx ++) {
				System.out.print('*');
			}
			System.out.println();
			}			
		}	
	
	/** 
	 * n���� �����ʿ� ġ������ �ﰢ�� �׸���
	 *       rowIdx   ��
	 *     *   1      1
	 *    **   2      2
	 *   * *   3      2 
	 *  ****   4      4
	 * 	  ...
	 */
	private static void empty() {
		// ��� ���� �����
		
		// ��
		final int ROW_COUNT =6; 
		// ��
		for (int rowIdx = 1 ; rowIdx <= ROW_COUNT; rowIdx++) {
			// �� ����� (����ä���)
			for (int colIdx = 0; colIdx < ROW_COUNT - rowIdx; colIdx++) {
				System.out.print('-');
			}//(��ǥä���)
			for (int colIdx = 0; colIdx < rowIdx; colIdx ++) {
				//��ǥä��� �ȿ��� ��ĭ�� ����� ���� ���� �߰��ϱ�
				if (rowIdx == 1 || rowIdx == ROW_COUNT) {
					// ù ��(1)�� ������ ��(ROW_COUNT)�� ���
					System.out.print('*');				
				} else if (colIdx == 0 || colIdx == rowIdx - 1){
					// ù ��(0)�� ������ ��(rowIdx - 1)�� ���
					System.out.print('*');					
				} else {
					// ��� ���� ä���
					System.out.print('-');
				}
			}
			System.out.println();
		}			
	}
}

