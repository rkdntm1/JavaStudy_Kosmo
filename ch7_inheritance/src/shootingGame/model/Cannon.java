package shootingGame.model;

public class Cannon extends Thing {
	/** 발사 안전 각도... 최소 / 최대  */ //static을 생각해야함
	private static final int MIN_SAFE_DEGREE = 5, MAX_SAFE_DEGREE = 70; 
	/** 안전한 각도니 ? */
	public static boolean isSafeDegree(double degree) {
		if (degree >=MIN_SAFE_DEGREE && degree <= MAX_SAFE_DEGREE) {
			return true;
		}
		return false;
	}
	//각도 발사속도
	/** 5~360 발사각*/
	private double degree;
	/** m/sec 발사속도*/
	private double velocity;
	
	private Bullet bullet;
	/**
	 * @param x 수평위치
	 * @param velocity 발사속도
	 */
	public Cannon(double x, double velocity) {
		super(x, 0);
		this.velocity = velocity;
	}

	/**
	 * 장전
	 * @param bullet
	 */
	public void load(Bullet bullet) {
		this.bullet = bullet;
	}

	public void setDegree(double degree) {
		this.degree = degree;
	}
	
	public void shoot() {
		System.out.println("발사완료");
	}
	
	
}

