package step11_5_Scribble_v2;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class Panel extends JPanel implements MouseMotionListener {
	private static short MAX_점개수 = 1000;
	private int 지금까지만든점개수 = 0;
	private Point[] 지금까지만든점들 = new Point[MAX_점개수]; 
	
	Panel(){
		addMouseMotionListener(this);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		if (지금까지만든점개수 > MAX_점개수) {
			return;
		}
		지금까지만든점들[지금까지만든점개수++] = new Point(e.getX(), e.getY());
		repaint();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (Point pnt : 지금까지만든점들) {
			if (pnt == null) {
				break;
			}
			pnt.draw(g);
		}
	}
	@Override
	public void mouseMoved(MouseEvent e) {}
}
