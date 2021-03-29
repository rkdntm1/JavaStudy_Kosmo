package step10_mouseEvent;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class MyPanel extends JPanel implements MouseListener {
	Rectangle[] array = new Rectangle[10]; // 클릭해서 만든 사각형들 
	int index = 0; // 지금까지 만든 사각형 수 
	MyPanel(){
		this.addMouseListener(this); // Listener 추가 
	}

	@Override
	public void mousePressed(MouseEvent e) { // 마우스를 눌렀을때
		if (index > 100){
			return;			
		}		
		array[index++] = new Rectangle(e.getX(), e.getY(), 50, 50);			
		repaint();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (Rectangle r: array) {
			if (r != null) {
				g.drawRect(r.x, r.y, r.width, r.height);
			}
		}
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}
	
	@Override
	public void mouseClicked(MouseEvent e) {}


	

	
	
}
