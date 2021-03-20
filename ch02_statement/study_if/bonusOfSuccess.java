package study_if;

import java.util.Scanner;

public class bonusOfSuccess {
	/**
	 * 사원이 실적 목표(1000만원)를 달성하였을 경우에는 실적 목표를 초과한 금액의 10%를 성과급으로 받는 프로그램
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// 목표실적
		final int TARGET = 1000;
		// 보너스 지급율
		final float COMMISION = 0.1F;
		// 실적을 입력받는다
		Scanner input = new Scanner(System.in);
		int bonus = input.nextInt();
		// 목표차액
		int overPerformance = bonus - TARGET;
		// 실적목표를 달성하면... 
		if (overPerformance > 0) {
			// 실적 달성 출력
			System.out.println("실적달성");
			// 성과금 = 실적 - 목표 * 10% , 계산하여 출력
			float bonusOfSuccess = overPerformance * COMMISION;
			System.out.println("성과금 : " + (int) (bonusOfSuccess * 10000) + "원");
		} else {
			System.out.println("달성실패");
		}

	} 

}
