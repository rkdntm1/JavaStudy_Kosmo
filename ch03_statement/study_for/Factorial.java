package study_for;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 수를 다룰 때는 나타나는 범위를 생각하여 (닭, 소, 공룡, 지구, 은하, 우주)
 * 사용자로부터 입력받은 수를 for문을 이용하여 팩토리얼을 구하자
 * 
 * @author KYH
 *
 */
public class Factorial {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		neverOverflow(input);
		input.close();
	}

	private static void overflowDontCare(Scanner input) {
		// 사용자로부터 입력
		int number = input.nextInt();
		// for로 반복 곱
		long factorial = 1; // 높은 수 입력시 수가 높아짐으로 최대인 long 타입
		for (int i = 1; i <= number; i++) {
			factorial *= i;
		}
		// 출력
		System.out.println(number + "! = " + factorial);
	}

	private static void overflowCare(Scanner input) {
		// 사용자로부터 입력
		int number = input.nextInt();
		// for로 반복 곱
		long factorial = 1; // 높은 수 입력시 수가 높아짐으로 최대인 long 타입
		try {
			for (int i = 2; i <= number; i++) {
				factorial = Math.multiplyExact(factorial, i);
			}
		} catch (ArithmeticException ae) {		
			System.out.println("계산포기");
			return; //끝
		}
		// 결과 출력
		System.out.println(number + "! = " + factorial);
	}
	
	private static void neverOverflow(Scanner input) {
		// 사용자로부터 입력
		int number = input.nextInt();		
		// for로 반복 곱
		BigInteger factorial = new BigInteger("1");
		for (int i = 2; i <= number; i++) {
			factorial = factorial.multiply(new BigInteger(""+ i));			
		}
		// 결과 출력
		System.out.println(number + "! = " + factorial);
	}
}
