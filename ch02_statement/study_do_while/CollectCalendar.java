package study_do_while;

import java.util.Scanner;

/**
 * 1~12���� �ùٸ� ���� �Է� �Ҷ� ���� �ݺ���Ű��
 * 
 * @author KYH
 *
 */
public class CollectCalendar {
	public static void main(String[] args) {
		// �� �� �ʱ�ȭ
		int month;
		// 1~12���� �ùٸ� ���� �Է� �Ҷ� ���� �ݺ���Ű��
		int min = 1;
		int max = 12;
		Scanner input = new Scanner(System.in);
		do {
			// ���� �Է¹���
			System.out.print("�ùٸ� ���� �Է��Ͻÿ� [1-12]: ");
			month = input.nextInt();
		} while ((month < min) || (month > max)); 
		//�ùٸ� �� �Է½� ���
		System.out.println("����ڰ� �Է��� ���� " + month);
		input.close();

	}
}
