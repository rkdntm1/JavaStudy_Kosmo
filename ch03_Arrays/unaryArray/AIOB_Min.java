package unaryArray;

public class AIOB_Min {
/**
 * 배열안의 값들 중에 최소값 출력하기
 * @param args
 */
	public static void main(String[] args) {
		//배열 값
		int s[] = {1, 5, 10, 20, -20, -50};
		//최소값 출력하기
		int min = Integer.MAX_VALUE; //안전한 출력을 위해 int의 최대값을 비교값으로 만듬
		for (int idx = 0; idx < s.length; idx++) {
			if (min > s[idx]) {
				min = s[idx];
			}
		}
		System.out.println("최소값은 : " + min);
	}

}
