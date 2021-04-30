package visitor;

public class Prefix extends Visitor {

	@Override
	public void visit(Operand target) {
		System.out.print(target.getValue());		
	}

	@Override
	public void visit(Operator target) {
		System.out.print(target.getOperator());
		target.getLeft().accept(this); //연산자기준 왼쪽
		target.getRight().accept(this); //연산자기준 오른쪽
	}

}
