package study_if;

import java.util.Scanner;

public class EvenOdd {

	/**
	 * ����ڰ� �Է��� ���� ¦������ Ȧ������ �����Ͽ� ����մϴ�.
	 * @param args
	 */
	public static void main(String[] args) {
		//����ڷ� ���� �� �Է� �ޱ�
		Scanner input = new Scanner(System.in);
		int value4decide = input.nextInt(); 
		//¦������ Ȧ������ ��������
		if ((value4decide % 2) == 0) {
			//¦���� "¦���Դϴ�" ��� ����մϴ�.
			System.out.println("¦���Դϴ�");
		} else {
			//Ȧ���� "Ȧ���Դϴ�" ��� ����մϴ�.
			System.out.println("Ȧ���Դϴ�");
		}
	}

}
