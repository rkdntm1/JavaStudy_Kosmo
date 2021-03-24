package shootingGame.model;

import java.util.ArrayList;
import java.util.List;

public class Planet {
	private SolarSystemPlanetType planetType;
	private List<Thing> things = new ArrayList<>();
	
	public Planet(SolarSystemPlanetType planetType) {
		this.planetType = planetType;
	}
	
	// 상속일떄는 다른쪽에서 뭔가 던져주는것을 통칭 할 수 있다. 상속 = 통칭 ! 
	public void load(Thing thing){
		things.add(thing);
	}

	
			
}
