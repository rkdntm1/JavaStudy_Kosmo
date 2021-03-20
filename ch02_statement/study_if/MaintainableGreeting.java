package study_if;

import java.util.Date;

public class MaintainableGreeting {
	private enum GreetingType {
		GoodMorning(0, 11), GoodAfterNoon(11, 15), GoodEvening(15, 20), GoodNight(20, 24);
		
		int inMin, exMax;
		
		GreetingType(int inMin, int exMax){ //»ý¼ºÀÚ
			this.inMin = inMin;
			this.exMax = exMax; 
		}
		
		static GreetingType findGreeting(int hour) {
			for(GreetingType val : GreetingType.values()) {
				if(val.inMin <= hour && val.exMax > hour)
					return val;
			}
			return null;
		}
	}
	public static void main(String[] args) {
		Date now = new Date();
		int hour = now.getHours();
		
		System.out.println(GreetingType.findGreeting(hour));
		


	}

}
