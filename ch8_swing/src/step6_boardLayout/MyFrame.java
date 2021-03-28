package step6_boardLayout;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	//JFrame의 기본적인 배치관리자는 누구? Borderlayout North, West, Center, East, South
	public MyFrame() {		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension dim = toolkit.getScreenSize();
		this.setLocation(dim.width / 2, dim.height / 2 );
		this.setTitle("발쏘기");
		this.setSize(300, 200); // 폭 width, 높이 height
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //사용자가 우상단의 닫기를 누르면 프로그램을 끝낼 것임
						
		fillComponents();
		Image img = toolkit.getImage("cannon.png");
		this.setIconImage(img);
		
		this.pack();
		this.setVisible(true); //Shows this Window		
	}
	
	private void fillComponents() {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout(10, 20));
		this.add(panel);
		
		panel.add(new JLabel("화씨"), BorderLayout.NORTH);
		panel.add(new JTextField(10), BorderLayout.WEST);
		panel.add(new JLabel("섭          씨"), BorderLayout.CENTER);
		panel.add(new JTextField(10), BorderLayout.EAST);
		panel.add(new JButton("변환"), BorderLayout.SOUTH); 
	}

	public static void main(String[] args) {
		MyFrame win = new MyFrame();
	}
}
