package study_if;

import java.util.Scanner; //ctrl shift o => ����Ű

public class mypractice {
	/**
	 * ����ڰ� �Է��� ���� ¦������ Ȧ������ �����Ͽ� ����մϴ�.
	 * 
	 * @param args
	 */
	
//	public static void main(String[] args) {
//		//����ڷκ��� �Է¹ޱ�
//		Scanner input = new Scanner(System.in);
//		int number = input.nextInt();		
//		//�Է��� ���� ¦�� ���� �ƴ��� ����
//		/*
//		 * 1111 -1
//		 * 0000 0
//		 * 0001 1
//		 * 0010 2
//		 * 0011 3   => �� �ڿ� �ִ� �ڸ��� 0�� ��� ¦����?
//		 */		
//		if ((number & 1) == 0 ) {
//			//¦�� ���
//			System.out.println("¦��");
//		} else {
//			//Ȧ�� ���
//			System.out.println("Ȧ��");
//		}
//		
//}

	/**
	 * ����� ���� ��ǥ(1000����)�� �޼��Ͽ��� ��쿡�� ���� ��ǥ�� �ʰ��� �ݾ��� 10%�� ���������� �޴� ���α׷�
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//(���)���� ��ǥ
		final int TARGET_AMOUNT = 1000;
		//(���)�������ۼ�Ʈ
		final float COMMISION = 0.1f;
		//���� �Է¹ޱ�
		Scanner input = new Scanner(System.in);
		System.out.print("����: ");
		int myGoal = input.nextInt();
		int overPerformance = myGoal - TARGET_AMOUNT;
		//���ʽ� �ݾ� = ���� - ��ǥ * 0.1 
		float bonus = overPerformance * COMMISION;  
		//������ ��ǥ���� ������ 
		if (myGoal > TARGET_AMOUNT) {
			//���ʽ� �ݾ� ���
			System.out.println("�޼� ����, ������ : " + (int) bonus * 10000 + "��");
		} else {
			System.out.println("�޼� ����");
		}
	}
}
