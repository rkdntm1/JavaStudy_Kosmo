package visitor;

public class TestMain {

	public static void main(String[] args) {
		Operand five = new Operand(5);
		Operand eight = new Operand(8);
		Operator mul = new Operator(five, eight, '*');
		Operand three = new Operand(3);
		Operator plus = new Operator(three, mul, '+');
		
		Prefix prefix = new Prefix(); // +3*58 -> 자기출력 -> 왼쪽 출력 -> 오른쪽 출력
		plus.accept(prefix); //plus야 prefix 방문자가 있으니 받아들여라
		System.out.println();
		
		Postfix postfix = new Postfix();
		plus.accept(postfix);
		System.out.println();
		
		Infix infix = new Infix();
		plus.accept(infix);
	}
}
