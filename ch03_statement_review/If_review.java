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
	 * 사용자가 입력한 값 두개 중 큰 수를 찾아 그 수를 출력합시다.
	 */
	private static void larger() {
		// 사용자가 입력한 값 두개 
		Scanner input = new Scanner(System.in);
		System.out.print("두 수를 입력하시오 : ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		// 더 큰수를 찾아
		int differnce = num1 - num2;
		if (differnce > 0) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}
		// 더 큰수 출력
	}

	/**
	 * 현재 시각에 따라서 인사말 출력하기
	 * 
	 * @param args
	 */
	private static void greeting() {
		//현재 시각
		Date Hour = new Date();
		int currentHour = Hour.getHours();
		//시간에 따라 인사말 출력
		if (currentHour < 11) {
			System.out.println("좋은 아침");
		} else if (currentHour < 15){
			System.out.println("좋은 점심");
		} else if (currentHour < 20){
			System.out.println("좋은 저녁");
		} else {
			System.out.println("좋은 밤");
		}
		
	}

	/**
	 * 학생들의 성적을 입력받아 90 이상 A , 80 이상 B, 70 이상 C, ... ,60 미만은 F
	 * @param args
	 */
	private static void grading() {
		//학생들의 성적을 입력받아
		Scanner input = new Scanner(System.in);
		System.out.print("성적을 입력하시오: ");
		int score = input.nextInt();
		// 90이상 A , 80 이상 B, 70 이상 C, ... ,60 미만은 F
		char grade; // 학점 저장
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
		//출력
		System.out.println("학점은 " + grade);
	}

	/**
	 * 사용자가 입력한 값이 짝수인지 홀수인지 구분하여 출력합니다.
	 * @param args
	 */
	private static void evenOdd() {
		final int MASKING = 1;
		//사용자가 입력한 값
		Scanner input = new Scanner(System.in);
		System.out.print("입력하시오: ");
		int data = input.nextInt();
		//짝수인지 홀수인지 구분
		if ((data % 2) == 0) {
			//출력합니다.
			System.out.println("짝수 입니다.");
		} else {
			System.out.println("홀수 입니다.");
		}
		/*
		 * -2 = 1110
		 * -1 = 1111
		 * 	0 = 0000
		 *  1 = 0001
		 *  2 = 0010
		 *  3 = 0011
		 *  4 = 0100
		 *  -> 짝수인 경우 맨뒤의 비트 값이 0 . 이걸 이용해보자		 
		 *  > 1과 AND를 할경우 짝수는 0 이 나온다.
		 *  1을 MASKING 시키자  
		 */
		if ((data & MASKING) == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
	}

	/**
	 * 사원이 실적 목표(1000만원)를 달성하였을 경우에는 실적 목표를 초과한 금액의 10%를 성과급으로 받는 프로그램
	 * 
	 * @param args
	 */
	private static void incentive() {
		//사원이 실적 목표(1000만원)
		final int TARGET = 1000;
		final float PERCENT = 0.1F;
		Scanner input = new Scanner(System.in); // 입력장치
		System.out.print("실적을 입력하시오 : ");
		int performance = input.nextInt(); // 실적을 입력 받음
		//성과금
		int overPerformance = performance - TARGET;
		float incentive = overPerformance * PERCENT;  
		//달성하였을 경우에는
		if (overPerformance > 0) {
			//성과금 출력(만원 단위)
			System.out.println(performance + "의 성과금은 " + (int)incentive + "만원 입니다.");
			//성과금 출력(원 단위)
			System.out.println(performance + "의 성과금은 " + (int)(incentive * 10000) + "원 입니다.");
		} else {
			System.out.println("성과 달성 실패");
		}
		
	}

}
