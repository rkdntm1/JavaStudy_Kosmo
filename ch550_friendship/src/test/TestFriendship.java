package test;

import strategyPatternWithFriendship.model.SomeVO;
import strategyPatternWithFriendship.model.strategy.AlgoA;

public class TestFriendship {

	public static void main(String[] args) {
		SomeVO vo = new SomeVO(333, 555);
		AlgoA algoA = new AlgoA(vo);
		
		System.out.println(algoA.doSome());
		
	}

}
