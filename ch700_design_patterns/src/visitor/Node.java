package visitor;

public abstract class Node{
	//abstract method 추상클래스에서 나를 상속받는 녀석들이 이 함수를 구현하고 있어야만 해. 라는 선언
	public abstract void accept(Visitor visitor);
}
