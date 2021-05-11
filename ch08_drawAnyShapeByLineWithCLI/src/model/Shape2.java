package model;

import java.util.ArrayList;
import java.util.List;

public class Shape2 {
	private List<Point2> listOfPt = new ArrayList<>();
	
	public Shape2() {
		//점을 만들자
		listOfPt.add(new Point2(5, 1000));
		listOfPt.add(new Point2(1200, 700));
		listOfPt.add(new Point2(10, 15));
		listOfPt.add(new Point2(1050, 1300));
		listOfPt.add(new Point2(1000, 10));
		
		//선을 만들자
		makeLine();
		//선을 만들자(성능)
		makeLineHQ();
	}

	private void makeLineHQ() {
		boolean isFirst = true;
		Point2 prev = null, startPt = null;
		for (Point2 pt : listOfPt) {
			//맨처음 포인트값을 변수로 지정해주자.
			if (isFirst) {
				isFirst = false;
				prev = pt;
				startPt = pt;
				continue;
			}
			new Line2(prev, pt);
		}
		new Line2(prev, startPt);
	}

	private void makeLine() {
		//마지막에서는 인덱스 범위를 벗어나므로 size - 1 을 해주자
		for (int i = 0; i < listOfPt.size() - 1; i++) {
			new Line2(listOfPt.get(i), listOfPt.get(i + 1));
		}
		//마지막 점과 맨처음점의 선
		new Line2(listOfPt.get(0), listOfPt.get(listOfPt.size() - 1));
	}
}
