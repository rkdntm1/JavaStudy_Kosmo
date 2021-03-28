package step4_JFrameOnCenter;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public MyFrame() {		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension dim = toolkit.getScreenSize();
		this.setLocation(dim.width / 2, dim.height / 2 );
		this.setTitle("발쏘기");
		this.setSize(300, 200); // 폭 width, 높이 height
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //사용자가 우상단의 닫기를 누르면 프로그램을 끝낼 것임
		
		//FlowLayout - 폭은 정해져있음. 넣으면 옆으로 흐르다가 한줄이 다 채워지면 다음줄에 나타남
		this.setLayout(new FlowLayout());
		for (int i = 0; i < 50; i++) {
			this.add(new JButton("Press" + i));
		}
		
		Image img = toolkit.getImage("cannon.png");
		this.setIconImage(img);		
		this.setVisible(true); //Shows this Window		
	}
	
	public static void main(String[] args) {
		MyFrame win = new MyFrame();
	}
}
