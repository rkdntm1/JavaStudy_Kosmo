package array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class Dynamic {

	public static void main(String[] args) {
		boolean[] fixed = new boolean[5];
		//�迭�� ũ�� ���� (Ȯ��ܰ踦 ���ľ��ؼ� ����)
		fixed = Arrays.copyOf(fixed, 20);
		for (int i = 0; i < 15; i++) {
			fixed[5 + i] = true;
		}
		
		//�ٸ� ��� (Ȯ��ܰ� ���� ���� ���� ���� )
		ArrayList<Boolean> floating = new ArrayList<>(5);
		for (int i = 0; i < 15; i++) {
			floating.add(true); // �� �ڿ� ��ü �߰�
			//�߰��� �ֱ� add(index, E)
			//���� ��ġ ���� remove(index)
		}
	}

}
