package ch3_statement_review;

import java.util.Scanner;

public class While_review {

	public static void main(String[] args) {
		//multiplicationable();
		//permutation();
		//loop();		
	}

	// 0,1,2,3,4,5,6,7,8,9, -> 0,1,2,3,4,5,6,7,8,9
	private static void loop() {
		int i = 0;
		boolean isTrue = true;// 성능을 올리기 위해서 boolean을 사용
		while(i < 10) {
			if(isTrue) {  // 성능 업
				isTrue = false; 
				System.out.print(i);
			} else {
				System.out.print("," + i);				
			}			
			i++;
		}
	}

	/**
	 * 1부터 입력받은 숫자 까지의 모든 정수의 합을 구하자
	 */
	private static void permutation() {
		//숫자를 입력받기
		Scanner input = new Scanner(System.in);
		System.out.print("입력하시오 : ");
		int target = input.nextInt();		
		//1부터 숫자까지의 정수값들을 모두 더하기
		int i = 1; // 반복해서 입력받은 값 까지 올릴 값
		int result = 0; // 합계 값
		while(i <= target) { // i를 target 값 까지 반복을 시키겠다. 
			/*
			 * a = 1+2+3+4+5
			 * a = 5+4+3+2+1
			 * 2a = 5*(1+5)
			 * a = 5*(1+5) / 2 이지만
			 * 반복을 통해서 구하는걸 생각해보자.  
			 */
			result += i;
			i++;
		}
		System.out.println("1부터 " + target + "까지의 총 합은 " + result);
	}

	/**
	 * 사용자로부터 단 수를 입력받아서 구구단 출력하기
	 */
	private static void multiplicationable() {
		//사용자로부터 단 수를 입력받아
		Scanner input = new Scanner(System.in);
		System.out.print("몇 단 : ");
		int stage = input.nextInt();		
		//구구단 출력하기
		int operand = 1;		
		while(operand < 10) {
			int result = stage * operand;
			System.out.println(stage + " * " + operand + " = " + result);
			operand++;
		}
	}

}
