package shootingGame.controller;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import shootingGame.model.Bullet;
import shootingGame.model.Cannon;
import shootingGame.model.Planet;
import shootingGame.model.SolarSystemPlanetType;
import shootingGame.model.Target;
import shootingGame.view.CliDisplayer;

public class Controll {
	/** 1초 마다 한번씩 날아가는 모습을 보여줄 것임. 단위는 milliSecond */
	static final int PERIOD = 1000;
	public static void main(String[] args) {
		Planet earth = new Planet(SolarSystemPlanetType.EARTH); //행성을 만들자(지구데이터로)
		Cannon cannon = new Cannon(999, 1000); //캐논을 만들자(x좌표, 속도)
		/*Cannon cannon222 = new Cannon(1000);
		earth.deposite(999, cannon222); //x의 지면을 정의하자 
		*/
		Bullet bullet = new Bullet();
		cannon.load(bullet); //포탄을만들어 캐논에 장착
		Target target = new Target(20000); //목표물만들기(x좌표)
		//캐논과 목표물 위치 시키기
		earth.load(cannon);
		earth.load(target);
		
		//5w1h - 포는 목표물까지의 거리를 파악하여 그 거리를 km로 반환시키자
		cannon.calcDistance(target); //캐논에 목표물을 줘서 사이거리를 반환시키는 메소드를 만들자
		System.out.println("목표물까지의 거리는 " + cannon.calcDistance(target) / 1000 + "km 입니다.");
		
		//각도를 입력받아서 그 값이 안전범위일때 까지 반복(do while)
		double degree = inputDegree(); //안전각도인지확인
		cannon.setDegree(degree);//각도를 기억
		
		cannon.shoot(); //발사
		//시간이 흐르면서 포탄은 날아가고 땅에 닿을때까지 위치를 계산하면서 이를 그림그려준다.
		CliDisplayer displayer = new CliDisplayer(cannon, bullet, target);
		startFly(bullet, displayer);
		//땅에 닿으면 포탄과 목표물 사이의 거리를 산출하여 출력한다.
	}

	private static void startFly(Bullet bullet, CliDisplayer displayer) {
		ScheduledJob job = new ScheduledJob(bullet);
		//시계
		Timer jobScheduler = new Timer();
		//알람 울리기 주기 설정
		jobScheduler.scheduleAtFixedRate(job, 0, PERIOD);
		do {
			//그림으로 그려준다.			
			try {
				Thread.sleep(PERIOD);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			displayer.display(); // 생성자에서 변수를 꺼내 그림그려주자
		} while(bullet.isInSky());
		//타이머 끝
		jobScheduler.cancel();
	}

	private static double inputDegree() {
		double ret = 0;
		Scanner s = new Scanner(System.in);		
		do {
			System.out.print("각도를 입력하시오 : ");
			ret = s.nextDouble();
		} while(!Cannon.isSafeDegree(ret)); // 안전범위일때까지
		s.close();
		return ret;
	}
}

/**
 * 알람이 울리면 처리하는 객체
 */
class ScheduledJob extends TimerTask {
	private Bullet bullet;
	
	ScheduledJob(Bullet bullet) {
		this.bullet = bullet;
	}
	
	public void run() {		
		bullet.fly(Controll.PERIOD);
		
	}
}
