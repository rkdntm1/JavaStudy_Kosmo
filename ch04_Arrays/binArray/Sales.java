package binArray;

public class Sales {
	/**
	 * 회사의 3년간 매출 총액을 구하시오.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		totalY();
		System.out.println();
		totalOfY();
		System.out.println();
		totalOfQ();
	}

	private static void totalY() {
		int[][] sales = { 
				{ 4, 3, 6, 8 }, 
				{ 1, 6, 4, 2 },
				{ 1, 7, 2, 4 }
				};
		// 3년의 매출 총액 구하기
		int totalYear = 0;
		for (int i = 0; i < sales.length; i++) {
			for (int j = 0; j < sales[i].length; j++) {
				totalYear += sales[i][j];
			}
		}
		System.out.print("총액 " + totalYear);
	}
	
	/**
	 * 년도별 총액 구하기
	 */
	private static void totalOfY() {
		int[][] sales = { 
				{ 4, 3, 6, 8 }, //21 
				{ 1, 6, 4, 2 }, //13
				{ 1, 7, 2, 4 }  //14
				};
		// 3년의 매출 총액 구하기
		int[] totalArrayOfYear = new int[3]; 
		for (int i = 0; i < sales.length; i++) {
			for (int j = 0; j < sales[i].length; j++) {				
				totalArrayOfYear[i] += sales[i][j];
			}
		}
		System.out.print("년도별 총액: ");
		for (int i = 0; i < totalArrayOfYear.length; i++) {
			System.out.print(totalArrayOfYear[i] + " ");
		}
		
	}
	
	/**
	 * 분기별 총액 구하기 6 16 12 14
	 */
	private static void totalOfQ() {
		int[][] sales = { 
				{ 4, 3, 6, 8 }, //21 
				{ 1, 6, 4, 2 }, //13
				{ 1, 7, 2, 4 }  //14
				};		
		int[] totalArrayOfQ = new int[4]; 
		for (int i = 0; i < sales.length; i++) {
			for (int j = 0; j < sales[i].length; j++) {				
				totalArrayOfQ[j] += sales[i][j];
			}
		}
		System.out.print("분기별 총액: ");
		for (int i = 0; i < totalArrayOfQ.length; i++) {
			System.out.print(totalArrayOfQ[i] + " ");
		}
		
	}
	
}
