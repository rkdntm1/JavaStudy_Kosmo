package shootingGame.model;

import java.util.ArrayList;
import java.util.List;

public class Planet {
	static SolarSystemPlanetType planetType;
	private List<Thing> things = new ArrayList<>();  
	
	public Planet(SolarSystemPlanetType planetType) { //받은 값을 기억하자
		this.planetType = planetType;
	}

	public void load(Thing thing) { // 상속일때는 통칭시킴 
		things.add(thing);
	}	
	
}
