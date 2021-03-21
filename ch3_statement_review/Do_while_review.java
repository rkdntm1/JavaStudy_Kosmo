package ch3_statement_review;

import java.util.Scanner;

public class Do_while_review {

	/**
	 * 1~12월의 올바른 달을 입력 할때 까지 반복시키자
	 */
	public static void main(String[] args) {
		//step1(); 
		step2(); //성능을 올려보자
	}

	private static void step2() {
		//올바른 달을 입력
		Scanner input = new Scanner(System.in); //입력장치 호출		
		//올바를때 까지 (1~12) 반복
		int month;
		int min = 1;
		int max = 12;
		do {
			System.out.print("입력하시오 : ");
			month = input.nextInt();			
		} while(month < min || month > 12);
		System.out.println("올바른 달입니다.");
	}

	private static void step1() {
		//올바른 달을 입력
		Scanner input = new Scanner(System.in); //입력장치 호출		
		//올바를때 까지 (1~12) 반복
		boolean isCollect = true;
		do {
			System.out.print("입력하시오 : ");
			int month = input.nextInt();
			if (1 <= month && month <= 12) {  
				isCollect = false; 
			}
		} while(isCollect);
	}

}
