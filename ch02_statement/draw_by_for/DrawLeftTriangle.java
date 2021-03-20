package draw_by_for;

public class DrawLeftTriangle {
	 /** 
	 * 4행 4열의 반전 왼쪽에 치우쳐진 삼각형 그리기
	 * 
	 * ****
	 * ***
	 * **
	 * *	  
	 */
	public static void main(String[] args) {
		// 행과 열을 상수로
		final int ROW_COUNT = 4;
		// 4행
		for (int rowIdx = 0; rowIdx < ROW_COUNT; rowIdx--) {
			// 4열 만들기
			for (int colIdx = 0; colIdx <= rowIdx; colIdx++) {
				System.out.print('*');
			}			
			// 행을 나누기
			System.out.println();
		}
	}
}
