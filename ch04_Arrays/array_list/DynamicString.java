package array_list;

import java.util.Arrays;

public class DynamicString {

	public static void main(String[] args) {
		//ArrayList를 안쓰고 배열만 사용시 얼마나 불편한지 보자 
		String[] foods = {"Butter", "Bread", "Milk"};
		foods = Arrays.copyOf(foods, foods.length + 1); //확장
		for (int i = 2; i > 0; i--) { //2번 자리부터 오른쪽으로 옮기기 
			foods[i + 1] = foods[i]; 
		}
		foods[1] = "Apple";
	}

}
