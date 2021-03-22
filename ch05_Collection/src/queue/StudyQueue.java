package queue;

import java.util.LinkedList;
import java.util.Queue;

public class StudyQueue {

	public static void main(String[] args) throws InterruptedException {
		Queue<Integer> que = new LinkedList<>();
		
		for (int i = 10; i >= 0; i--) {
			que.add(i);
		}
		
		while (!que.isEmpty()) {
			Integer 현처리대상 = que.remove();
			System.out.print(현처리대상 + " ");
			Thread.sleep(2000);
		}
	}

}
