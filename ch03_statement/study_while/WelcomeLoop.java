package study_while;

public class WelcomeLoop {
	/**
	 * while 문을 통해 "환영합니다." 5번 반복시키기
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 0;	
		while (i < 5) {
			System.out.println("환영합니다." );
			i++;			
		}
		System.out.println("반복이 종료되었습니다.");

	}

}
