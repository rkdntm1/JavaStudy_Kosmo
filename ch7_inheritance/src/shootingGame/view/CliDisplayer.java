package shootingGame.view;

import shootingGame.model.Bullet;
import shootingGame.model.Cannon;
import shootingGame.model.Target;

public class CliDisplayer {
	/** 5km : 한칸으로 */
	private static final int WIDTH = 100, WIDTH_RATIO = 5000;
	/** 3km : 한칸으로 */
	private static final int HEIGHT = 20, HEIGHT_RATIO = 3000;
	private char[][] display = new char[HEIGHT][WIDTH];
	
	private Cannon cannon;
	private Bullet bullet;
	private Target target;
	
	public CliDisplayer(Cannon cannon, Bullet bullet, Target target) {
		this.cannon = cannon;
		this.bullet = bullet;
		this.target = target; // 받아온 값들 저장
				
		display[heightPhy2logical(cannon.getY())][widthPhy2logical(cannon.getX())] = 'C';
		display[heightPhy2logical(target.getY())][widthPhy2logical(target.getX())] = 'T';
	}	

	

	private int widthPhy2logical(double x) {
		return (int) (x / WIDTH_RATIO);
	}

	/**  3000 : 1 = 2000 : ?
	 *   ? = HEIGHT - int(1 * 2000 / 3000) : 물리적 정보에서 논리적정보로 변환
	 *   heightPhy2logical(cannon.getY())
	 */
	private int heightPhy2logical(double y) {
		// 배열에서 높이 데이터는 아래로 되있으므로 전체 높이값 - 물체 높이 = 배열에서의 높이위치값 
		return HEIGHT - 1 - (int) (y / HEIGHT_RATIO); 
	}

	public void display() {
		display[heightPhy2logical(bullet.getY())][widthPhy2logical(bullet.getX())] = 'B';
		for (char[] row : display) {
			for (char col : row) {
				System.out.print(col);
			}
			System.out.println();
		}
	}
	
}
