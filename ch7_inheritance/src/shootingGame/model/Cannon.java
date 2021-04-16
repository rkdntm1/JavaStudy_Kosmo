package shootingGame.model;

public class Cannon extends Thing {
	/** 발사각 안전범위 - 최소.최대 */
	private static final int MIN_SAFE_DEGREE = 5, MAX_SAFE_DEGREE = 360;
	/** 안전각도니? ㅇ/x */
	public static boolean isSafeDegree(double degree) {
		return degree >= MIN_SAFE_DEGREE && degree <= MAX_SAFE_DEGREE;
	}
	
	/** 0~360 발사각(입력) */
	private double degree;
	/** 발사 속도 m/sec */
	private double velocity;
	private Bullet bullet;
	
	/**
	 * 
	 * @param x x좌표
	 * @param velocity 발사속도
	 */
	public Cannon(double x, double velocity) {
		super(x, 0);
		this.velocity = velocity;
	}

	/**
	 * 장전하기
	 * @param bullet
	 */
	public void load(Bullet bullet) {
		this.bullet = bullet;
		// 캐논의 위치가 불렛의 위치로 설정
		copyPosition(bullet);
	}

	public void setDegree(double degree) {
		this.degree = degree;
	}

	/**
	 * 포의 발사속도 및 각도를 바탕으로 벡터 분해하여 수평 및 수직 속도를 구하고 
	 * 이들을 탄환에 설정한다. 
	 */
	public void shoot() {
		//Math.toRadians(degree) -> 함수 두번 중복성 -> 성능 다운되므로 변수로 지정 
		double Radians =  Math.toRadians(degree);
		// 수평 속도 - 속도 x cos(D) .. D는 라디안 단위으로 변경		
		double xSpeed = velocity * Math.cos(Radians);
		// 수직 속도 - 속도 x sin(D) .. D는 라디안 단위으로 변경		
		double ySpeed = velocity * Math.sin(Radians);
		bullet.setSpeed(xSpeed, ySpeed);
	}
}
