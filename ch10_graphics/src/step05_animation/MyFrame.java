package step05_animation;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("에니메이션 테스트");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(700, 500);
		add(new MyPanel());
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}

}
