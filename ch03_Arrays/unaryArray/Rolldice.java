package unaryArray;

public class Rolldice {
/**
 * �ֻ����� 10000�� ������ �� ���� �󵵸� ����Ͻÿ�. 
 * @param args
 */
	public static void main(String[] args) {
		//�ֻ���  = 6��
		final int DICE = 6;
		final int FREQ = 10000;
		int[] freq = new int[DICE];
		//10000�� ������ �������� ���� �� �Է�
		for (int idx = 0; idx < FREQ; idx ++) {
			// 0~5 ������ �� �Է�
			++freq[(int)(Math.random() * DICE)]; //Math.random() : 0���� ũ�ų� ���� 1���� ������ 
		}
		//�� ���
		System.out.println("==============");
		System.out.println("��" + "\t" + "��");
		System.out.println("==============");
		for (int idx = 0; idx < freq.length; idx++) {
			System.out.println(idx + "\t" + freq[idx]);
		}
	}

}
