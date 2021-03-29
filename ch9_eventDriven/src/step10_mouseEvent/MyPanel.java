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
	public void mousePressed(MouseEvent e) {
		if (index > 100){
			return;			
		}		
		array[index] = new Rectangle();
		array[index].x = e.getX();
		array[index].y = e.getY();
		array[index].width = 50;
		array[index].height = 50;
		index++;
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
