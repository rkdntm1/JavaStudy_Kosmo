package array_list;

import java.util.Arrays;

public class DynamicString {

	public static void main(String[] args) {
		//ArrayList�� �Ⱦ��� �迭�� ���� �󸶳� �������� ���� 
		String[] foods = {"Butter", "Bread", "Milk"};
		foods = Arrays.copyOf(foods, foods.length + 1); //Ȯ��
		for (int i = 2; i > 0; i--) { //2�� �ڸ����� ���������� �ű�� 
			foods[i + 1] = foods[i]; 
		}
		foods[1] = "Apple";
	}

}
