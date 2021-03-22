package ch4_Arrays_review;

public class BinArray {

	public static void main(String[] args) {
		totalOfAll();
		totalOfYear();
		totalOfQuQuater();
	}

	/**
	 * 회사의 분기별 총액을 출력하시오
	 */
	private static void totalOfQuQuater() {
		// 년도, 분기 배열 (3년 4분기)
		final int YEAR = 3;
		final int QUATER = 4;
		int[][] sales = { 
				{ 4, 3, 6, 8 },
				{ 1, 6, 4, 2 },
				{ 1, 7, 2, 4 }
				};
		// 년도별 저장배열 만들기
		int[] quater = new int[QUATER];
		for (int ydx = 0; ydx < sales.length; ydx++) { // 3년도로 나누기
			for (int qdx = 0; qdx < sales[0].length; qdx++) {// 4분기로 나누기
				quater[qdx] += sales[ydx][qdx];
			}
		}
		for (int idx = 0; idx < sales[0].length; idx++) {
			System.out.println(idx + 1 + "분기 총액: " + quater[idx]);
		}

	}

	/**
	 * 회사의 년도별 총액을 출력하시오
	 */
	private static void totalOfYear() {
		// 년도, 분기 배열 (3년 4분기)
		final int YEAR = 3;
		int[][] sales = { 
				{ 4, 3, 6, 8 },
				{ 1, 6, 4, 2 },
				{ 1, 7, 2, 4 }
				};
		// 년도별 저장배열 만들기
		int[] year = new int[YEAR];
		for (int ydx = 0; ydx < sales.length; ydx++) { // 3년도로 나누기
			for (int qdx = 0; qdx < sales[0].length; qdx++) {// 4분기로 나누기
				year[ydx] += sales[ydx][qdx];
			}
		}
		for (int idx = 0; idx < sales.length; idx++) {
			System.out.println(idx + 1 + "년도 총액: " + year[idx]);
		}
	}

	/**
	 * 회사의 3년간 매출 총액을 구하시오.
	 */
	private static void totalOfAll() {
		// 년도, 분기 배열 (3년 4분기)
		final int YEAR = 3;
		int[][] sales = { 
				{ 4, 3, 6, 8 },
				{ 1, 6, 4, 2 },
				{ 1, 7, 2, 4 }
				};
		// 3년의 매출 총액
		int totalOfAll = 0;
		for (int ydx = 0; ydx < sales.length; ydx++) { // 3년도로 나누기
			for (int qdx = 0; qdx < sales[0].length; qdx++) {// 4분기로 나누기
				totalOfAll += sales[ydx][qdx];
			}
		}
		System.out.println("3년간 총액 : " + totalOfAll);
	}

}
