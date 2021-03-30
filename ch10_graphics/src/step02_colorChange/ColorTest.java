package step02_colorChange;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorTest extends JFrame {
	public ColorTest() {
		setSize(240, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Color Test");
		setVisible(true);
		JPanel panel = new MyPanel();
		add(panel);
	}

	public static void main(String[] args) {
		new ColorTest();
	}
}
