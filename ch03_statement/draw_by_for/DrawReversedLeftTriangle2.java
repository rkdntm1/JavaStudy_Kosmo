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
		 * 왼쪽 기준 4행 4열의 반전으로 왼쪽에 치우쳐진 삼각형 그리기
		 * 
		 * **** 4
		 * *** 3
		 * ** 2
		 * * 1	   
		 */
	private static void extracted() {
		// 행 초기값 설정
		final int ROW_COUNT = 6;
		// 행 만들기
		for (int rowIdx = ROW_COUNT; rowIdx >= 0;  rowIdx--) {
			// 열 만들기
			for (int colIdx = 0; colIdx < rowIdx; colIdx++) {
				System.out.print('*');
			}			
			// 행을 나누기
			System.out.println();
		}
	}
	
	/** 왼쪽기준 리버스 속이 비워진 삼각형 만들기
	 * 1**** 
	 * 2* *
	 * 3**
	 * 4*
	 *  
	 */
	private static void empty() {
		// 행 초기값 설정
		final int ROW_COUNT = 6;
		// 행 만들기
		for (int rowIdx = ROW_COUNT; rowIdx >= 0;  rowIdx--) {
			// 열 만들기
			for (int colIdx = 0; colIdx < rowIdx; colIdx++) {
				if (rowIdx == ROW_COUNT || rowIdx == 0) {
					// 첫 행(ROW_COUNT)과 마지막 행(0)은 경계
					System.out.print('*');
				} else if (colIdx == 0 || colIdx == rowIdx - 1){
					// 첫 열(0)과 마지막 열(rowIdx - 1)은 경계
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
	
	/** 속이 비워진 왼쪽 기준 삼각형 
	 * 
	 * 1*
	 * 2**
	 * 3*-*
	 * 4*--*
	 *  만들기  
	 */
	private static void empty2() {
		// 행 초기값 설정
		final int ROW_COUNT = 6;
		// 행 만들기
		for (int rowIdx = 0; rowIdx < ROW_COUNT ;  rowIdx++) {
			// 열 만들기
			for (int colIdx = 0; colIdx <= rowIdx; colIdx++) {
				if (rowIdx == 0 || rowIdx == ROW_COUNT-1) {
					// 첫 행(0)과 마지막 행(ROW_COUNT)은 경계
					System.out.print('*');
				} else if (colIdx == 0 || colIdx == rowIdx){
					// 첫 열(0)과 마지막 열(rowIdx)은 경계
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
