package unaryArray;

import java.util.Scanner;

public class SeqSearch {
/**
 * 배열에서 탐색값을 입력하여 순차적 탐색해 인덱스값을 출력하는 프로그램을 만들어보자
 * @param args
 */
	public static void main(String[] args) {
		//배열
		int[] s = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		//탐색값을 입력
		Scanner input = new Scanner(System.in); //입력장치 호출
		System.out.print("탐색할 값을 입력하시오: ");
		int serchData = input.nextInt();
		//순차적 탐색 
		int index = -1; // 해당 인덱스값을 저장하기 위해 + 초기값을 못찾을 경우로 생성
		for (int idx = 0; idx < s.length; idx++) {
			if (serchData == s[idx]) {
				index = idx;
			}			
		}
		//인덱스 값 출력
		if (index != -1) {
			System.out.println(serchData + "의 인덱스 값은 " + index + "입니다.");
		} else {
			System.out.println("못찾았습니다.");
		}
		
		
	}

}
