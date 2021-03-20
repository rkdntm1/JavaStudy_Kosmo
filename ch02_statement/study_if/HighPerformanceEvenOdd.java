package study_if;

import java.util.Scanner;

public class HighPerformanceEvenOdd {

		/**
		 * 사용자가 입력한 값이 짝수인지 홀수인지 구분하여 출력합니다.
		 * 3 >0000 0011
		 * 2 >0000 0010
		 * 1 >0000 0001 --masking
		 * 0 >0000 0000
		 * -1>1111 1111
		 * -2>1111 1110
		 * -3>1111 1101		 *마지막자리 0인 것은 짝수 / 1인 것은 홀수 
		 * @param args
		 */
		public static void main(String[] args) {
			final int masking = 1; // 0000 0001
			// 사용자가 입력한 값
			Scanner input = new Scanner(System.in);
			int value = input.nextInt();
			// 짝수인지 홀수인지 구분
			if ((value & masking) == 0) {
				// "짝수입니다."출력
				System.out.println("짝수입니다.");
			} else {
				// "홀수입니다."출력
				System.out.println("홀수입니다.");
			}

		}

	}
