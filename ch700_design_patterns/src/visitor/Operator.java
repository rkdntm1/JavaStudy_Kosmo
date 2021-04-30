package visitor;

import java.util.ArrayList;
import java.util.List;

public class Operator extends Node{
	private Node left, right;
	private char operator;
	
	public Operator(Node left, Node right, char operator) {
		this.left = left;
		this.right = right;
		this.operator = operator;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public Node getLeft() {
		return left;
	}

	public Node getRight() {
		return right;
	}
	
	public List<Node> childNodes(){
		List<Node> ret = new ArrayList<>();
		ret.add(left);
		ret.add(right);
		return ret;
	}
	
	public char getOperator() {
		return operator;
	}
}
