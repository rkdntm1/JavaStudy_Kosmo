package step9_keyEvent;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class CarPanel extends JPanel {
	BufferedImage img = null;
	int xPos = 100, yPos = 100;
	
	CarPanel() {
		try {
			img = ImageIO.read(new File("cannon.png"));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
		
		this.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent e) {
				int KeyCode = e.getKeyCode();
				switch(KeyCode) {
				case KeyEvent.VK_UP:
					yPos -= 10;
					break;
				case KeyEvent.VK_DOWN:
					yPos += 10;
					break;
				case KeyEvent.VK_LEFT:
					xPos -= 10;
					break;
				case KeyEvent.VK_RIGHT:
					xPos += 10;
					break;
				}
				repaint();
			}

			@Override
			public void keyReleased(KeyEvent e) {}
			@Override
			public void keyTyped(KeyEvent e) {}
			
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
