package study_for;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * ���� �ٷ� ���� ��Ÿ���� ������ �����Ͽ� (��, ��, ����, ����, ����, ����)
 * ����ڷκ��� �Է¹��� ���� for���� �̿��Ͽ� ���丮���� ������
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
		// ����ڷκ��� �Է�
		int number = input.nextInt();
		// for�� �ݺ� ��
		long factorial = 1; // ���� �� �Է½� ���� ���������� �ִ��� long Ÿ��
		for (int i = 1; i <= number; i++) {
			factorial *= i;
		}
		// ���
		System.out.println(number + "! = " + factorial);
	}

	private static void overflowCare(Scanner input) {
		// ����ڷκ��� �Է�
		int number = input.nextInt();
		// for�� �ݺ� ��
		long factorial = 1; // ���� �� �Է½� ���� ���������� �ִ��� long Ÿ��
		try {
			for (int i = 2; i <= number; i++) {
				factorial = Math.multiplyExact(factorial, i);
			}
		} catch (ArithmeticException ae) {		
			System.out.println("�������");
			return; //��
		}
		// ��� ���
		System.out.println(number + "! = " + factorial);
	}
	
	private static void neverOverflow(Scanner input) {
		// ����ڷκ��� �Է�
		int number = input.nextInt();		
		// for�� �ݺ� ��
		BigInteger factorial = new BigInteger("1");
		for (int i = 2; i <= number; i++) {
			factorial = factorial.multiply(new BigInteger(""+ i));			
		}
		// ��� ���
		System.out.println(number + "! = " + factorial);
	}
}
