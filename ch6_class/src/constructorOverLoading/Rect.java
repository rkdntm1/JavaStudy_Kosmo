package constructorOverLoading;

public class Rect {
	//속성
	private int num; // 객체 만들어질때마다 번호를 줘보자.
	
	private int x = 2;
	private int y = 3, weight, height;
	
	private static int seed; 
	static { // 초기화과정 
		seed = 1;
	}
	
	private Rect() {
		this(10, 20); // 드래그후+alt+화살표 하면 위치변경가능
		num = seed++; 
		this.x = 10;
	}
	private Rect(int x, int y) { // 2개 받는 생성자  
		this(2, 3, 4, 5);
	}

	public Rect(int x, int y, int weight, int height) {
		this.x = x;
		this.y = y;
		this.weight = weight;
		this.height = height;
	} // 우클릭 - 소스 - 제너레이트 콘스트럭트 유징 필드(속성)
	public static void main(String[] args) {
		Rect r1 = new Rect();
		Rect r2 = new Rect();
		Rect r3 = new Rect();
		Rect r4 = new Rect();
	}

}
