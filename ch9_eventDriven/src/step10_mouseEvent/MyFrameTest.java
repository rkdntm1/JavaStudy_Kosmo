package step10_mouseEvent;

import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrameTest extends JFrame  {

	MyFrameTest() {		
		this.setTitle("마우스로 사각틀 그리기");
		this.setSize(900, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		this.add(new MyPanel()); // 판넬 만들기
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrameTest();
	}

}
