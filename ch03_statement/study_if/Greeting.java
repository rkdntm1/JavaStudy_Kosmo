package study_if;

import java.util.Date;

public class Greeting {
	// 구조는 하향식(Top-Down)으로 설계하고
	// 문장은 상향식(Bottom-Up)으로 개발
	/**
	 * 현재 시각에 따라서 인사말 출력하기
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// 현재 시간값 가져오기
		Date now = new Date();
		int hour = now.getHours();
		// 기준 시점 11, 15 , 20 따라 출력
		if (hour < 11) {
			System.out.println("Good Morgan");
		} else if (hour < 15) {
			System.out.println("Good AN");
		} else if (hour < 20) {
			System.out.println("Good E");
		} else {
			System.out.println("Good N");
		}
	}

}
