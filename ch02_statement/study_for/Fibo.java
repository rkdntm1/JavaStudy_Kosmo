package study_for;
/**
 * �ǳ볪ġ ���� 100���� ���غ���
 * @author KYH
 *
 */
public class Fibo {

	public static void main(String[] args) {
		fibo2();
	}
	// ���� 3�� ���
	private static void fibo1() {
		for(int a = 0, b = 1, c; a + b < 100; c = b, b = a + b, a = c ) {
			System.out.print(a + b + " ");
		}
	}	
	// ���� 2�� ��� 
	private static void fibo2() {
		// a b a+b a+2b 2a+3b 3a+5b ...
		for(int a = 0, b = 1; b < 100; a = a + b, b = a + b ) {
			System.out.print(a + " " + b + " " );
		}
	}
}
