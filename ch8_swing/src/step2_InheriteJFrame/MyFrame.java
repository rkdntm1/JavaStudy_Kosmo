package step2_InheriteJFrame;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public MyFrame() {
		this.setTitle("발쏘기");
		this.setSize(300, 200); // 폭 width, 높이 height
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //사용자가 우상단의 닫기를 누르면 프로그램을 끝낼 것임
		this.setVisible(true); //Shows this Window		
	}
	
	public static void main(String[] args) {
		MyFrame win = new MyFrame();
	}
}
