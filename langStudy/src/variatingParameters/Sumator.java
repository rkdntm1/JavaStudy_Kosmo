package variatingParameters;

public class Sumator {
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static int sum(int a, int b, int c) {
		return a + b + c;
	}
	
	public static int sum(int a, int b, int c, int d) {
		return a + b + c + d;
	}
	
	/** 개수 가변. variant argument*/
	public static int sum(int... a) { // a는 리스트형태
		int sum = 0;
		for (int val : a) {
			sum += val;
		}
		return sum;
	}
}
