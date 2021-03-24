package shootingGame.controll;

import java.util.Scanner;

import shootingGame.model.Bullet;
import shootingGame.model.Cannon;
import shootingGame.model.Planet;
import shootingGame.model.SolarSystemPlanetType;
import shootingGame.model.Target;

public class Controller {

	public static void main(String[] args) {
		// 맨먼저
		Planet earth = new Planet(SolarSystemPlanetType.EARTH); //행성생성
		Cannon cannon = new Cannon(0, 1000); //포 생성 위치 속도
		cannon.load(new Bullet()); //포탄 생성, 장전시키기
		Target target = new Target(20000); //목표물 생성, 위치
		earth.load(cannon); 
		earth.load(target);//Overloading
		
		//5W1H 포는 목표물의 위치를 파악하여 그 거리를 km 환산하여 반환한다.		
		System.out.println("목표물까지의 거리는 " + cannon.calcDistance(target) / 1000 + "km입니다.");
		
		//각도를 입력받는다.
		//모듈 = 함수 = 메소드 ... 에 들어있는 문장 총 길이는 제한한다. 9줄(고급), 20줄(고품질) 7+-2
		double degree = inputDegree();
		cannon.setDegree(degree); // 각도 값을 포에 준다. 
		
		cannon.shoot();
	}

	/**
	 * Scanner로부터 입력받은 값이 안전범위에 있는지 검사하고 이를 반환
	 * @return
	 */
	private static double inputDegree() {
		double ret = 0;
		//Scanner로부터 입력받은 값
		Scanner s = new Scanner(System.in);
		
		//안전범위에 있는지 검사 -> do while 생각나야한다.
		do {
			System.out.print("각도를 입력하시오[5-360]: ");
			ret = s.nextDouble();			
		} while(!Cannon.isSafeDegree(ret));
		
		s.close();
		return ret;
	}

}
