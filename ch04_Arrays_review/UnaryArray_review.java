package ch4_Arrays_review;

import java.util.Scanner;

public class UnaryArray_review {

	public static void main(String[] args) {
		//aIOBMin();
		//grade();
		//rolldice();
		//seqSearch();
		toping();
	}
	
	/**
	 * 5가지의 토핑 종류를 문자열 배열에 저장하고 배열에 저장된 문자열을 출력하자 
	 */
	private static void toping() {
		String[] topings = {"피망", "양파", "소시지", "페페로니", "버섯"};
		for (int idx = 0; idx < topings.length; idx++) {
			System.out.print(topings[idx] + " ");
		}
	}

	/**
	 * 배열에서 탐색값을 입력하여 순차적 탐색해 인덱스값을 출력하는 프로그램을 만들어보자
	 * @param args
	 */
	private static void seqSearch() {
		//배열
		int[] s = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		//탐색값을 입력
		Scanner input = new Scanner(System.in);
		System.out.print("찾는 값을 입력하시오 : ");
		int target = input.nextInt();
		//순차적 탐색
		int index = -1; //찾는 값이 없을 경우
		for (int idx = 0; idx < s.length; idx++) {
			if (target == s[idx]) {
				//인덱스값 가져오기/
				index = idx;
				break; // 성능 업
			}			
		}
		//인덱스값 출력하기
		if (index != -1) {
			System.out.println(target + "의 인덱스 값은 " + index);
		} else {
			System.out.println("찾는값이 없습니다.");
		}
		

	}

	/**
	 * 주사위를 10000번 던져서 각 면의 빈도를 출력하시오. 
	 */
	private static void rolldice() {
		//주사위
		final int DICE = 6; // 주사위 6면
		int[] freq = new int[DICE]; // 6면의 배열을 생성
		//10000번 던져
		for (int idx = 0; idx < 10000; idx++) {
			//각면의 빈도. (0~5)를 만들어야함 -> Math.random (0<=x <1)이용
			++freq[(int)(Math.random() * 6)];
		}		
		//출력
		for (int idx = 0; idx < freq.length; idx++) {
			System.out.println(idx + 1 + "면의 빈도: " + freq[idx]);	
		}
		
	}

	/**
	 * 사용자로부터 5명의 성적을 입력받아 평균을 구하는 프로그램
	 */
	private static void grade() {		
		//사용자로부터 5명의 성적을 입력받는다.
		final int Number = 5; // 5명
		Scanner input = new Scanner(System.in);		
		int[] scores = new int[Number]; // 5명의 성적을 보관
		//평균을 구하기 위해 총점
		int sum = sum1(input, scores);
		//평균 출력
		int avg = sum / Number;
		System.out.println("평균은 " + avg);
	}

	private static int sum1(Scanner input, int[] scores) {
		int sum = 0;
		for (int idx = 0; idx < scores.length; idx++) {
			System.out.print("성적을 입력하시오: ");
			int score = input.nextInt();
			sum += score;
		}
		return sum;
	}	

	/**
	 * 배열안의 값들 중에 최소값 출력하기
	 * @param args
	 */
	private static void aIOBMin() {
		//배열안의 값
		int s[] = {1, 5, 10, 20, -20, -50};
		//그 중에 최소값 출력하기
		int min = Integer.MAX_VALUE; // 최소값과 비교될 데이터 생성(int의 최대값)
		for(int idx = 0; idx < s.length; idx++) {
			if (min > s[idx]) {
				min = s[idx];
			}
		}
		System.out.println("최소값은 " + min);
	}

}
