package study_if;

import java.util.Scanner;

public class Grading {

	/**
	 * 학생들의 성적을 입력받아 90 이상 A , 80 이상 B, 70 이상 C, ... ,60 미만은 F
	 * @param args
	 */
	public static void main(String[] args) {
		//학생 성적 입력 받기		
		Scanner input = new Scanner(System.in);
		int score = input.nextInt();		
		//각 조건 검사하여 학점 결정
		char grade;
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		//학점 출력
		System.out.println("학점은 " + grade + " 입니다.");

	}

}
