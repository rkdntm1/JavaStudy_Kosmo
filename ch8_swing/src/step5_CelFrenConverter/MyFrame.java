package step5_CelFrenConverter;

import java.awt.Dimension;
import java.awt.GridLayout;
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
		this.setVisible(true); //Shows this Window		
	}
	
	/**
	 * 판넬설정을 2열로 맞추어서 해줌 
	 */
	private void fillComponents() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0, 2));
		this.add(panel);
		
		panel.add(new JLabel("화씨"));
		panel.add(new JTextField(15)); // 글자수(15)
		panel.add(new JLabel("섭씨"));
		panel.add(new JTextField(15)); // 글자수(15)
		panel.add(new JButton("변환")); 
	}

	public static void main(String[] args) {
		MyFrame win = new MyFrame();
	}
}
