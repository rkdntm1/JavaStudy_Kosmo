package shootingGame.model;

public class Bullet extends Thing {
	/** m/sec 수평 속도 및 수직 속도 */
	private double xSpeed, ySpeed; //발사시 만들어짐
	
	public Bullet() {
		// 디폴트 생성자가 있으면 super 안해줘도 알아서 부르는구나.
	}
}
