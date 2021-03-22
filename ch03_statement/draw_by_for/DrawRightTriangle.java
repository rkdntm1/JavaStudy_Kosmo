package draw_by_for;
/**
 * State Transition Machine  = Computer 
 * 상태 - 변수, 산수 (변수에들어간 값이 연사자를 통해 어떻게 변화를 하는지 따라가야한다)
 * 변환 - 
 *
 */
public class DrawRightTriangle {
	 
	public static void main(String[] args) {
		filled();
		System.out.println();
		empty();
	}

	/**
	 * 6행 오른쪽에 치우쳐진 삼각형 그리기
	 *        rowIdx   공백개수   별개수    주어진행개수
	 *      *	1         5       1         6
	 *     **   2         4       2
	 *    ***   3         3       3
	 *   ****   4         2       4
	 *  *****   5         1       5
	 * ******   6         0       6
	 */

	private static void filled() {
		// 행과 열을 상수로
		final int ROW_COUNT =6; 
		// 행
		for (int rowIdx = 1 ; rowIdx <= ROW_COUNT; rowIdx++) {
			// 열 만들기 (공백채우기)
			for (int colIdx = 0; colIdx < ROW_COUNT - rowIdx; colIdx++) {
				System.out.print('-');
			}//(별표채우기)
			for (int colIdx = 0; colIdx < rowIdx; colIdx ++) {
				System.out.print('*');
			}
			System.out.println();
			}			
		}	
	
	/** 
	 * n행의 오른쪽에 치우쳐진 삼각형 그리기
	 *       rowIdx   별
	 *     *   1      1
	 *    **   2      2
	 *   * *   3      2 
	 *  ****   4      4
	 * 	  ...
	 */
	private static void empty() {
		// 행과 열을 상수로
		
		// 행
		final int ROW_COUNT =6; 
		// 행
		for (int rowIdx = 1 ; rowIdx <= ROW_COUNT; rowIdx++) {
			// 열 만들기 (공백채우기)
			for (int colIdx = 0; colIdx < ROW_COUNT - rowIdx; colIdx++) {
				System.out.print('-');
			}//(별표채우기)
			for (int colIdx = 0; colIdx < rowIdx; colIdx ++) {
				//별표채우기 안에서 빈칸을 만들기 위해 조건 추가하기
				if (rowIdx == 1 || rowIdx == ROW_COUNT) {
					// 첫 행(1)과 마지막 행(ROW_COUNT)은 경계
					System.out.print('*');				
				} else if (colIdx == 0 || colIdx == rowIdx - 1){
					// 첫 열(0)과 마지막 열(rowIdx - 1)은 경계
					System.out.print('*');					
				} else {
					// 가운데 공간 채우기
					System.out.print('-');
				}
			}
			System.out.println();
		}			
	}
}

