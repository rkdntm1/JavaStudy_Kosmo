package carGame;

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
			img = ImageIO.read(new File("cannon.png"));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
		addKeyListener(new KeyListener() {
			@Override
			public void keyPressed(KeyEvent e) {
				int KeyCode = e.getKeyCode();
				
				switch(KeyCode) {							
				case KeyEvent.VK_UP:
					yPos -= (SPEED);
					break;
				case KeyEvent.VK_DOWN:
					yPos += (SPEED);;
					break;
				case KeyEvent.VK_LEFT:
					xPos -= (SPEED);;
					break;
				case KeyEvent.VK_RIGHT:
					xPos += (SPEED);;
					break;
				}
				repaint();
			}
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {}
			
		});
		this.requestFocus();
		this.setFocusable(true);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, xPos, yPos, null);
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
