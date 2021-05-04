package equal;

public class EqualTest {

	public static void main(String[] args) {
		String a = new String("abc");
		if (a == "abc") {
			//Javascript : ===  
			//같은 객체입니까?
			System.out.println("같은 객체입니다.");
		}
		
		if (a.equals("abc")) {
			//Javascript : ==
			//같은 내용입니까?
			System.out.println("같은 내용입니다.");
		}
		
		String b = a;
		if (a == b) {
			//같은 객체입니까?
			System.out.println("a와 b는 같은 객체입니다.");
		}
		
		if (a.equals(b)) {
			//같은 내용입니까?
			System.out.println("a와 b는 같은 내용입니다.");
		}
	}

}
