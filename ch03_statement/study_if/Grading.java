package study_if;

import java.util.Scanner;

public class Grading {

	/**
	 * �л����� ������ �Է¹޾� 90 �̻� A , 80 �̻� B, 70 �̻� C, ... ,60 �̸��� F
	 * @param args
	 */
	public static void main(String[] args) {
		//�л� ���� �Է� �ޱ�		
		Scanner input = new Scanner(System.in);
		int score = input.nextInt();		
		//�� ���� �˻��Ͽ� ���� ����
		char grade;
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		//���� ���
		System.out.println("������ " + grade + " �Դϴ�.");

	}

}
