package ch3_statement_review;

import java.util.Scanner;

public class Switch_review {

	public static void main(String[] args) {
		//grading();
		calc();
	}

	/**
	 * �ǿ����ڿ� �����ڸ� �Է��Ͽ� ��� ���� �������� �����϶�
	 */
	private static void calc() {
		//�ǿ����ڿ� ������ �Է�
		Scanner input = new Scanner(System.in);
		System.out.print("�Է��Ͻÿ� : ");
		double num1 = input.nextDouble();
		String operator = input.next(); // �Է� ������� �ؾ� ���� �߻� x
		double num2 = input.nextDouble();				
		//�����ڿ� ���� ��갪 �����
		double result = 0;
		boolean isRight = true; // �����ڰ� �߸��ԷµǾ�����츦 ����
		switch (operator) {
		case "+":
			result = num1 + num2;			
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			isRight = false;
		}
		if (isRight == true) {
			System.out.println(num1 + " "+ operator + " " + num2 + " = " + result );
		} else {
			System.out.println("�߸��� �������Դϴ�.");
		}
	}

	/**
	 * ������ �Է¹޾� ������ ����غ���
	 * 
	 * @param args
	 */
	private static void grading() {
		//������ �Է¹޾�
		Scanner input = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�: ");
		int score = input.nextInt();
		//������ ���
		int tensDigit = (int)(score / 10) ; //������ 10�� �ڸ� ���� ����
		switch(tensDigit) {
		case 10, 9:
			System.out.println('A');
			break;
		case 8:
			System.out.println('B');
			break;
		case 7:
			System.out.println('C');
			break;
		case 6:
			System.out.println('D');
			break;
		default:
			System.out.println('F');
			break;
		}
	}

}
