package step12_ScribbleAdapter;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class ScribbleMouseMotionListener extends MouseMotionAdapter {
	private Panel panel;
	
	protected ScribbleMouseMotionListener(Panel panel) {
		this.panel = panel;
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		panel.addPoint(e);
	}
}
