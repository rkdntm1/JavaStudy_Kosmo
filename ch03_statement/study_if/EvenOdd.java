package study_if;

import java.util.Scanner;

public class EvenOdd {

	/**
	 * 사용자가 입력한 값이 짝수인지 홀수인지 구분하여 출력합니다.
	 * @param args
	 */
	public static void main(String[] args) {
		//사용자로 부터 값 입력 받기
		Scanner input = new Scanner(System.in);
		int value4decide = input.nextInt(); 
		//짝수인지 홀수인지 구분하자
		if ((value4decide % 2) == 0) {
			//짝수면 "짝수입니다" 라고 출력합니다.
			System.out.println("짝수입니다");
		} else {
			//홀수면 "홀수입니다" 라고 출력합니다.
			System.out.println("홀수입니다");
		}
	}

}
