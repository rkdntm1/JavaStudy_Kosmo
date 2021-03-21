package ch3_statement_review;

import java.util.Scanner;

public class Do_while_review {

	/**
	 * 1~12���� �ùٸ� ���� �Է� �Ҷ� ���� �ݺ���Ű��
	 */
	public static void main(String[] args) {
		//step1(); 
		step2(); //������ �÷�����
	}

	private static void step2() {
		//�ùٸ� ���� �Է�
		Scanner input = new Scanner(System.in); //�Է���ġ ȣ��		
		//�ùٸ��� ���� (1~12) �ݺ�
		int month;
		int min = 1;
		int max = 12;
		do {
			System.out.print("�Է��Ͻÿ� : ");
			month = input.nextInt();			
		} while(month < min || month > 12);
		System.out.println("�ùٸ� ���Դϴ�.");
	}

	private static void step1() {
		//�ùٸ� ���� �Է�
		Scanner input = new Scanner(System.in); //�Է���ġ ȣ��		
		//�ùٸ��� ���� (1~12) �ݺ�
		boolean isCollect = true;
		do {
			System.out.print("�Է��Ͻÿ� : ");
			int month = input.nextInt();
			if (1 <= month && month <= 12) {  
				isCollect = false; 
			}
		} while(isCollect);
	}

}
