package www;

public class A {
	public static void main(String[] args) { // main : behavior structor
		// �ý����� �ƿ��� �����ϴ� ����� print�� �θ��µ� ����"�ȳ��ϼ���" ���ڿ��� �ٰž�
		System.out.println("�ȳ��ϼ���"); // statement
		System.out.println("�����ϴ�"); // ������
		System.out.println("�����ϼ̽��ϴ�");// ; = ������ ���� ��Ÿ���� ������
		System.out.println("�����մϴ�");

		// ���������� : ��, ����, ���ڿ�, multimedia data,...

		// ����, �Ǽ�
		// 1, 2, 4, 8
		// 8, 16, 32, 64-> byte(-128~127), short(-32000~31999), int(21��), long
		// 0000 0000. 0000 0001=>1, 0000 0010 -> 2
		// 1000 0001 => -1, -2 =>1000 0010
		// 5=> 0000 0101, -5 ->1000 0101
		// 0111 1111 ->127
		// 1
		// 2 1 > 3
		// 4 2 1 > 7
		// 8 4 2 1 > 15
		// 16 8 4 2 1 > 31
		// s = 2^5 + 2^4 + 2^3 + 2^2 + 2^1 + 2^0
		// 2s = 2^6 +2^5 + 2^4 + 2^3 + 2^2 + 2^1
		// 2s-s = 2^6 -2^0 = S
		// n���� ��Ʈ�϶� �׸� : -2^(n-1) ~ 2^(n-1)-1
		System.out.println(55);

		int ȫ�浿�ǳ��� = 2;
		System.out.println("ȫ�浿�ǳ��̴� " + ȫ�浿�ǳ��� + "�Դϴ�.");
		ȫ�浿�ǳ��� = ȫ�浿�ǳ��� + 10;
		System.out.println("ȫ�浿�ǳ��̴� " + ȫ�浿�ǳ��� + "�Դϴ�.");
		ȫ�浿�ǳ��� = ȫ�浿�ǳ��� + 10 * 10;
		System.out.println("ȫ�浿�ǳ��̴� " + ȫ�浿�ǳ��� + "�Դϴ�.");

		// �Ǽ� -> 32bit - float / 64bit - double

		// ����
		// ASCII(American Standard Code for information interchange) 256 8bit 1����Ʈ
		// 48 - 0 / 65 - A / 97 -a
		// �����ڵ�(Universal Coded) 2����Ʈ �̻�
		// 48 + 1 > 49( 1 )
		char ������ = 'a'; // a = 97(ASCII)
		// ������ = ������ + 2 ; //char :16bit, int : 32bit �����׸��� ū�׸��� ���� ����
		������ = (char) (������ + 2); // ����ȯ
		System.out.println(������);
		������ = (char) (������ + 1); // ����ȯ
		System.out.println(������);
		// I love you - ���ڿ�
		char �ι�°���� = ������++; // �� �ڿ� ++ �����ڸ� ����.. Ȱ���� ������ �÷���.
		System.out.println(������);
		System.out.println(�ι�°����);

		char ����°���� = ++������; // �� �տ� ++ �����ڸ� ����.. �ø��� �� ������ Ȱ��
		System.out.println(������);
		System.out.println(����°����);

		// �̹����� �ִٰ� ����. �⺻���� �������� -> ȭ�� -> Red, Green, Blue + ������
		// �ѹ���Ʈ�� ����Ͽ� �� ������ ��Ÿ�� -> 3byte + 1 => 4Byte

		int x = 5;
		int y = -x;
		System.out.println(x);
		System.out.println(y);

		// % : ������
		int z = y / 3; // divider
		y = y % 3; // modular
		System.out.println(y);
		System.out.println(z);

		int a = 11; // 0000 0000 0000 0000 0000 0000 0000 1011
		a = a << 2;// 0000 0000 0000 0000 0000 0000 0010 1100
		System.out.println(a); // 44
		a = a >> 1;
		System.out.println(a); // 22

		boolean ����is = 3 > 2;
		System.out.println(����is); // true

		// x�� �����̸鼭 �Ȱ��� ���� �ֳ���?
		// �׷��ٸ� "�ȳ�"�̶� �Ұ��̰� �ƴϸ� "Hello"
		boolean isMailOfȫ�浿 = true; // ���� �ٰ��� �ٲܶ� refactor-rename(alt shift r)
		boolean hasGlass = false;
		// !(A && B) = !A || !B
		if (!isMailOfȫ�浿 || !hasGlass) {
			System.out.println("�ȳ�");
		} else {
			System.out.println("Hello");
		}

		boolean boolean1 = true;

		// 1.��Ӹ�����, 2.isMale, 3.hasGlass, 4.isLive
		int ȫ�浿�����系�� = 0b1010; // int: 32���� ������ //0b:�ڿ��ִ� ���� 2���� �ǹ�
		System.out.println(ȫ�浿�����系��);

		if ((ȫ�浿�����系�� & 0b1000) != 0) {
			System.out.println(ȫ�浿�����系�� & 0b1000); // 1000
			System.out.println(ȫ�浿�����系��);
		}

		int[] intValues = { 1, 4, 7, 3, 4, 7, 1 };
		// ^ : exclusiveOr(��Ÿ���̴�? �����ʴ�?) -> T^T = F , 0^0 = 0, 0^1 1^0 = 1, 1^1 = 0
		int c = 0b000000001011;
		int d = 0b000000001110;
		// 0b000000000101
		System.out.println(c ^ d);
		int result = 0;
		for (int val : intValues) {
			result = result ^ val; // 0�ϰ��� ���� ���� ���� �ߺ��� ���� ������ ���� ������
			// 0000000000
			// 0000000001

			// 0000000001
			// 0000000100

			// 0000000101
			// ... �̷������� ���� ���ڴ� ���� ��Ʈ��ġ�� ���� 0�� ������
			// �ߺ����� �ʴ� ���� result ���� �����ϰ� �ȴ�.
		}
		System.out.println(result); //

		int s = 0;
		for (; s < 10; s++) {
			System.out.println(s + "�� ���� " + ~s);
		}
		// 11111111111111 0�ǹ���
		// 11111111111110 1�ǹ���
		// 11111111111101 2�ǹ���
		// 11111111111100 3�ǹ���
		// ... �����϶��� 0�� 1�̶�� �����ϸ� �ɵ��մϴ�.(�������� 111..111 ���� 0�� �ƴ϶� -1�̴ϱ� -1���� ���༭ ����)

		int num = 8;
		System.out.println(num >>= 2);

		num = 10;
		int num2 = 20;

		int result1 = (num >= 10) ? num2 + 10 : num2 - 10;

	}
}
