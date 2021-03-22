package binArray;

public class Sales {
	/**
	 * ȸ���� 3�Ⱓ ���� �Ѿ��� ���Ͻÿ�.
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
		// 3���� ���� �Ѿ� ���ϱ�
		int totalYear = 0;
		for (int i = 0; i < sales.length; i++) {
			for (int j = 0; j < sales[i].length; j++) {
				totalYear += sales[i][j];
			}
		}
		System.out.print("�Ѿ� " + totalYear);
	}
	
	/**
	 * �⵵�� �Ѿ� ���ϱ�
	 */
	private static void totalOfY() {
		int[][] sales = { 
				{ 4, 3, 6, 8 }, //21 
				{ 1, 6, 4, 2 }, //13
				{ 1, 7, 2, 4 }  //14
				};
		// 3���� ���� �Ѿ� ���ϱ�
		int[] totalArrayOfYear = new int[3]; 
		for (int i = 0; i < sales.length; i++) {
			for (int j = 0; j < sales[i].length; j++) {				
				totalArrayOfYear[i] += sales[i][j];
			}
		}
		System.out.print("�⵵�� �Ѿ�: ");
		for (int i = 0; i < totalArrayOfYear.length; i++) {
			System.out.print(totalArrayOfYear[i] + " ");
		}
		
	}
	
	/**
	 * �б⺰ �Ѿ� ���ϱ� 6 16 12 14
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
		System.out.print("�б⺰ �Ѿ�: ");
		for (int i = 0; i < totalArrayOfQ.length; i++) {
			System.out.print(totalArrayOfQ[i] + " ");
		}
		
	}
	
}
