package arrays;

import java.util.Arrays;

public class TestArrays implements Comparable<TestArrays> {

	public static void main(String[] args) {
		참조형배열정렬하기();
		sortArrayOfPrimitve();		
	}

	private static void 참조형배열정렬하기() {
		TestArrays[] aaa = new TestArrays[3];
		for (int i = 0; i < 3; i++) {
			aaa[i] = new TestArrays();
		}
		Arrays.sort(aaa);
		for (TestArrays v : aaa ) {
			System.out.print(v + " ");
		}
	}

	private static void sortArrayOfPrimitve() {
		//기본형으로 이루어진 배열은 Arrays.sort를 부르면 정렬된다. 
		int[] a = {2, 5, 2, 8};
		
		for (int v : a ) {
			System.out.print(v + " ");
		}
		
		Arrays.sort(a); // 정렬 
		
		for (int v : a ) {
			System.out.print(v + " ");
		}
	}

	@Override
	public int compareTo(TestArrays o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
