package unaryArray;

import java.util.Scanner;

public class SeqSearch {
/**
 * �迭���� Ž������ �Է��Ͽ� ������ Ž���� �ε������� ����ϴ� ���α׷��� ������
 * @param args
 */
	public static void main(String[] args) {
		//�迭
		int[] s = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		//Ž������ �Է�
		Scanner input = new Scanner(System.in); //�Է���ġ ȣ��
		System.out.print("Ž���� ���� �Է��Ͻÿ�: ");
		int serchData = input.nextInt();
		//������ Ž�� 
		int index = -1; // �ش� �ε������� �����ϱ� ���� + �ʱⰪ�� ��ã�� ���� ����
		for (int idx = 0; idx < s.length; idx++) {
			if (serchData == s[idx]) {
				index = idx;
			}			
		}
		//�ε��� �� ���
		if (index != -1) {
			System.out.println(serchData + "�� �ε��� ���� " + index + "�Դϴ�.");
		} else {
			System.out.println("��ã�ҽ��ϴ�.");
		}
		
		
	}

}
