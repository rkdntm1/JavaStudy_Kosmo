package ch2_review;

public class Ch2 {
/**
 * 주어진 배열에서 중복되지 않는 값을 출력 시키자.
 * @param args
 */
	public static void main(String[] args) {
		//주어진 배열
		int[] intValues = { 1, 4, 7, 3, 4, 7, 1 }; 
		//중복되지 않는 값 확인
		int result = 0; // 중복되지 않는 값을 result에 담을 것임
		for (int idx = 0; idx < intValues.length; idx++) { // 배열의 크기만큼 반복
			result ^= intValues[idx]; // ^ : ExclusiveOr (배타적or : 서로 다를때 1 출력) -> 같은 값이면 0으로 변환되므로
									  //     같은 값이 없는 데이터를 출력 할 수 있음
		}
		//출력
		System.out.println("중복되지 않는 값은 : " + result);
	}

}
