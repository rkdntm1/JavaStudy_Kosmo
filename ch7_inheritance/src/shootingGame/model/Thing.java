package shootingGame.model;

public abstract class Thing {
	
	//2개의 정보 (x좌표 y좌표)
	private double x, y;
	
	public Thing() {
	}
	public Thing(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double calcDistance(Thing target) {
		return Math.abs(this.x - target.x);
	}
}
