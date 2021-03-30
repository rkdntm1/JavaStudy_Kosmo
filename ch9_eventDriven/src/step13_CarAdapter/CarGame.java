package step13_CarAdapter;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class CarPanel extends JPanel {
	final int SPEED = 10;
	BufferedImage img = null;
	int xPos = 100, yPos = 100;
	
	
	CarPanel() {
		try {
			img = ImageIO.read(new File("cannon.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
		this.addKeyListener(new CarKeyListener(this));
		this.requestFocus();
		this.setFocusable(true);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, xPos, yPos, null);
	}

	public void controlCar(int keyCode) {
		switch(keyCode) {							
		case KeyEvent.VK_UP:
			yPos -= (10);
			break;
		case KeyEvent.VK_DOWN:
			yPos += (10);;
			break;
		case KeyEvent.VK_LEFT:
			xPos -= (10);;
			break;
		case KeyEvent.VK_RIGHT:
			xPos += (10);;
			break;
		}
		repaint();
	}
	
}

public class CarGame extends JFrame {
	
	
	CarGame() {
		this.setTitle("계산기");
		this.setSize(900, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(new CarPanel());
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new CarGame();
	}

}
