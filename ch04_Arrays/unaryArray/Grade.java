package unaryArray;

import java.util.Scanner;

public class Grade {
	/**
	 * ����ڷκ��� 5���� ������ �Է¹޾� ����� ���ϴ� ���α׷�
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// ����� 5��
		final int USER = 5;
		int[] scores = new int[USER]; // 5���� ������ ���� �迭 ����
		// ������ �Է¹޾�
		Scanner input = new Scanner(System.in); // �Է���ġ ȣ��
		for (int idx = 0; idx < scores.length; idx++) {
			System.out.print("������ �Է��Ͻÿ�: ");
			int scoreUser = input.nextInt();
			scores[idx] = scoreUser;
		}
		// ��ձ��ϱ�
		int total = total1(scores);
		int tota2 = total2(scores);
		int avg = tota2 / USER;
		System.out.println("��� ������ " + avg + "�Դϴ�.");
 
	}
	// ù��° ���ձ��ϱ� ��� 
	private static int total1(int[] scores) {
		int total = 0; // ����� ���ϱ����ؼ� ���հ��� ������!
		for (int idx = 0; idx < scores.length; idx++) {
			total += scores[idx];
		}
		return total;
	}
	// �ι�° ���ձ��ϱ� ���
	private static int total2(int[] scores) {
		int total = 0; // ����� ���ϱ����ؼ� ���հ��� ������!
		for (int grade : scores) { //for each ������ �� ����ȭ ��Ű��
			total += grade;
		}
		return total;
	}

}
