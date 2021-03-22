package ch3_statement_review;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class For_review {

	public static void main(String[] args) {
		//factorial();
		//factorial2(); // 큰 수를 입력시 범위가 넘어가는걸 해결해보자
		//fibo(); //변수 3개 사용
		//fibo2(); //변수 2개 사용
		//permutation();
		randomNumber();
	}

	/**
	 * 카운트를 입력하여 랜덤(정규부분포로 0~100)값의 총합을 구하시오 
	 */
	private static void randomNumber() {
		//카운트르 입력
		Scanner input = new Scanner(System.in);
		System.out.print("카운트 : ");
		int count = input.nextInt();
		//랜덤값을 통해 총합을 구하자
		Random rand = new Random(); //랜덤함수 호출
		int sum = 0;
		for (int i = 0; i < count; i++) {
			sum += rand.nextInt(100);
		}
		//출력
		System.out.println("0부터 100까지의 랜덤값의 " + count + "번의 총합은 " + sum);
	}

	/**
	 * 1부터 10까지의 정수의 합을 구하자
	 */
	private static void permutation() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

	private static void fibo2() {
		for(int i = 0, j = 1; i + j < 100; j = i + j, i = j - i ) {
			int result = i + j;
			System.out.print(result + " ");
		}
	}

	/**
	 * 피노나치 수열 100까지 구해보기
	 * 1 2 3 5 8 ... 
	 */
	private static void fibo() {
		for(int i = 0, j = 1, k; i + j < 100; k = j, j = i + j, i = k  ) {
			int result = i + j;
			System.out.print(result + " ");
		}
	}

	private static void factorial2() {
		Scanner input = new Scanner(System.in);
		System.out.print("입력하시오 : ");
		int target = input.nextInt();
		// 그 수의 팩토리얼을 구하자
		BigInteger result = new BigInteger("1"); //큰 수 입력시 받기 위해서 BigInteger 사용
		for (int i = 1; i <= target; i++) {
			result = result.multiply(new BigInteger("" + i)); //multiply 함수를 이용해 곱
		}
		System.out.println(target + "! = " + result);
	}

	/**
	 * 사용자로부터 입력받은 수를 for문을 이용하여 팩토리얼을 구하자
	 */
	private static void factorial() {
		// 사용자로부터 입력받아
		Scanner input = new Scanner(System.in);
		System.out.print("입력하시오 : ");
		int target = input.nextInt();
		// 그 수의 팩토리얼을 구하자
		long result = 1; // 팩토리얼 값을 담을 그릇
		for (int i = 1; i <= target; i++) {
			result *= i; 
		}
		System.out.println(target + "! = " + result);
	}

}
