package ch3_statement_review;

public class Draw_review {

	public static void main(String[] args) {
		//drawRect();
		//drawEmptyRect();
		//drawleftTriangle();
		//drawleftTriangle2();
		//drawRightTriangle();
		//drawRightTriangle2();
		//drawEmptyTraingle();
		//drawEmptyTraingle2();
		//drawArrow();
		drawArrow2();
	}

	/**        �ళ���� 7 ��          ����   
	 * 0 ****			4   -1  1   0
	 * 1  ***			3           1  
	 * 2   **			2           2
 	 * 3    *   �߾�		1   ������ȯ  3 
	 * -------------------------------
	 * 4   **			2	1   -1  2
	 * 5  ***			3           1  
	 * 6 ****			4           0
	 */
	private static void drawArrow2() {
		final int ROW_COUNT = 7; // ���� ��� �� 
		final int COL_COUNT = 4; // ���� ��� ��
		final int CENTER_COUNT = 3; //�߾� �� �� 
		int delOfStar = -1;  //��ǥ�� ���Ⱚ
		int delOfBlank = 1;  //������ ���Ⱚ
		//��
		int colRepeat = COL_COUNT; //���⿡ ���� ���� ��ȭ�� ������ؼ�
		int colRepeat2 = COL_COUNT;
		for(int rowIdx = 0; rowIdx < ROW_COUNT; rowIdx++) {
			// ��(����) 
			for(int colIdx = COL_COUNT; colIdx < colRepeat2; colIdx++) {
				System.out.print("-");
				//�߾��� �Ǹ� ������ȯ
				if (rowIdx == CENTER_COUNT) {
					delOfBlank *= -1;
				}
			}
			// ��(��ǥ)
			for(int colIdx = 0; colIdx < colRepeat; colIdx++) {
				System.out.print("*");
				//�߾��� �Ǹ� ������ȯ
				if (rowIdx == CENTER_COUNT) {
					delOfStar *= -1;
				}
			}									
			System.out.println();
			colRepeat += delOfStar;	
			colRepeat2 += delOfBlank;	
		}
	}

	/**           
	 * 0 ****			4   -1
	 * 1 ***			3
	 * 2 **				2
	 * 3 *   �߾�			1 ������ȯ
	 * --------------------------
	 * 4 **				2	1
	 * 5 ***			3
	 * 6 ****			4
	 */
	private static void drawArrow() {
		final int ROW_COUNT = 7; // ���� ��� �� 
		final int COL_COUNT = 4; // ���� ��� ��
		final int CENTER_COUNT = 3; //�߾� �� �� 
		int delta = -1;  //���Ⱚ
		//��
		int colRepeat = COL_COUNT; //���⿡ ���� ���� ��ȭ�� ������ؼ� 
		for(int rowIdx = 0; rowIdx < ROW_COUNT; rowIdx++) {
			// �� 
			for(int colIdx = 0; colIdx < colRepeat; colIdx++) {
				System.out.print("*");				
			}
			//�߾��� �Ǹ� ������ ����
			if (rowIdx == CENTER_COUNT) {
				delta *= -1;
			}						
			System.out.println();
			colRepeat += delta;			
		}
	}

	/**
	 *        rowIdx   ���鰳��   ������    
	 *      *	1         3       1     
	 *     **   2         2       2
	 *    * *   3         1       2
	 *   ****   4         0       4
	 */
	private static void drawEmptyTraingle2() {
		final int ROW_COUNT = 4; // ���� ��� �� 
		final int COL_COUNT = 4; // ���� ��� �� 
		//��
		for(int rowIdx = 0; rowIdx < ROW_COUNT; rowIdx++) {
			//��(����)
			for(int colIdx = rowIdx; colIdx < COL_COUNT - 1; colIdx++) {
				System.out.print("-");
			}
			// ��(��ǥ)
			for(int colIdx = 0; colIdx <= rowIdx; colIdx++) {
				// ��ǥ�� ù��° ��� ������ ���� ä��
				if (rowIdx == 0 || rowIdx == ROW_COUNT - 1) {
					System.out.print('*');	
					//��ǥ�� ù���� ���� ������ ���� ä�� 
				} else if (colIdx == 0 || colIdx == rowIdx){
					System.out.print("*");
					// �������� ����
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	/**
	 *        rowIdx   ���鰳��   ������    
	 *   ****	1         0       4     
	 *    * *   2         1       2
	 *     **   3         2       2
	 *      *   4         3       1
	 */
	private static void drawEmptyTraingle() {
		final int ROW_COUNT = 4;
		final int COL_COUNT = 4;		
		for(int rowIdx = 0; rowIdx < ROW_COUNT; rowIdx++) {
			for(int colIdx = 0; colIdx < rowIdx; colIdx++) {
				System.out.print("-");
			}
			for(int colIdx = rowIdx; colIdx < COL_COUNT; colIdx++) {
				if (rowIdx == 0 || rowIdx == ROW_COUNT - 1) {
					System.out.print('*');					
				} else if (colIdx == rowIdx || colIdx == COL_COUNT - 1){
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	/**
	 *        rowIdx   ���鰳��   ������    
	 *   ****	1         0       4     
	 *    ***   2         1       3
	 *     **   3         2       2
	 *      *   4         3       1
	 */
	private static void drawRightTriangle2() {
		final int ROW_COUNT = 4;						
		for(int rowIdx = 0; rowIdx < ROW_COUNT; rowIdx++) {
			for(int colIdx = 0; colIdx < rowIdx; colIdx++) {
				System.out.print(" ");
			}
			for(int colIdx = rowIdx; colIdx < ROW_COUNT; colIdx++) {
				System.out.print("*");
			}
			System.out.println();			 
		}
	}

	/**
	 *        rowIdx   ���鰳��   ������    
	 *      *	1         3       1     
	 *     **   2         2       2
	 *    ***   3         1       3
	 *   ****   4         0       4
	 */
	private static void drawRightTriangle() {
		final int ROW_COUNT = 4;						
		for(int rowIdx = 0; rowIdx < ROW_COUNT; rowIdx++) {
			for(int colIdx = rowIdx; colIdx < ROW_COUNT - 1; colIdx++) {
				System.out.print(" ");
			}
			for(int colIdx = 0; colIdx <= rowIdx; colIdx++) {
				System.out.print("*");
			}
			System.out.println();			 
		}
	}

	/** 
	 * 0 1 *	  
	 * 1 2 **   
	 * 2 3 ***
	 * 3 4 ****	  
	 */
	private static void drawleftTriangle2() {
		final int ROW_COUNT = 4;						
		for(int rowIdx = 0; rowIdx < ROW_COUNT; rowIdx++) {
			for(int colIdx = 0; colIdx <= rowIdx; colIdx++) {
				System.out.print("*");
			}
			System.out.println();			 
		}
	}

	/** 
	 * 0 4****	  
	 * 1 3***   
	 * 2 2**
	 * 3 1*	  
	 */
	private static void drawleftTriangle() {
		final int ROW_COUNT = 4;						
		for(int rowIdx = 0; rowIdx < ROW_COUNT; rowIdx++) {
			for(int colIdx = rowIdx; colIdx < ROW_COUNT; colIdx++) {
				System.out.print("*");
			}
			System.out.println();			 
		}
					
	}

	/**
	 * *****	0 5  
	 * *   *	1 2
	 * *   *	2 2
	 * *****	3 5
	 * 4�� 5���� ���簢��
	 */
	private static void drawEmptyRect() {
		for(int rowIdx = 0; rowIdx < 4; rowIdx++) {
			for(int colIdx = 0; colIdx < 5; colIdx++) {
				if (rowIdx == 0 || rowIdx == 3) {
					System.out.print("*");	
				} else if(colIdx == 0 || colIdx == 4) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	/**
	 * *****	0 5  
	 * *****	1 5
	 * *****	2 5
	 * *****	3 5
	 * 4�� 5���� ���簢��
	 */
	private static void drawRect() {
		for(int rowIdx = 0; rowIdx < 4; rowIdx++) {
			for(int colIdx = 0; colIdx < 5; colIdx++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
