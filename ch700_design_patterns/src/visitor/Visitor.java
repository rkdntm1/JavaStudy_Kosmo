package visitor;

public abstract class Visitor {
	public abstract void visit(Operand target); // operand 전용 추상메소드
	public abstract void visit(Operator target); // operator 전용 추상메소드
}
