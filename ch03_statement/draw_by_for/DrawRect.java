package draw_by_for;

public class DrawRect {
	/**
	 * 개발시 복잡도 관리를 위해서 Nesting Level은 4 초과시 범죄를 저지르는 것
	 */ 
	
	
	 /** 
	 * 5행 8열의 사각형 그리기
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
		// 행과 열을 상수로
		final int ROW_COUNT = 5, COL_COUNT = 8;
		// 5행
		for (int rowIdx = 0; rowIdx < ROW_COUNT; rowIdx++) {
			// 8열 만들기
			for (int colIdx = 0; colIdx < COL_COUNT; colIdx++) {
				System.out.print('*');
			}			
			// 행을 나누기
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
		// 행과 열을 상수로
		final int ROW_COUNT = 5, COL_COUNT = 8;
		// 5행
		for (int rowIdx = 0; rowIdx < ROW_COUNT; rowIdx++) {
			// 8열 만들기
			for (int colIdx = 0; colIdx < COL_COUNT; colIdx++) {
				if (rowIdx == 0 || rowIdx == ROW_COUNT - 1) {
					// 첫 행과 마지막 행은 경계
					System.out.print('*');
				} else if (colIdx == 0 || colIdx == COL_COUNT - 1){
					// 첫 열과 마지막 열은 경계
					System.out.print('*');					
				} else {
					// 가운데 공간 채우기
					System.out.print('-');
				}
			}	
			// 행을 나누기
			System.out.println();
		}
	}

}