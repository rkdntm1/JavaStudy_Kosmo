package strategyPatternWithFriendship.model.strategy;

import strategyPatternWithFriendship.model.SomeVO;

public class AlgoA extends Strategy {
	public AlgoA(SomeVO vo) {
		vo.giveAccessorTo(this);
	}
	
	public int doSome() {
		return key.getAge() + key.getMoney();
	}
}
