package step1_JFrame;

import javax.swing.JFrame;

public class FrameTest {

	public static void main(String[] args) {
		JFrame window = new JFrame("포쏘기"); // 타이틀을 주면서 창만들기
		window.setSize(300, 200); // 폭 width, 높이 height
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //사용자가 우상단의 닫기를 누르면 프로그램을 끝낼 것임
		window.setVisible(true); //Shows this Window
	}

}
