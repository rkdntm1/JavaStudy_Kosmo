package strategyPatternWithFriendship.model.strategy;

import strategyPatternWithFriendship.model.SomeVO;

public abstract class Strategy {
	protected SomeVO.Accessor key;
	
	public void receiveAccessor(SomeVO.Accessor key) {
		this.key = key;
	}
}
