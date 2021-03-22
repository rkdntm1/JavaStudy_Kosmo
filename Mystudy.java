package radixSorter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.sun.jdi.Value;

public class Mystudy {

	/**
	 * 10�� ����� ��� ���� �ϱ�
	 * Map<Integer, List<Integer>>
	 */
	public static void main(String[] args) {
		//�־��� ����
		int[] problem = {5, 8, 22, 53, 171};
		//��������� �ϱ����ؼ� ����¥�� �游���(Bucket)
		//�ϴ� 0�� ���� ���� Bucket ����� why? => ���߿� �ٽ� Bucket�� �ִ°� �Ҿ����ϱ� ������ �ٸ� ��Ŷ�� �־��ֱ�����
		Map<Integer, List<Integer>> bucket = new TreeMap(); //0�����
		Map<Integer, List<Integer>> targetBucket = new TreeMap(); //���ο� ��Ŷ
		List<Integer> init = new ArrayList<>(); // ArrayList �迭�� ���� list�� ��������
		
		for (int val : problem) {
			init.add(val); // ������ list�� init���ٰ� problem�� �迭���� �־���
		}
		bucket.put(0, init); // 0���� ���� bucket���ٰ� init ����Ʈ�� �־���
		
		// ���� ū���� ã��!  -> �ڸ����� ���� ���Ͽ� ������ ���ؼ�
		int maxVal = findMax(problem); // �迭 problem�� ������ �̿��Ͽ� ���� ū���� ã�� �Լ��� ����� ���Ͻ�Ű��
		// ���� ū���� �̿��ؼ� �ڸ����� ������ (log10�� �̿�����!)
		int repeatCnt = (int)(Math.log10(maxVal) + 1); // Math.log10(maxVal) ex) 1000 -> 3 , �� +1 �� ���ָ� �ڸ����̳�. 		
		//System.out.println(repeatCnt); // Ȯ�ο�
		
		// �ڸ����� �����ڸ��������� �÷����� �������� ���ϰ� �ش� �濡 ����
		for (int i = 0; i < repeatCnt; i++) { // �ִ� �ڸ��� ��ŭ �ݺ��� ������
			for (int key : bucket.keySet()) { // bucket�� Ű ������ key�� �����´�.
				List<Integer> list = bucket.get(key); //������ Ű ���� ����Ʈ�� �����.
				//System.out.println(list);
				for (int val : list) { // list ������ �����´�.
					//System.out.println(val);
					int nextKey = (int) ((val % Math.pow(10, i + 1)) / Math.pow(10, i) ); // ���� bucket ���� �� ������ ����
				//	System.out.print(nextKey);
					if (targetBucket.containsKey(nextKey)) { // ���ο� ��Ŷ�� ���� Ű�� ������
						//�� Ű�ȿ� �־��ش�. �׷��� �����ִ� value���� ? 
						boolean isFirst = true; 
						if (isFirst) {
							isFirst = false;
							List<Integer> valList = new ArrayList();  // ���ο� ����Ʈ�� ������ְ�
							valList.add(val); // ���ο� ����Ʈ�� Ű�� �־��ش�.
							targetBucket.put(nextKey, valList);
						} else {
							targetBucket.get(nextKey).add(val);	
						}
							
					} else { // ���ο� ��Ŷ�� Ű�� ������
						List<Integer> valList = new ArrayList();  // ���ο� ����Ʈ�� ������ְ�
						valList.add(val); // ���ο� ����Ʈ�� Ű�� �־��ش�.
						targetBucket.put(nextKey, valList); // �̰��� ���ο� ��Ŷ�� �־��ش�.
					}
				}
			}
			
		}
		// ���� ��� Ȯ�� (������ �������� ������ Ž�� �ڷ� Ž�� �̿��ϱ�)	
		for (int key : targetBucket.keySet()) { // ���ο� ��Ŷ�� �ִ� Ű���� �����´�.
			System.out.println(key); // Ȯ���غ��� ��Ŷ�� ����ȭ�� ���̷����. 
			for (int val : targetBucket.get(key)) { // Ű���� �����͵��� �����´�.
				//System.out.print(val + " "); //���
			}
			
		}

	}
	
	
	// ���� ū���� ã�� �Լ� ! 
	private static int findMax(int[] problem) {
		int max = Integer.MIN_VALUE; // ���� ���� �����Ͱ��� �񱳰����� �����ϱ�(������)
		for (int val : problem) { // �迭 ���� ��������
			if (max < val) { 
				max = val;
			}
		}
		// System.out.println("max���� " + max);
		return max; // �ƽ��� ����!
	}

}
