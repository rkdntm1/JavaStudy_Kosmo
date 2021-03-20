package unaryArray;

import java.util.Scanner;

public class Grade {
	/**
	 * 사용자로부터 5명의 성적을 입력받아 평균을 구하는 프로그램
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// 사용자 5명
		final int USER = 5;
		int[] scores = new int[USER]; // 5명의 성적을 담을 배열 생성
		// 성적을 입력받아
		Scanner input = new Scanner(System.in); // 입력장치 호출
		for (int idx = 0; idx < scores.length; idx++) {
			System.out.print("성적을 입력하시오: ");
			int scoreUser = input.nextInt();
			scores[idx] = scoreUser;
		}
		// 평균구하기
		int total = total1(scores);
		int tota2 = total2(scores);
		int avg = tota2 / USER;
		System.out.println("평균 성적은 " + avg + "입니다.");
 
	}
	// 첫번째 총합구하기 방법 
	private static int total1(int[] scores) {
		int total = 0; // 평균을 구하기위해서 총합값을 구하자!
		for (int idx = 0; idx < scores.length; idx++) {
			total += scores[idx];
		}
		return total;
	}
	// 두번째 총합구하기 방법
	private static int total2(int[] scores) {
		int total = 0; // 평균을 구하기위해서 총합값을 구하자!
		for (int grade : scores) { //for each 문으로 더 간단화 시키기
			total += grade;
		}
		return total;
	}

}
