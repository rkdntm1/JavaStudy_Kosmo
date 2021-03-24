package shootingGame.model;

public class Cannon extends Thing {
	/** 발사 안전 각도 -> 최소와 최대*/
	private static final int MIN_SAFE_DEGREE = 5, MAX_SAFE_DEGREE = 70;  // 포의 안전각도
	/** 안전한 각도니 ? */
	public static boolean isSafeDegree(double degree) {
		return (degree >= MIN_SAFE_DEGREE && degree <= MAX_SAFE_DEGREE);
		
	}
	/** 0~360 발사각 */
	private double degree;
	/** m/sec 발사속도 */
	private double velocity;
	
	private Bullet bullet; // 받았으니 기억하기위해
	
	/**
	 * 
	 * @param x 수평위치
	 * @param velocity 발사속도
	 */
	public Cannon(double x, double velocity) {
		super(x, 0); //상위생성자를 부르자 . x좌표를 떤져주자
		this.velocity = velocity; // 받은 velocity 기억하기
	}

	/**
	 * 장전하기
	 * @param bullet
	 */
	public void load(Bullet bullet) {
		this.bullet = bullet; //기억하기 !	
	}

	public void setDegree(double degree) {
		this.degree = degree;
	}

	public void shoot() {
		
	}


}
