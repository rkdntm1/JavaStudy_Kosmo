package ch2_review;

public class Ch2 {
/**
 * �־��� �迭���� �ߺ����� �ʴ� ���� ��� ��Ű��.
 * @param args
 */
	public static void main(String[] args) {
		//�־��� �迭
		int[] intValues = { 1, 4, 7, 3, 4, 7, 1 }; 
		//�ߺ����� �ʴ� �� Ȯ��
		int result = 0; // �ߺ����� �ʴ� ���� result�� ���� ����
		for (int idx = 0; idx < intValues.length; idx++) { // �迭�� ũ�⸸ŭ �ݺ�
			result ^= intValues[idx]; // ^ : ExclusiveOr (��Ÿ��or : ���� �ٸ��� 1 ���) -> ���� ���̸� 0���� ��ȯ�ǹǷ�
									  //     ���� ���� ���� �����͸� ��� �� �� ����
		}
		//���
		System.out.println("�ߺ����� �ʴ� ���� : " + result);
	}

}
