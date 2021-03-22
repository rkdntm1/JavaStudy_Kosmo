package radixSorter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class DecimalPositiveRadixSorter {
	/**
	 * 10�� ��� ��� ���ı�
	 * Map<Integer List<Integer>>
	 * @param args
	 */
	public static void main(String[] args) {
		// �־��� ������ �ִ�.
		int[] problem = { 5, 8, 2, 5, 7 };
		// ����¥�� �� �����(Bucket), �־��� ���� ������ 0�� �濡 ���Ƴֱ�		
		Map<Integer, List<Integer>> bucket = new TreeMap<>();
		Map<Integer, List<Integer>> targetbucket = new TreeMap<>(); //��Ŷ�� �ٽóֱ�� �Ҿ����ϴ� ���ο� ��Ŷ�� ������
		List<Integer> init = new ArrayList<>();
		for (int val : problem) {
			init.add(val);
		}
		bucket.put(0, init); // 0�� Ű�� ���
		
		// ���� ū �� �ľ� > �ݺ� ȸ�� ����
		int maxVal = findMax(problem);
		int repeateCnt = (int)Math.ceil(Math.log10(maxVal)); // �α�10 ���� �ڸ����˾Ƴ��� �ø����� �ݺ�Ƚ��		
		
		// �ڸ����� �����ڸ��������� �÷����� �������� ���ϰ� �ش� �濡 ����
		for (int i = 0; i < repeateCnt; i++) {
			// ù �ݺ��� ����� ����
			for (int key : bucket.keySet()) { //��� Ű�� ����(����� 0��)
				List<Integer> list = bucket.get(key); //0��Ű�� ����ִ� ����
				for (int val : list) { //�װɷ� ���R��
					int nextKey = val >> 10; //���� Ű�� �ֱ����ؼ�
					if (targetbucket.containsKey(nextKey)) { // Ű�� �־�
						targetbucket.get(nextKey).add(val);	
					} else { // Ű�� ���� 
						List<Integer> valList = new ArrayList(); // �游���
						valList.add(val);
						targetbucket.put(nextKey, valList); 
					}				
				}
			}
		}
		
		// ���� ��� Ȯ�� (������ �������� ������ Ž�� �ڷ� Ž�� �̿��ϱ�)		
		for (int key: targetbucket.keySet()) {
			for (int val : targetbucket.get(key)) {
				System.out.print(val + " ");
			}
		}
	}

	private static int findMax(int[] problem) {
		int max = Integer.MIN_VALUE;
		for (int val : problem) {
			if (val > max) {
				max = val;
			}
		}
		return max;
	}

}
