package ch4_Arrays_review;

public class BinArray {

	public static void main(String[] args) {
		totalOfAll();
		totalOfYear();
		totalOfQuQuater();
	}

	/**
	 * ȸ���� �б⺰ �Ѿ��� ����Ͻÿ�
	 */
	private static void totalOfQuQuater() {
		// �⵵, �б� �迭 (3�� 4�б�)
		final int YEAR = 3;
		final int QUATER = 4;
		int[][] sales = { 
				{ 4, 3, 6, 8 },
				{ 1, 6, 4, 2 },
				{ 1, 7, 2, 4 }
				};
		// �⵵�� ����迭 �����
		int[] quater = new int[QUATER];
		for (int ydx = 0; ydx < sales.length; ydx++) { // 3�⵵�� ������
			for (int qdx = 0; qdx < sales[0].length; qdx++) {// 4�б�� ������
				quater[qdx] += sales[ydx][qdx];
			}
		}
		for (int idx = 0; idx < sales[0].length; idx++) {
			System.out.println(idx + 1 + "�б� �Ѿ�: " + quater[idx]);
		}

	}

	/**
	 * ȸ���� �⵵�� �Ѿ��� ����Ͻÿ�
	 */
	private static void totalOfYear() {
		// �⵵, �б� �迭 (3�� 4�б�)
		final int YEAR = 3;
		int[][] sales = { 
				{ 4, 3, 6, 8 },
				{ 1, 6, 4, 2 },
				{ 1, 7, 2, 4 }
				};
		// �⵵�� ����迭 �����
		int[] year = new int[YEAR];
		for (int ydx = 0; ydx < sales.length; ydx++) { // 3�⵵�� ������
			for (int qdx = 0; qdx < sales[0].length; qdx++) {// 4�б�� ������
				year[ydx] += sales[ydx][qdx];
			}
		}
		for (int idx = 0; idx < sales.length; idx++) {
			System.out.println(idx + 1 + "�⵵ �Ѿ�: " + year[idx]);
		}
	}

	/**
	 * ȸ���� 3�Ⱓ ���� �Ѿ��� ���Ͻÿ�.
	 */
	private static void totalOfAll() {
		// �⵵, �б� �迭 (3�� 4�б�)
		final int YEAR = 3;
		int[][] sales = { 
				{ 4, 3, 6, 8 },
				{ 1, 6, 4, 2 },
				{ 1, 7, 2, 4 }
				};
		// 3���� ���� �Ѿ�
		int totalOfAll = 0;
		for (int ydx = 0; ydx < sales.length; ydx++) { // 3�⵵�� ������
			for (int qdx = 0; qdx < sales[0].length; qdx++) {// 4�б�� ������
				totalOfAll += sales[ydx][qdx];
			}
		}
		System.out.println("3�Ⱓ �Ѿ� : " + totalOfAll);
	}

}
