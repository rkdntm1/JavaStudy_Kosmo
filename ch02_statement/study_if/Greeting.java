package study_if;

import java.util.Date;

public class Greeting {
	// ������ �����(Top-Down)���� �����ϰ�
	// ������ �����(Bottom-Up)���� ����
	/**
	 * ���� �ð��� ���� �λ縻 ����ϱ�
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// ���� �ð��� ��������
		Date now = new Date();
		int hour = now.getHours();
		// ���� ���� 11, 15 , 20 ���� ���
		if (hour < 11) {
			System.out.println("Good Morgan");
		} else if (hour < 15) {
			System.out.println("Good AN");
		} else if (hour < 20) {
			System.out.println("Good E");
		} else {
			System.out.println("Good N");
		}
	}

}
