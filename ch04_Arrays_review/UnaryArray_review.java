package ch4_Arrays_review;

import java.util.Scanner;

public class UnaryArray_review {

	public static void main(String[] args) {
		//aIOBMin();
		//grade();
		//rolldice();
		//seqSearch();
		toping();
	}
	
	/**
	 * 5������ ���� ������ ���ڿ� �迭�� �����ϰ� �迭�� ����� ���ڿ��� ������� 
	 */
	private static void toping() {
		String[] topings = {"�Ǹ�", "����", "�ҽ���", "����δ�", "����"};
		for (int idx = 0; idx < topings.length; idx++) {
			System.out.print(topings[idx] + " ");
		}
	}

	/**
	 * �迭���� Ž������ �Է��Ͽ� ������ Ž���� �ε������� ����ϴ� ���α׷��� ������
	 * @param args
	 */
	private static void seqSearch() {
		//�迭
		int[] s = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		//Ž������ �Է�
		Scanner input = new Scanner(System.in);
		System.out.print("ã�� ���� �Է��Ͻÿ� : ");
		int target = input.nextInt();
		//������ Ž��
		int index = -1; //ã�� ���� ���� ���
		for (int idx = 0; idx < s.length; idx++) {
			if (target == s[idx]) {
				//�ε����� ��������/
				index = idx;
				break; // ���� ��
			}			
		}
		//�ε����� ����ϱ�
		if (index != -1) {
			System.out.println(target + "�� �ε��� ���� " + index);
		} else {
			System.out.println("ã�°��� �����ϴ�.");
		}
		

	}

	/**
	 * �ֻ����� 10000�� ������ �� ���� �󵵸� ����Ͻÿ�. 
	 */
	private static void rolldice() {
		//�ֻ���
		final int DICE = 6; // �ֻ��� 6��
		int[] freq = new int[DICE]; // 6���� �迭�� ����
		//10000�� ����
		for (int idx = 0; idx < 10000; idx++) {
			//������ ��. (0~5)�� �������� -> Math.random (0<=x <1)�̿�
			++freq[(int)(Math.random() * 6)];
		}		
		//���
		for (int idx = 0; idx < freq.length; idx++) {
			System.out.println(idx + 1 + "���� ��: " + freq[idx]);	
		}
		
	}

	/**
	 * ����ڷκ��� 5���� ������ �Է¹޾� ����� ���ϴ� ���α׷�
	 */
	private static void grade() {		
		//����ڷκ��� 5���� ������ �Է¹޴´�.
		final int Number = 5; // 5��
		Scanner input = new Scanner(System.in);		
		int[] scores = new int[Number]; // 5���� ������ ����
		//����� ���ϱ� ���� ����
		int sum = sum1(input, scores);
		//��� ���
		int avg = sum / Number;
		System.out.println("����� " + avg);
	}

	private static int sum1(Scanner input, int[] scores) {
		int sum = 0;
		for (int idx = 0; idx < scores.length; idx++) {
			System.out.print("������ �Է��Ͻÿ�: ");
			int score = input.nextInt();
			sum += score;
		}
		return sum;
	}	

	/**
	 * �迭���� ���� �߿� �ּҰ� ����ϱ�
	 * @param args
	 */
	private static void aIOBMin() {
		//�迭���� ��
		int s[] = {1, 5, 10, 20, -20, -50};
		//�� �߿� �ּҰ� ����ϱ�
		int min = Integer.MAX_VALUE; // �ּҰ��� �񱳵� ������ ����(int�� �ִ밪)
		for(int idx = 0; idx < s.length; idx++) {
			if (min > s[idx]) {
				min = s[idx];
			}
		}
		System.out.println("�ּҰ��� " + min);
	}

}
