package step11_5_Scribble_v2;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class Panel extends JPanel implements MouseMotionListener {
	private static final int 최대점수 = 1000;
	private int 현재점의수 = 0;
	private Point[] 만들어진점들 = new Point[최대점수];

	Panel(){
		addMouseMotionListener(this);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		if (현재점의수 > 최대점수) {
			return;
		}
		만들어진점들[현재점의수++] = new Point(e.getX(), e.getY());
		repaint();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (Point pnt : 만들어진점들) {
			if (pnt == null)
				break;
			pnt.draw(g);
		}
	}

	@Override
	public void mouseMoved(MouseEvent e) {}

}
