package timer_schedule;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class PrintTimer {

	public static void main(String[] args) {
		ScheduledJob job = new ScheduledJob();
		Timer jobScheduler = new Timer();
		jobScheduler.scheduleAtFixedRate(job, 1000, 3000);
		try {
			Thread.sleep(20000);
		} catch (InterruptedException ex) {
			//
		}
		jobScheduler.cancel();
	}

}

class ScheduledJob extends TimerTask {
	public void run() {
		System.out.println(new Date());
	}
}
