package study_while;

/**
 * 1+2+3+... +10 �� ���� ���ϴ� ���α׷��� ������
 * 
 * @author KYH
 *
 */
public class Permutation {
	public static void main(String[] args) {
		// �հ谪 �ʱ�ȭ
		int sum = 0;
		// 1+2+3+... +10 �հ谪�� ����
		int i = 1;
		while (i < 11) {
			sum += i; // sum = sum + i
			i++;
		}
		// �հ� ���
		System.out.println("�հ� : " + sum);
	}
}
