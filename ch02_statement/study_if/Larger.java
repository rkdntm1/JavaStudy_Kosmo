package study_if;

import java.util.Scanner;

public class Larger {
	/**
	 * 사용자가 입력한 값 두개 중 큰 수를 찾아 그 수를 출력합시다.
	 */
	public static void main(String[] args) {
		// 사용자로 부터 값 두개 입력받는다.
		Scanner input = new Scanner(System.in);
		int firstValue = input.nextInt();
		int secondValue = input.nextInt();
		// 두개 중 큰 수를 찾는다.
		if (firstValue > secondValue) {
			// 그 수를 출력합시다.
			System.out.println("큰 수는 " + firstValue + "입니다.");
		} else {
			// 그 수를 출력합시다.
			System.out.println("큰 수는 " + secondValue + "입니다.");
		}

	}

}
