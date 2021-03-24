package shootingGame.model;

import java.util.ArrayList;
import java.util.List;

public class Planet {
	private SolarSystemPlanetType planetType; //SolarSystemPlanetType planetType을 기억할 수있는 장치를 만들기
	private List<Thing> things = new ArrayList<>();
	
	public Planet(SolarSystemPlanetType planetType) {
		this.planetType = planetType; //행성타입을 저장
	}
	
	public void load(Thing thing){ //통칭시킴 (상속일때가능) 
		things.add(thing);
	}
}
