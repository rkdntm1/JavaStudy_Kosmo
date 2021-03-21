package ch3_statement_review;

import java.util.Date;
import java.util.Scanner;

public class If_review {

	public static void main(String[] args) {
		//incentive();
		//evenOdd();
		//grading();
		//greeting();
		larger();
	}

	/**
	 * ����ڰ� �Է��� �� �ΰ� �� ū ���� ã�� �� ���� ����սô�.
	 */
	private static void larger() {
		// ����ڰ� �Է��� �� �ΰ� 
		Scanner input = new Scanner(System.in);
		System.out.print("�� ���� �Է��Ͻÿ� : ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		// �� ū���� ã��
		int differnce = num1 - num2;
		if (differnce > 0) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}
		// �� ū�� ���
	}

	/**
	 * ���� �ð��� ���� �λ縻 ����ϱ�
	 * 
	 * @param args
	 */
	private static void greeting() {
		//���� �ð�
		Date Hour = new Date();
		int currentHour = Hour.getHours();
		//�ð��� ���� �λ縻 ���
		if (currentHour < 11) {
			System.out.println("���� ��ħ");
		} else if (currentHour < 15){
			System.out.println("���� ����");
		} else if (currentHour < 20){
			System.out.println("���� ����");
		} else {
			System.out.println("���� ��");
		}
		
	}

	/**
	 * �л����� ������ �Է¹޾� 90 �̻� A , 80 �̻� B, 70 �̻� C, ... ,60 �̸��� F
	 * @param args
	 */
	private static void grading() {
		//�л����� ������ �Է¹޾�
		Scanner input = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�: ");
		int score = input.nextInt();
		// 90�̻� A , 80 �̻� B, 70 �̻� C, ... ,60 �̸��� F
		char grade; // ���� ����
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
		//���
		System.out.println("������ " + grade);
	}

	/**
	 * ����ڰ� �Է��� ���� ¦������ Ȧ������ �����Ͽ� ����մϴ�.
	 * @param args
	 */
	private static void evenOdd() {
		final int MASKING = 1;
		//����ڰ� �Է��� ��
		Scanner input = new Scanner(System.in);
		System.out.print("�Է��Ͻÿ�: ");
		int data = input.nextInt();
		//¦������ Ȧ������ ����
		if ((data % 2) == 0) {
			//����մϴ�.
			System.out.println("¦�� �Դϴ�.");
		} else {
			System.out.println("Ȧ�� �Դϴ�.");
		}
		/*
		 * -2 = 1110
		 * -1 = 1111
		 * 	0 = 0000
		 *  1 = 0001
		 *  2 = 0010
		 *  3 = 0011
		 *  4 = 0100
		 *  -> ¦���� ��� �ǵ��� ��Ʈ ���� 0 . �̰� �̿��غ���		 
		 *  > 1�� AND�� �Ұ�� ¦���� 0 �� ���´�.
		 *  1�� MASKING ��Ű��  
		 */
		if ((data & MASKING) == 0) {
			System.out.println("¦��");
		} else {
			System.out.println("Ȧ��");
		}
		
	}

	/**
	 * ����� ���� ��ǥ(1000����)�� �޼��Ͽ��� ��쿡�� ���� ��ǥ�� �ʰ��� �ݾ��� 10%�� ���������� �޴� ���α׷�
	 * 
	 * @param args
	 */
	private static void incentive() {
		//����� ���� ��ǥ(1000����)
		final int TARGET = 1000;
		final float PERCENT = 0.1F;
		Scanner input = new Scanner(System.in); // �Է���ġ
		System.out.print("������ �Է��Ͻÿ� : ");
		int performance = input.nextInt(); // ������ �Է� ����
		//������
		int overPerformance = performance - TARGET;
		float incentive = overPerformance * PERCENT;  
		//�޼��Ͽ��� ��쿡��
		if (overPerformance > 0) {
			//������ ���(���� ����)
			System.out.println(performance + "�� �������� " + (int)incentive + "���� �Դϴ�.");
			//������ ���(�� ����)
			System.out.println(performance + "�� �������� " + (int)(incentive * 10000) + "�� �Դϴ�.");
		} else {
			System.out.println("���� �޼� ����");
		}
		
	}

}
