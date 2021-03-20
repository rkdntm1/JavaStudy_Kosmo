package study_if;

import java.util.Scanner; //ctrl shift o => 단축키

public class mypractice {
	/**
	 * 사용자가 입력한 값이 짝수인지 홀수인지 구분하여 출력합니다.
	 * 
	 * @param args
	 */
	
//	public static void main(String[] args) {
//		//사용자로부터 입력받기
//		Scanner input = new Scanner(System.in);
//		int number = input.nextInt();		
//		//입력한 수가 짝수 인지 아닌지 구분
//		/*
//		 * 1111 -1
//		 * 0000 0
//		 * 0001 1
//		 * 0010 2
//		 * 0011 3   => 맨 뒤에 있는 자리가 0일 경우 짝수네?
//		 */		
//		if ((number & 1) == 0 ) {
//			//짝수 출력
//			System.out.println("짝수");
//		} else {
//			//홀수 출력
//			System.out.println("홀수");
//		}
//		
//}

	/**
	 * 사원이 실적 목표(1000만원)를 달성하였을 경우에는 실적 목표를 초과한 금액의 10%를 성과급으로 받는 프로그램
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//(상수)실적 목표
		final int TARGET_AMOUNT = 1000;
		//(상수)성과금퍼센트
		final float COMMISION = 0.1f;
		//실적 입력받기
		Scanner input = new Scanner(System.in);
		System.out.print("실적: ");
		int myGoal = input.nextInt();
		int overPerformance = myGoal - TARGET_AMOUNT;
		//보너스 금액 = 실적 - 목표 * 0.1 
		float bonus = overPerformance * COMMISION;  
		//실적이 목표보다 높으면 
		if (myGoal > TARGET_AMOUNT) {
			//보너스 금액 출력
			System.out.println("달성 성공, 성과금 : " + (int) bonus * 10000 + "원");
		} else {
			System.out.println("달성 실패");
		}
	}
}
