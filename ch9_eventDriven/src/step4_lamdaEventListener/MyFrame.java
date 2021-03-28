package step4_lamdaEventListener;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public MyFrame() {
		this.setTitle("발쏘기");
		this.setSize(300, 200); // 폭 width, 높이 height
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //사용자가 우상단의 닫기를 누르면 프로그램을 끝낼 것임
		
		//FlowLayout - 폭은 정해져있음. 넣으면 옆으로 흐르다가 한줄이 다 채워지면 다음줄에 나타남
		this.setLayout(new FlowLayout());
		for (int i = 0; i < 50; i++) {
			JButton button = new JButton("Press" + i);
			this.add(button);
			button.addActionListener(e->System.out.println("눌렀꾼!"));			 // 등록			
		}
		this.setVisible(true); //Shows this Window		
	}

	public static void main(String[] args) {
		MyFrame win = new MyFrame();
	}
}
