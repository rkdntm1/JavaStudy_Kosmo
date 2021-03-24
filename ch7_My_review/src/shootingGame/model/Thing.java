package shootingGame.model;

public abstract class Thing {
	private double x, y; // 위치정보(x, y)
	
	public Thing() {		
	}
	
	public Thing(double x, double y) {
		this.x = x; //받은 값을 담자 
		this.y = y;
	}
	public double calcDistance(Thing target) { //Cannon에서 이동해옴 
		return Math.abs(this.x - target.x); 
	}
}
