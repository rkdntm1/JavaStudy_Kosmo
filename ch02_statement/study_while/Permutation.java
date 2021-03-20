package study_while;

/**
 * 1+2+3+... +10 의 값을 구하는 프로그램을 만들어보자
 * 
 * @author KYH
 *
 */
public class Permutation {
	public static void main(String[] args) {
		// 합계값 초기화
		int sum = 0;
		// 1+2+3+... +10 합계값에 대입
		int i = 1;
		while (i < 11) {
			sum += i; // sum = sum + i
			i++;
		}
		// 합계 출력
		System.out.println("합계 : " + sum);
	}
}
