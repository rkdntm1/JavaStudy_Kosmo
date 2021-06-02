package problemDefinition;

public class ClassA {
	//여러가지 속성이 있다.
	private int a;
	private int b;
	private int c;
	private int d;
	private int e;
	private int f;
	private int g;

	//내가 가진 속성들을 활용하여 처리해야할 많은 함수들이 있다. => 유지보수성. 이해성이 너무 나빠진다.
	//분할 정복 방안으로 Strategy Pattern(전략 패턴) 
	public int funca() {
		return a + b;
	}

	public int funcb() {
		return a + b;
	}

	public int funcc() {
		return a + b;
	}

	public int funcd() {
		return a + b;
	}

	public int funce() {
		return a + b;
	}

	public int funcf() {
		return a + b;
	}

	public int funcg() {
		return a + b;
	}
}

