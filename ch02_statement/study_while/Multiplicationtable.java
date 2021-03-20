package study_while;

import java.util.Scanner;

/**
 * 사용자로부터 단 수를 입력받아서 구구단 출력하기
 * 
 * @param args
 */
public class Multiplicationtable {
	public static void main(String[] args) {
		// 목표 구구단을 입력받는다.
		int targetStage;
		Scanner input = new Scanner(System.in);
		System.out.print("목표 단을 입력하시오 : ");
		targetStage = input.nextInt();
		input.close();		
		
		// 1~9까지 줄 바꾸면서 출력하기.
		int i = 1;
		while (i <= 9) {
			System.out.println(targetStage + " * " + i + " = " + targetStage * i);
			i++;
		}
	}
}
