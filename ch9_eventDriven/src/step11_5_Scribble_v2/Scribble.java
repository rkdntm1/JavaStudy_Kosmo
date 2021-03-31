package step11_5_Scribble_v2;

import javax.swing.JFrame;

import step11_Scribble.Panel;

public class Scribble extends JFrame {
	Scribble() {
		setTitle("가위, 바위, 보");
		setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(new Panel()); // 3
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Scribble();
	}
}
