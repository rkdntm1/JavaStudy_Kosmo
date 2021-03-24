package shootingGame.controll;

import java.util.Scanner;

import shootingGame.model.Bullet;
import shootingGame.model.Cannon;
import shootingGame.model.Planet;
import shootingGame.model.SolarSystemPlanetType;
import shootingGame.model.Target;

public class Controller {

	public static void main(String[] args) {
		Planet earth = new Planet(SolarSystemPlanetType.EARTH);
		//캐논을 만들때는 상속받았으니 Thing 까지 생각-> 확장
		Cannon cannon = new Cannon(0, 1000);//x축과 속도
		cannon.load(new Bullet()); //포안에다 포탄을 넣자
		Target target = new Target(20000); //목표물을 만들자 (위치정보만 주면 된다.)
		earth.load(cannon); // earth에 위치 시켜라
		earth.load(target); // earth에 위치 시켜라 (오버로딩)
		
		//5W1H 포는 목표물의 위치를 파악하여 그 거리를 km로 환산하여 반환한다.		
		System.out.println("목표물까지의 거리는 " + cannon.calcDistance(target) / 1000 + "km 입니다.");
		
		//각도를 입력받는다.
		//모듈 = 함수 = 메소드 ... 에 들어있는 문장 총 길이는 제한한다. 9줄 20줄 7+-2
		double degree = inputDegree();
		cannon.setDegree(degree); //각도 기억
		
		cannon.shoot(); // 대포 발사 
	}

	/**
	 * Scanner로 부터 입력 받은 값이 안전범위에 있는지 검사하고 이를 반환
	 * @return
	 */
	private static double inputDegree() {
		double ret = 0;
		Scanner s = new Scanner(System.in);
		
		do {
			System.out.println("각을 입력하시오: ");
			ret = s.nextDouble();
		} while(!Cannon.isSafeDegree(ret));
		
		s.close();		
		return ret;
	}

}
