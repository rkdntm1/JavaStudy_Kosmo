package study_for;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		Random generator = new Random();
		
		System.out.println("������ ���� : ");
		
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt(); // nextInt() : ���Ժ���
		int sum = 0;
		
		for (int i = 0; i < count; i++) {
			int number = generator.nextInt(100); //���� ���������� 0~100�� ��հ� 50�� 100�� ���� 5000 �α����� ���� ���̴�
			sum += number; 
		}
		System.out.println("���� " + count + "���� ���� " + sum);
	}
}
