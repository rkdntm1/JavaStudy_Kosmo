package unaryArray;

public class Rolldice {
/**
 * 주사위를 10000번 던져서 각 면의 빈도를 출력하시오. 
 * @param args
 */
	public static void main(String[] args) {
		//주사위  = 6면
		final int DICE = 6;
		final int FREQ = 10000;
		int[] freq = new int[DICE];
		//10000번 던져서 랜덤값을 통해 빈도 입력
		for (int idx = 0; idx < FREQ; idx ++) {
			// 0~5 생성후 빈도 입력
			++freq[(int)(Math.random() * DICE)]; //Math.random() : 0보다 크거나 같고 1보다 작은수 
		}
		//빈도 출력
		System.out.println("==============");
		System.out.println("면" + "\t" + "빈도");
		System.out.println("==============");
		for (int idx = 0; idx < freq.length; idx++) {
			System.out.println(idx + "\t" + freq[idx]);
		}
	}

}
