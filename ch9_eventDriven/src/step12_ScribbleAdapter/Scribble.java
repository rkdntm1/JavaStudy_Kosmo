package step12_ScribbleAdapter;

import javax.swing.JFrame;

public class Scribble extends JFrame {
	private Scribble() {
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
