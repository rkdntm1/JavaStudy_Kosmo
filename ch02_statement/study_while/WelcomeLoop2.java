package study_while;

public class WelcomeLoop2 {

	public static void main(String[] args) {
		// 0,1,2,3,4,5,6,7,8,9, ->
		// 0,1,2,3,4,5,6,7,8,9
		step4();
	}

	private static void step2() { //함수 추출: 드래그-> 우클릭-> refactor -> method 추출 
		int i = 0; 
		while (i < 10) { //비교를 한다는 것이 시간을 요구한다는 것
			if (i == 0b1001) { //성능 손해
				System.out.print(i);
			} else {
				System.out.print(i + ",");
			}
			i++;
		}
	}
	
	private static void step3() { //함수 추출: 드래그-> 우클릭-> refactor -> 
		int i = 0; 
		System.out.print(i++);
		while (i < 10) { 
			System.out.print("," + i);
			i++;
		}
	}
	
	private static void step4() { //함수 추출: 드래그-> 우클릭-> refactor -> 
		int i = 0;
		boolean isFirst = true;
		while (i < 10) {
			if (isFirst) {
				isFirst = false;
				System.out.print(i);				
			} else {
				System.out.print("," + i);
			}			
			i++;
		}
	}


}
/*
 * 0000 0000
 * 0000 0001
 * 0000 0010
 * 0000 0011
 * ...
 * 0000 1001 
 */
    
