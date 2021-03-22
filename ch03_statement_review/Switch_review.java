package ch3_statement_review;

import java.util.Scanner;

public class Switch_review {

	public static void main(String[] args) {
		//grading();
		calc();
	}

	/**
	 * 피연산자와 연사자를 입력하여 계산 값이 나오도록 개발하라
	 */
	private static void calc() {
		//피연산자와 연산자 입력
		Scanner input = new Scanner(System.in);
		System.out.print("입력하시오 : ");
		double num1 = input.nextDouble();
		String operator = input.next(); // 입력 순서대로 해야 오류 발생 x
		double num2 = input.nextDouble();				
		//연산자에 따른 계산값 만들기
		double result = 0;
		boolean isRight = true; // 연산자가 잘못입력되었을경우를 위해
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
			System.out.println("잘못 입력하셨습니다.");
			isRight = false;
		}
		if (isRight == true) {
			System.out.println(num1 + " "+ operator + " " + num2 + " = " + result );
		} else {
			System.out.println("잘못된 연산자입니다.");
		}
	}

	/**
	 * 성적을 입력받아 학점을 출력해보자
	 * 
	 * @param args
	 */
	private static void grading() {
		//성적을 입력받아
		Scanner input = new Scanner(System.in);
		System.out.print("성적을 입력하시오: ");
		int score = input.nextInt();
		//학점을 출력
		int tensDigit = (int)(score / 10) ; //점수의 10의 자리 수를 구함
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
