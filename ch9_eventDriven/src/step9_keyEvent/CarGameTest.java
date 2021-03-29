package step9_keyEvent;

import java.awt.Panel;

import javax.swing.JFrame;

public class CarGameTest extends JFrame {

	CarGameTest() {
		this.setTitle("Car Game");
		this.setSize(900, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(new CarPanel());
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new CarGameTest();
	}

}
