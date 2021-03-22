
package binArray;

public class RandomWalk {

	/**
	 * 10 x 10 타일에서 중앙에 위치한 타겟을 놓고 
	 * 그 움직임을 걸음마다 표시하시오
	 * @param args
	 */
	public static void main(String[] args) {
		final int ROOT = 10;
		boolean[][] tile = new boolean[ROOT][ROOT];
		int x = 5, y = 5; // 타겟의 위치
		tile[x][y] = true; // 타겟의 현재위치
		// 타겟 움직임 표시(10걸음 걸었다고 가정하자)
		for (int step = 0; step < 10; step++) {
			// 상 하 좌 우 (4개의 정보 표시를 위해 0~3 랜덤 값을 가져오자)
			int direction = (int) (Math.random() * 4); // 0,1,2,3
			if (direction == 0 && x > 0) {  //상
				x++; 
			} else if (direction == 1 && x < 9) { // 하
				x--; 
			} else if (direction == 2 && y > 0 ) { // 좌
				y--; 
			} else if (y < 9) { // 우
				y++; 
			}
			tile[x][y] = true; // 움직임인 자리는 true 값으로 지정

			// 타일 그리기
			for (int row = 0; row < tile.length; row++) {
				for (int col = 0; col < tile.length; col++) {
					if (tile[row][col]) {
						System.out.print("x "); // 움직인 자리 x
					} else {
						System.out.print(". "); // 가지않는 자리 .
					}
				}
				System.out.println();
			}
			System.out.println("-----------------------");
		}
	}
}
