package study_do_while;

import java.util.Scanner;

/**
 * 1~12월의 올바른 달을 입력 할때 까지 반복시키자
 * 
 * @author KYH
 *
 */
public class CollectCalendar {
	public static void main(String[] args) {
		// 달 값 초기화
		int month;
		// 1~12월의 올바른 달을 입력 할때 까지 반복시키자
		int min = 1;
		int max = 12;
		Scanner input = new Scanner(System.in);
		do {
			// 달을 입력받자
			System.out.print("올바른 월을 입력하시오 [1-12]: ");
			month = input.nextInt();
		} while ((month < min) || (month > max)); 
		//올바른 달 입력시 출력
		System.out.println("사용자가 입력한 월은 " + month);
		input.close();

	}
}
