package step2_selfeventListener;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener, FocusListener {
	public MyFrame() {
		this.setTitle("발쏘기");
		this.setSize(300, 200); // 폭 width, 높이 height
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //사용자가 우상단의 닫기를 누르면 프로그램을 끝낼 것임
		
		//FlowLayout - 폭은 정해져있음. 넣으면 옆으로 흐르다가 한줄이 다 채워지면 다음줄에 나타남
		this.setLayout(new FlowLayout());
		for (int i = 0; i < 50; i++) {
			JButton button = new JButton("Press" + i);
			this.add(button);
			button.addActionListener(this); // 등록
			button.addFocusListener(this); // 등록
		}
		
		this.setVisible(true); //Shows this Window		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("눌렸군");
	}

	@Override
	public void focusGained(FocusEvent e) { // handler
		System.out.println(((JButton) e.getSource()).getLabel() + "들어왔군");
	}

	@Override
	public void focusLost(FocusEvent e) {
		System.out.println(((JButton) e.getSource()).getLabel() + "나갔꾼");		
	}
	public static void main(String[] args) {
		MyFrame win = new MyFrame();
	}
	
}
