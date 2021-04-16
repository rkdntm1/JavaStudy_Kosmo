package shootingGame.model;

public class Bullet extends Thing {
	/**속도 - 수평속도 / 수직속도(수직은 하늘방향이 양수) */
	private double xSpeed, ySpeed;
	
	public Bullet() {
	}
	
	/**
	 * Default Visibility(가시성) 는 동일 패키지까지 허용.
	 * @param xSpeed
	 * @param ySpeed
	 */
	void setSpeed(double xSpeed, double ySpeed) { //같은패키지허용 
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	public void fly(int period) {
		// 수평은 등속이여서 xSpeed의 변화는 없어
		// 수직속도는 자유낙하
		SolarSystemPlanetType planetType = Planet.planetType;
		ySpeed -= (period / 1000) * planetType.surfaceGravity(); // 1초당 속도 변화군
		
		x += xSpeed * (period / 1000);
		y += ySpeed * (period / 1000); 
	}

	public boolean isInSky() {
		return y >= 0;
	}

	@Override
	public String toString() {
		return "Bullet [x=" + x +  ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + "]";
	}
	
}
