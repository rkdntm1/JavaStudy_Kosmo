package radixSorter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class DecimalPositiveRadixSorter {
	/**
	 * 10진 양수 기수 정렬기
	 * Map<Integer List<Integer>>
	 * @param args
	 */
	public static void main(String[] args) {
		// 주어진 문제가 있다.
		int[] problem = { 5, 8, 2, 5, 7 };
		// 열개짜리 방 만들기(Bucket), 주어진 문제 수들을 0번 방에 몰아넣기		
		Map<Integer, List<Integer>> bucket = new TreeMap<>();
		Map<Integer, List<Integer>> targetbucket = new TreeMap<>(); //버킷에 다시넣기는 불안정하니 새로운 버킷을 만들자
		List<Integer> init = new ArrayList<>();
		for (int val : problem) {
			init.add(val);
		}
		bucket.put(0, init); // 0번 키에 담기
		
		// 제일 큰 수 파악 > 반복 회수 결정
		int maxVal = findMax(problem);
		int repeateCnt = (int)Math.ceil(Math.log10(maxVal)); // 로그10 으로 자리수알아내고 올림으로 반복횟수		
		
		// 자리수를 일의자리에서부터 올려가며 나머지를 구하고 해당 방에 넣자
		for (int i = 0; i < repeateCnt; i++) {
			// 첫 반복만 만들기 연습
			for (int key : bucket.keySet()) { //모든 키의 집합(현재는 0만)
				List<Integer> list = bucket.get(key); //0번키에 담겨있는 내용
				for (int val : list) { //그걸로 뺑뻉이
					int nextKey = val >> 10; //다음 키로 넣기위해서
					if (targetbucket.containsKey(nextKey)) { // 키가 있어
						targetbucket.get(nextKey).add(val);	
					} else { // 키가 없어 
						List<Integer> valList = new ArrayList(); // 방만들기
						valList.add(val);
						targetbucket.put(nextKey, valList); 
					}				
				}
			}
		}
		
		// 정렬 결과 확인 (음수가 있을때는 앞으로 탐색 뒤로 탐색 이용하기)		
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
