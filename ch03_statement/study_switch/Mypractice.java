package study_switch;

import java.util.Scanner;

public class Mypractice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������ �Է��Ͻÿ�: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		String operator = input.next();
		double result = 0;

		switch (operator) {

		case "+":
			result = x + y;
			break;
		case "-":
			result = x - y;
			break;
		case "*":
			result = x * y;
			break;
		case "/":
			result = x / y;
			break;
		default:
			System.out.println("�߸��� ��");

		}
		System.out.println("��� " + result);

	}

}
