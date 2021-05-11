package model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import view.DisplayBoard;

public class Shape {
	public static final int WIDTH = 1300, HEIGHT = 1400;
	
	private List<Point> listStarPoint = new LinkedList<>();
	private List<Line> listLine = new ArrayList<>();
	
	public Shape() {
		listStarPoint.add(new Point(5, 1000));
		listStarPoint.add(new Point(1200, 700));
		listStarPoint.add(new Point(10, 15));
		listStarPoint.add(new Point(1050, 1300));
		listStarPoint.add(new Point(1000, 10));
		
		//반복문을 구사하여 Line 객체 5개 만들기
		//makeLines조금엉망();
		makeLines성능고려();
		
		DisplayBoard displayBoard = new DisplayBoard();
		for (Line l : listLine) {
			l.printToView(displayBoard.getView());
		}
		displayBoard.display();
	}
	
	public List<Point> getListStarPoint() {
		return listStarPoint;
	}
	
	/**
	 * index를 활용한 구사 방안
	 * 조금엉망인: listStarPoint의 실제 구현 객체가 무엇인가에 따라 성능적인 손실이 발생할 수 있다.
	 */
	private void makeLines조금엉망() {
		for (int i = 0; i < listStarPoint.size() - 1; i++) {
			new Line(listStarPoint.get(i), listStarPoint.get(i + 1)); 
		}
		new Line(listStarPoint.get(listStarPoint.size() - 1), listStarPoint.get(0));
	}
	
	private void makeLines성능고려() {
		//변수가 뭐에요? 값 = 객체 에 대한 이름. 기억. 그것을 어떻게 활용하나요?
		boolean isFirst = true; // 첫 루프일 경우 
		Point prev = null, startPt = null;
		for (Point point : listStarPoint) {
			if (isFirst) { 			// (prev = null) 로 조건을 달면 성능 손해.
				isFirst = false; 	//다음 루프때는 해제 되도록 
				prev = point;		// 처음 루프일때 prev에 첫 point를 넣어서 저장하고 재루프시키기
				startPt = point; 	// 끝과 처음을 연결하는 Line을 구하기위해서
				continue;
			}
			listLine.add(new Line(prev, point));  // 두개의 포인트(이전 point, 현재 point)를 가지고 Line을 만들자 
			prev = point; 			// 다음 루프때 뒤에 포인트가 앞쪽 포인트로 되도록 설정 
		}
		listLine.add(new Line(prev, startPt)); 	// 끝과 처음을 연결하는 Line 만들기 
	}
}
