package study_if;

import java.util.Scanner;

public class HighPerformanceEvenOdd {

		/**
		 * ����ڰ� �Է��� ���� ¦������ Ȧ������ �����Ͽ� ����մϴ�.
		 * 3 >0000 0011
		 * 2 >0000 0010
		 * 1 >0000 0001 --masking
		 * 0 >0000 0000
		 * -1>1111 1111
		 * -2>1111 1110
		 * -3>1111 1101		 *�������ڸ� 0�� ���� ¦�� / 1�� ���� Ȧ�� 
		 * @param args
		 */
		public static void main(String[] args) {
			final int masking = 1; // 0000 0001
			// ����ڰ� �Է��� ��
			Scanner input = new Scanner(System.in);
			int value = input.nextInt();
			// ¦������ Ȧ������ ����
			if ((value & masking) == 0) {
				// "¦���Դϴ�."���
				System.out.println("¦���Դϴ�.");
			} else {
				// "Ȧ���Դϴ�."���
				System.out.println("Ȧ���Դϴ�.");
			}

		}

	}
