package unaryArray;

public class AIOB_Min {
/**
 * �迭���� ���� �߿� �ּҰ� ����ϱ�
 * @param args
 */
	public static void main(String[] args) {
		//�迭 ��
		int s[] = {1, 5, 10, 20, -20, -50};
		//�ּҰ� ����ϱ�
		int min = Integer.MAX_VALUE; //������ ����� ���� int�� �ִ밪�� �񱳰����� ����
		for (int idx = 0; idx < s.length; idx++) {
			if (min > s[idx]) {
				min = s[idx];
			}
		}
		System.out.println("�ּҰ��� : " + min);
	}

}
