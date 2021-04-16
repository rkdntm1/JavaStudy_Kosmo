package shootingGame.model;

public abstract class Thing {
	/** meter */ 
	protected double x, y; //위치정보(x좌표 y좌표) 
	
	public Thing() {		
	}
	
	public Thing(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() { //getter는 생성자 아래쪽에 위치하도록 
		return x;
	}

	public double getY() {
		return y;
	}

	// protected 하위클래스에서 부를 수 있도록 허용
	/** 어떤 물체의 위치를 다른 물체의 위치로 설정할 것임 */
	protected void copyPosition(Thing other) {
		other.x = x;
		other.y = y;
	}
	/**
	 * 포와 목표물 사이 거리 구하기
	 * @param target
	 * @return 
	 */
	public double calcDistance(Thing other) { // 캐논의 위치 정보는 Thing에 있으니 여기서 위치를 생성
		return Math.abs(x - other.x);
	}
}
