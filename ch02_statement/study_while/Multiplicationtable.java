package study_while;

import java.util.Scanner;

/**
 * ����ڷκ��� �� ���� �Է¹޾Ƽ� ������ ����ϱ�
 * 
 * @param args
 */
public class Multiplicationtable {
	public static void main(String[] args) {
		// ��ǥ �������� �Է¹޴´�.
		int targetStage;
		Scanner input = new Scanner(System.in);
		System.out.print("��ǥ ���� �Է��Ͻÿ� : ");
		targetStage = input.nextInt();
		input.close();		
		
		// 1~9���� �� �ٲٸ鼭 ����ϱ�.
		int i = 1;
		while (i <= 9) {
			System.out.println(targetStage + " * " + i + " = " + targetStage * i);
			i++;
		}
	}
}
