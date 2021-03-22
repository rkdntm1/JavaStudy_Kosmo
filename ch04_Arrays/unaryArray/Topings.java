package unaryArray;

public class Topings {
/**
 * 5가지의 토핑 종류를 문자열 배열에 저장하고 배열에 저장된 문자열을 출력하자 
 * @param args
 */
	public static void main(String[] args) {
		//5가지의 토핑을 배열에 저장
		String[] topings = {"피망", "양파", "소시지", "페페로니", "버섯"};
		//저장된 문자열 출력 
		for (int idx = 0; idx < topings.length; idx++) {
			System.out.print(topings[idx] + " ");
		}
	}

}
