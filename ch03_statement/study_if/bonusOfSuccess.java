package study_if;

import java.util.Scanner;

public class bonusOfSuccess {
	/**
	 * ����� ���� ��ǥ(1000����)�� �޼��Ͽ��� ��쿡�� ���� ��ǥ�� �ʰ��� �ݾ��� 10%�� ���������� �޴� ���α׷�
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// ��ǥ����
		final int TARGET = 1000;
		// ���ʽ� ������
		final float COMMISION = 0.1F;
		// ������ �Է¹޴´�
		Scanner input = new Scanner(System.in);
		int bonus = input.nextInt();
		// ��ǥ����
		int overPerformance = bonus - TARGET;
		// ������ǥ�� �޼��ϸ�... 
		if (overPerformance > 0) {
			// ���� �޼� ���
			System.out.println("�����޼�");
			// ������ = ���� - ��ǥ * 10% , ����Ͽ� ���
			float bonusOfSuccess = overPerformance * COMMISION;
			System.out.println("������ : " + (int) (bonusOfSuccess * 10000) + "��");
		} else {
			System.out.println("�޼�����");
		}

	} 

}
