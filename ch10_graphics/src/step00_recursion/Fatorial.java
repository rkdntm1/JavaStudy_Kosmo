package step00_recursion;

public class Fatorial {

	private static long factorial(int n) {
		if (n == 1)
			return 1;
		return factorial(n - 1) * n;
	}
	public static void main(String[] args) {
		System.out.println("5! = " + factorial(5));
	}

}
