package study_switch;

import java.util.Scanner;

public class Mypractice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("수식을 입력하시오: ");
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
			System.out.println("잘못된 값");

		}
		System.out.println("결과 " + result);

	}

}
