package study_if;

import java.util.Scanner;

public class Larger {
	/**
	 * ����ڰ� �Է��� �� �ΰ� �� ū ���� ã�� �� ���� ����սô�.
	 */
	public static void main(String[] args) {
		// ����ڷ� ���� �� �ΰ� �Է¹޴´�.
		Scanner input = new Scanner(System.in);
		int firstValue = input.nextInt();
		int secondValue = input.nextInt();
		// �ΰ� �� ū ���� ã�´�.
		if (firstValue > secondValue) {
			// �� ���� ����սô�.
			System.out.println("ū ���� " + firstValue + "�Դϴ�.");
		} else {
			// �� ���� ����սô�.
			System.out.println("ū ���� " + secondValue + "�Դϴ�.");
		}

	}

}
