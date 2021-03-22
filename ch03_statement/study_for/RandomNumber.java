package study_for;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		Random generator = new Random();
		
		System.out.println("난수의 개수 : ");
		
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt(); // nextInt() : 정규분포
		int sum = 0;
		
		for (int i = 0; i < count; i++) {
			int number = generator.nextInt(100); //정규 분포임으로 0~100의 평균값 50의 100개 값인 5000 부근으로 나올 것이다
			sum += number; 
		}
		System.out.println("난수 " + count + "개의 합은 " + sum);
	}
}
