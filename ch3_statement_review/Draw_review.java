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
	private static void drawArrow2() {
		final int ROW_COUNT = 7; // 행의 상수 값 
		final int COL_COUNT = 4; // 열의 상수 값
		final int CENTER_COUNT = 3; //중앙 행 값 
		int delOfStar = -1;  //별표의 방향값
		int delOfBlank = 1;  //공백의 방향값
		//행
		int colRepeat = COL_COUNT; //방향에 따른 값의 변화를 담기위해서
		int colRepeat2 = COL_COUNT;
		for(int rowIdx = 0; rowIdx < ROW_COUNT; rowIdx++) {
			// 열(공백) 
			for(int colIdx = COL_COUNT; colIdx < colRepeat2; colIdx++) {
				System.out.print("-");
				//중앙이 되면 방향전환
				if (rowIdx == CENTER_COUNT) {
					delOfBlank *= -1;
				}
			}
			// 열(별표)
			for(int colIdx = 0; colIdx < colRepeat; colIdx++) {
				System.out.print("*");
				//중앙이 되면 방향전환
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
	 * 3 *   중앙			1 방향전환
	 * --------------------------
	 * 4 **				2	1
	 * 5 ***			3
	 * 6 ****			4
	 */
	private static void drawArrow() {
		final int ROW_COUNT = 7; // 행의 상수 값 
		final int COL_COUNT = 4; // 열의 상수 값
		final int CENTER_COUNT = 3; //중앙 행 값 
		int delta = -1;  //방향값
		//행
		int colRepeat = COL_COUNT; //방향에 따른 값의 변화를 담기위해서 
		for(int rowIdx = 0; rowIdx < ROW_COUNT; rowIdx++) {
			// 열 
			for(int colIdx = 0; colIdx < colRepeat; colIdx++) {
				System.out.print("*");				
			}
			//중앙이 되면 방향의 변경
			if (rowIdx == CENTER_COUNT) {
				delta *= -1;
			}						
			System.out.println();
			colRepeat += delta;			
		}
	}

	/**
	 *        rowIdx   공백개수   별개수    
	 *      *	1         3       1     
	 *     **   2         2       2
	 *    * *   3         1       2
	 *   ****   4         0       4
	 */
	private static void drawEmptyTraingle2() {
		final int ROW_COUNT = 4; // 행의 상수 값 
		final int COL_COUNT = 4; // 열의 상수 값 
		//행
		for(int rowIdx = 0; rowIdx < ROW_COUNT; rowIdx++) {
			//열(공백)
			for(int colIdx = rowIdx; colIdx < COL_COUNT - 1; colIdx++) {
				System.out.print("-");
			}
			// 열(별표)
			for(int colIdx = 0; colIdx <= rowIdx; colIdx++) {
				// 별표의 첫번째 행과 마지막 행은 채움
				if (rowIdx == 0 || rowIdx == ROW_COUNT - 1) {
					System.out.print('*');	
					//별표의 첫번쨰 열과 마지막 열은 채움 
				} else if (colIdx == 0 || colIdx == rowIdx){
					System.out.print("*");
					// 나머지는 공백
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	/**
	 *        rowIdx   공백개수   별개수    
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
	 *        rowIdx   공백개수   별개수    
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
	 *        rowIdx   공백개수   별개수    
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
	 * 4행 5열의 직사각형
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
	 * 4행 5열의 직사각형
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
