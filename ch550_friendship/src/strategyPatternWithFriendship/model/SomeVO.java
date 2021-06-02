package strategyPatternWithFriendship.model;

import strategyPatternWithFriendship.model.strategy.Strategy;

public class SomeVO {
	private int money;
	private int age;

	public SomeVO(int money, int age) {
		this.money = money;
		this.age = age;
	}
	
	public void giveAccessorTo(Strategy wife) {
        wife.receiveAccessor(new Accessor());
    }
	
	public class Accessor {
		private Accessor() {} // no public constructor
		
		public int getMoney() {
			return money;
		}

		public void setMoney(int m) {
			money = m;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int a) {
			age = a;
		}
	}
}
