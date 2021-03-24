package finalizeStudy;

public class EmpTest {

	public static void main(String[] args) throws InterruptedException {
		// 4번 만들어보자
		ssss();
		System.gc(); //가비지콜렉터(쓰잘데기없는거는 메모리에서 제거)
		Thread.sleep(10000); // 시간을 어느정도 줘야지 적용됨 => 안좋다.
		System.out.println(Emp.getCount());
		
	}

	private static void ssss() {
		Emp e1 = new Emp();
		Emp e2 = new Emp();
		e2 = null; //
		Emp e3 = new Emp();
		Emp e4 = new Emp();
	}

}
