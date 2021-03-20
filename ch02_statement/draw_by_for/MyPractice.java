package draw_by_for;

public class MyPractice {

	public static void main(String[] args) {
		rectangle5();
	}
/**         행  열 
 *   *****  1	5  방향값 -1
 *   ****	2	4
 *   ***	3	3
 *   **		4	2
 *   *		5	1
 */
	private static void rectangle() {
		final int ROW_COUNT = 5;
		final int delta = -1;
		//5행 
		int rowRepeat = ROW_COUNT;
		for (int rowIdx = 0; rowIdx < ROW_COUNT; rowIdx++) {			
			for (int colIdx = 0; colIdx < rowRepeat; colIdx++) {
				System.out.print("*");
			}
			System.out.println();
			rowRepeat += delta;
		}
	}
	/**         행  열 
	 *   *****  1	5  
	 *   *  *	2	2
	 *   * *	3	2
	 *   **		4	2
	 *   *		5	1
	 */
	private static void rectangle2() {
		final int ROW_COUNT = 5;
		final int delta = -1;
		//5행 
		int rowRepeat = ROW_COUNT;
		for (int rowIdx = 0; rowIdx < ROW_COUNT; rowIdx++) {			
			for (int colIdx = 0; colIdx < rowRepeat; colIdx++) {
				if (rowIdx == 0 || rowIdx == ROW_COUNT - 1) {
					System.out.print("*");
				} else if (colIdx == 0 || colIdx == rowRepeat - 1) {
					System.out.print("*");
				} else {
					System.out.print("-");
				}
				
			}
			System.out.println();
			rowRepeat += delta;
		}
	}
	/**         행  열 
	 *   *      1	1  
	 *   **	    2	2
	 *   ***	3	3
	 *   ****	4	4
	 *   *****	5	5
	 */
	private static void rectangle3() {
		final int ROW_COUNT = 5;
		//5행 
		int rowRepeat = ROW_COUNT;
		for (int rowIdx = 0; rowIdx < ROW_COUNT; rowIdx++) {			
			for (int colIdx = 0; colIdx <= rowIdx ; colIdx++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/**         행  열 
	 *   *      1	1  
	 *   **	    2	2
	 *   * *	3	2
	 *   *  *	4	2
	 *   *****	5	5
	 */
	private static void rectangle4() {
		final int ROW_COUNT = 5;
		//5행 
		int rowRepeat = ROW_COUNT;
		for (int rowIdx = 0; rowIdx < ROW_COUNT; rowIdx++) {			
			for (int colIdx = 0; colIdx <= rowIdx ; colIdx++) {
				if (rowIdx == 0 || rowIdx == ROW_COUNT - 1) {
					System.out.print("*");
				} else if (colIdx == 0 || colIdx == rowIdx) {
					System.out.print("*");
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}
	
	/**         행  열 공백 
	 *       *  1	1   4
	 *      **	2	2	3
	 *     ***	3	3	2
	 *    ****	4	4	1
	 *   *****	5	5	0
	 */
	private static void rectangle5() {
	/*	final int ROW_COUNT = 5;
		final int COL_COUNT = 5;
		int delta = -1; 
		//5행 
		int colRepeat = COL_COUNT;
		for (int rowIdx = 0; rowIdx < ROW_COUNT; rowIdx++) {			
			for (int colIdx = 0; colIdx < colRepeat - 1; colIdx++) {
				System.out.print("-");				
			}
			for (int colIdx = 0; colIdx <= rowIdx; colIdx++) {
				System.out.print("*");				
			}
			System.out.println();
			colRepeat += delta;
		} */
		final int ROW = 5;
		final int COL = 5;
		for (int rowIdx = 0; rowIdx < ROW; rowIdx++) {			
			for (int colIdx = 0; colIdx < COL - rowIdx - 1; colIdx++) {
				System.out.print("-");				
			}
			for (int colIdx = 0; colIdx <= rowIdx; colIdx++) {
				System.out.print("*");				
			}
			System.out.println();
		}
		
	}
	
	/**         행  열 공백 
	 *       *  1	1   4
	 *      **	2	2	3
	 *     * *	3	2	2
	 *    *  *	4	2	1
	 *   *****	5	5	0
	 */
	private static void rectangle6() {
		final int ROW_COUNT = 5;
		final int COL_COUNT = 5;
		int delta = -1; 
		//5행 
		int colRepeat = COL_COUNT;
		for (int rowIdx = 0; rowIdx < ROW_COUNT; rowIdx++) {			
			for (int colIdx = 0; colIdx < colRepeat - 1; colIdx++) {
				System.out.print("-");				
			}
			for (int colIdx = 0; colIdx <= rowIdx; colIdx++) {
				if (rowIdx == 0 || rowIdx == ROW_COUNT - 1) {
					System.out.print("*");
				} else if (colIdx == 0 || colIdx == rowIdx) {
					System.out.print("*");
				} else {
					System.out.print("-");
				}
			}			
			System.out.println();
			colRepeat += delta;
		}
	}
	
	/**         행  열  공백 
	 *    ***** 1	5   0
	 *     ****	2	4	1
	 *      ***	3	3	2
	 *       **	4	2	3
	 *   	  * 5	1	4
	 */
	private static void rectangle7() {
		final int ROW_COUNT = 5;
		final int COL_COUNT = 5;
		int delta = -1; 
		//5행 
		int colRepeat = COL_COUNT;
		for (int rowIdx = 0; rowIdx < ROW_COUNT; rowIdx++) {			
			for (int colIdx = 0; colIdx < rowIdx  ; colIdx++) {
				System.out.print("-");				
			}
			for (int colIdx = 0; colIdx < colRepeat; colIdx++) {
				System.out.print("*");
			}			
			System.out.println();
			colRepeat += delta;
		}
	}
	
	/**         행  열  공백 
	 *    ***** 1	5   0
	 *     *  *	2	4	1
	 *      * *	3	3	2
	 *       **	4	2	3
	 *   	  * 5	1	4
	 */
	private static void rectangle8() {
		final int ROW_COUNT = 5;
		final int COL_COUNT = 5;
		int delta = -1; 
		//5행 
		int colRepeat = COL_COUNT;
		for (int rowIdx = 0; rowIdx < ROW_COUNT; rowIdx++) {			
			for (int colIdx = 0; colIdx < rowIdx  ; colIdx++) {
				System.out.print("-");				
			}
			for (int colIdx = 0; colIdx < colRepeat; colIdx++) {
				if (rowIdx == 0 || rowIdx == ROW_COUNT - 1) {
					System.out.print("*");
				} else if (colIdx == 0 || colIdx == colRepeat - 1) {
					System.out.print("*");
				} else {
					System.out.print("-");
				}
			}			
			System.out.println();
			colRepeat += delta;
		}
	}
	
	/**        행개수는 7   
	 * 0 ****			4   -1
	 * 1 ***			3
	 * 2 **				2
	 * 3 *   중앙			1 방향전환
	 * --------------------------
	 * 4 **				2	1
	 * 5 ***			3
	 * 6 ****			4
	 */
	private static void rectangle9() {
		final int ROW_COUNT = 7;
		final int COL_COUNT = 4;
		final int CENTER_ROW = 3;
		int delta = -1; 
		//5행 
		int colRepeat = COL_COUNT;
		for (int rowIdx = 0; rowIdx < ROW_COUNT; rowIdx++) {			
			for (int colIdx = 0; colIdx < colRepeat; colIdx++) {
				System.out.print("*");				
			}						
			System.out.println();
			if (rowIdx == CENTER_ROW) {
				delta *= -1;
			}
			colRepeat += delta;
		}
	}
	
	/**        행개수는 7 별          공백    
	 * 0 ****			4   -1  1   0
	 * 1  ***			3           1  
	 * 2   **			2           2
 	 * 3    *   중앙		1   방향전환  3 
	 * -------------------------------
	 * 4   **			2	1   -1  2
	 * 5  ***			3           1  
	 * 6 ****			4           0
	 */
	private static void rectangle10() {
		final int ROW_COUNT = 7;
		final int COL_COUNT = 4;
		final int CENTER_ROW = 3;
		int delta = -1;
		int delta2 = 1;
		//5행 
		int colRepeat = COL_COUNT;
		int colRepeat2 = COL_COUNT;
		for (int rowIdx = 0; rowIdx < ROW_COUNT; rowIdx++) {			
			for (int colIdx = 0; colIdx <  colRepeat2 - COL_COUNT; colIdx++) {
				System.out.print("-"); //0 1 2 3 				
			}						
			for (int colIdx = 0; colIdx < colRepeat; colIdx++) {
				System.out.print("*");				
			}			
			System.out.println();
			if (rowIdx == CENTER_ROW) {
				delta *= -1;
				delta2 *= -1; 
			}
			colRepeat += delta;
			colRepeat2 += delta2;
		}
	}
	
}
