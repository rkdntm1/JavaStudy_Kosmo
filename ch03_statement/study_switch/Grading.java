package study_switch;

import java.util.Scanner;

public class Grading {

	/**
	 * ������ �Է¹޾� ������ ����غ���
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// ������ �Է¹ޱ�
		Scanner input = new Scanner(System.in);
		System.out.print("���ڸ� �Է��Ͻÿ�: ");
		int score = input.nextInt();
		char grade;
		// ���� ����ȭ(9, 8, 7)
		score = score / 10;
		// ���ǿ� ���� �����ֱ�(9, 8, 7 > A, B, C)
		switch (score) {

		case 9: {
			grade = 'A';
			break;
		}
		case 8: {
			grade = 'B';
			break;
		}
		case 7: {
			grade = 'C';
			break;
		}
		case 6: {
			grade = 'D';
			break;
		}
		default: {
			grade = 'F';
			break;
		}

		}
		// ���
		System.out.println("������ " + grade);

	}

}
