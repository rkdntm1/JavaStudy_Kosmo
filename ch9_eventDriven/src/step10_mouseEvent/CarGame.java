package step10_mouseEvent;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
		this.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				xPos = e.getX();
				yPos = e.getY();
				repaint();
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
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
