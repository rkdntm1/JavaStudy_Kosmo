package study_switch;

import java.util.Scanner;

public class Grading {

	/**
	 * 성적을 입력받아 학점을 출력해보자
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// 성적을 입력받기
		Scanner input = new Scanner(System.in);
		System.out.print("숫자를 입력하시오: ");
		int score = input.nextInt();
		char grade;
		// 성적 간소화(9, 8, 7)
		score = score / 10;
		// 조건에 따라 학점주기(9, 8, 7 > A, B, C)
		switch (score) {

		case 9: {
			grade = 'A';
			break;
		}
		case 8: {
			grade = 'B';
			break;
		}
		case 7: {
			grade = 'C';
			break;
		}
		case 6: {
			grade = 'D';
			break;
		}
		default: {
			grade = 'F';
			break;
		}

		}
		// 출력
		System.out.println("학점은 " + grade);

	}

}
