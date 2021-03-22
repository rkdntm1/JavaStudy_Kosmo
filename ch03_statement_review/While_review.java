package ch3_statement_review;

import java.util.Scanner;

public class While_review {

	public static void main(String[] args) {
		//multiplicationable();
		//permutation();
		//loop();		
	}

	// 0,1,2,3,4,5,6,7,8,9, -> 0,1,2,3,4,5,6,7,8,9
	private static void loop() {
		int i = 0;
		boolean isTrue = true;// ������ �ø��� ���ؼ� boolean�� ���
		while(i < 10) {
			if(isTrue) {  // ���� ��
				isTrue = false; 
				System.out.print(i);
			} else {
				System.out.print("," + i);				
			}			
			i++;
		}
	}

	/**
	 * 1���� �Է¹��� ���� ������ ��� ������ ���� ������
	 */
	private static void permutation() {
		//���ڸ� �Է¹ޱ�
		Scanner input = new Scanner(System.in);
		System.out.print("�Է��Ͻÿ� : ");
		int target = input.nextInt();		
		//1���� ���ڱ����� ���������� ��� ���ϱ�
		int i = 1; // �ݺ��ؼ� �Է¹��� �� ���� �ø� ��
		int result = 0; // �հ� ��
		while(i <= target) { // i�� target �� ���� �ݺ��� ��Ű�ڴ�. 
			/*
			 * a = 1+2+3+4+5
			 * a = 5+4+3+2+1
			 * 2a = 5*(1+5)
			 * a = 5*(1+5) / 2 ������
			 * �ݺ��� ���ؼ� ���ϴ°� �����غ���.  
			 */
			result += i;
			i++;
		}
		System.out.println("1���� " + target + "������ �� ���� " + result);
	}

	/**
	 * ����ڷκ��� �� ���� �Է¹޾Ƽ� ������ ����ϱ�
	 */
	private static void multiplicationable() {
		//����ڷκ��� �� ���� �Է¹޾�
		Scanner input = new Scanner(System.in);
		System.out.print("�� �� : ");
		int stage = input.nextInt();		
		//������ ����ϱ�
		int operand = 1;		
		while(operand < 10) {
			int result = stage * operand;
			System.out.println(stage + " * " + operand + " = " + result);
			operand++;
		}
	}

}
