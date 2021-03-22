package array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class Dynamic {

	public static void main(String[] args) {
		boolean[] fixed = new boolean[5];
		//배열의 크기 변경 (확장단계를 거쳐야해서 불편)
		fixed = Arrays.copyOf(fixed, 20);
		for (int i = 0; i < 15; i++) {
			fixed[5 + i] = true;
		}
		
		//다른 방법 (확장단계 없이 값을 집어 넣음 )
		ArrayList<Boolean> floating = new ArrayList<>(5);
		for (int i = 0; i < 15; i++) {
			floating.add(true); // 맨 뒤에 객체 추가
			//중간에 넣기 add(index, E)
			//임의 위치 제거 remove(index)
		}
	}

}
