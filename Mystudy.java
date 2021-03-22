package radixSorter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.sun.jdi.Value;

public class Mystudy {

	/**
	 * 10진 양수의 기수 정렬 하기
	 * Map<Integer, List<Integer>>
	 */
	public static void main(String[] args) {
		//주어진 문제
		int[] problem = {5, 8, 22, 53, 171};
		//기수정렬을 하기위해서 열개짜리 방만들기(Bucket)
		//일단 0번 방을 가진 Bucket 만들기 why? => 나중에 다시 Bucket에 넣는건 불안정하기 때문에 다른 버킷에 넣어주기위해
		Map<Integer, List<Integer>> bucket = new TreeMap(); //0번방용
		Map<Integer, List<Integer>> targetBucket = new TreeMap(); //새로운 버킷
		List<Integer> init = new ArrayList<>(); // ArrayList 배열을 가진 list를 생성해줌
		
		for (int val : problem) {
			init.add(val); // 생성된 list인 init에다가 problem의 배열들을 넣어줌
		}
		bucket.put(0, init); // 0번의 방인 bucket에다가 init 리스트를 넣어줌
		
		// 제일 큰수를 찾자!  -> 자리수의 값을 구하여 돌리기 위해서
		int maxVal = findMax(problem); // 배열 problem의 값들을 이용하여 제일 큰수를 찾는 함수를 만들어 리턴시키자
		// 제일 큰수를 이용해서 자리값을 구하자 (log10을 이용하자!)
		int repeatCnt = (int)(Math.log10(maxVal) + 1); // Math.log10(maxVal) ex) 1000 -> 3 , 즉 +1 을 해주면 자릿값이네. 		
		//System.out.println(repeatCnt); // 확인용
		
		// 자리수를 일의자리에서부터 올려가며 나머지를 구하고 해당 방에 넣자
		for (int i = 0; i < repeatCnt; i++) { // 최대 자릿수 만큼 반복을 돌리자
			for (int key : bucket.keySet()) { // bucket의 키 값들을 key에 가져온다.
				List<Integer> list = bucket.get(key); //가져온 키 값을 리스트로 만든다.
				//System.out.println(list);
				for (int val : list) { // list 값들을 가져온다.
					//System.out.println(val);
					int nextKey = (int) ((val % Math.pow(10, i + 1)) / Math.pow(10, i) ); // 다음 bucket 값에 들어갈 데이터 생성
				//	System.out.print(nextKey);
					if (targetBucket.containsKey(nextKey)) { // 새로운 버킷에 다음 키가 있으면
						//그 키안에 넣어준다. 그런데 원래있던 value들은 ? 
						boolean isFirst = true; 
						if (isFirst) {
							isFirst = false;
							List<Integer> valList = new ArrayList();  // 새로운 리스트를 만들어주고
							valList.add(val); // 새로운 리스트에 키를 넣어준다.
							targetBucket.put(nextKey, valList);
						} else {
							targetBucket.get(nextKey).add(val);	
						}
							
					} else { // 새로운 버킷에 키가 없으면
						List<Integer> valList = new ArrayList();  // 새로운 리스트를 만들어주고
						valList.add(val); // 새로운 리스트에 키를 넣어준다.
						targetBucket.put(nextKey, valList); // 이것을 새로운 버킷에 넣어준다.
					}
				}
			}
			
		}
		// 정렬 결과 확인 (음수가 있을때는 앞으로 탐색 뒤로 탐색 이용하기)	
		for (int key : targetBucket.keySet()) { // 새로운 버킷에 있는 키들을 가져온다.
			System.out.println(key); // 확인해보니 버킷의 갱신화가 안이루어짐. 
			for (int val : targetBucket.get(key)) { // 키들의 데이터들을 가져온다.
				//System.out.print(val + " "); //출력
			}
			
		}

	}
	
	
	// 제일 큰수를 찾는 함수 ! 
	private static int findMax(int[] problem) {
		int max = Integer.MIN_VALUE; // 가장 작은 데이터값을 비교값으로 지정하기(안정성)
		for (int val : problem) { // 배열 값들 가져오기
			if (max < val) { 
				max = val;
			}
		}
		// System.out.println("max값은 " + max);
		return max; // 맥스값 리턴!
	}

}
