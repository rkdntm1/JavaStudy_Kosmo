package ch3_statement_review;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class For_review {

	public static void main(String[] args) {
		//factorial();
		//factorial2(); // ū ���� �Է½� ������ �Ѿ�°� �ذ��غ���
		//fibo(); //���� 3�� ���
		//fibo2(); //���� 2�� ���
		//permutation();
		randomNumber();
	}

	/**
	 * ī��Ʈ�� �Է��Ͽ� ����(���Ժκ����� 0~100)���� ������ ���Ͻÿ� 
	 */
	private static void randomNumber() {
		//ī��Ʈ�� �Է�
		Scanner input = new Scanner(System.in);
		System.out.print("ī��Ʈ : ");
		int count = input.nextInt();
		//�������� ���� ������ ������
		Random rand = new Random(); //�����Լ� ȣ��
		int sum = 0;
		for (int i = 0; i < count; i++) {
			sum += rand.nextInt(100);
		}
		//���
		System.out.println("0���� 100������ �������� " + count + "���� ������ " + sum);
	}

	/**
	 * 1���� 10������ ������ ���� ������
	 */
	private static void permutation() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

	private static void fibo2() {
		for(int i = 0, j = 1; i + j < 100; j = i + j, i = j - i ) {
			int result = i + j;
			System.out.print(result + " ");
		}
	}

	/**
	 * �ǳ볪ġ ���� 100���� ���غ���
	 * 1 2 3 5 8 ... 
	 */
	private static void fibo() {
		for(int i = 0, j = 1, k; i + j < 100; k = j, j = i + j, i = k  ) {
			int result = i + j;
			System.out.print(result + " ");
		}
	}

	private static void factorial2() {
		Scanner input = new Scanner(System.in);
		System.out.print("�Է��Ͻÿ� : ");
		int target = input.nextInt();
		// �� ���� ���丮���� ������
		BigInteger result = new BigInteger("1"); //ū �� �Է½� �ޱ� ���ؼ� BigInteger ���
		for (int i = 1; i <= target; i++) {
			result = result.multiply(new BigInteger("" + i)); //multiply �Լ��� �̿��� ��
		}
		System.out.println(target + "! = " + result);
	}

	/**
	 * ����ڷκ��� �Է¹��� ���� for���� �̿��Ͽ� ���丮���� ������
	 */
	private static void factorial() {
		// ����ڷκ��� �Է¹޾�
		Scanner input = new Scanner(System.in);
		System.out.print("�Է��Ͻÿ� : ");
		int target = input.nextInt();
		// �� ���� ���丮���� ������
		long result = 1; // ���丮�� ���� ���� �׸�
		for (int i = 1; i <= target; i++) {
			result *= i; 
		}
		System.out.println(target + "! = " + result);
	}

}
