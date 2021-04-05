package view;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

import model.Board;

public class BoardPanel extends JPanel implements ActionListener {
	/** 1초당 한번씩 팩맨 움직이게 합니다. */
	private static final int TIME_PERIOD = 1000; 

	public BoardPanel() {
		super();
		Timer timer = new Timer(TIME_PERIOD, this);
		timer.start();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Board.getInstance().display(g);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Board.getInstance().getPackMan().timeElapsed(TIME_PERIOD);
		repaint();
	}
	
	
}
