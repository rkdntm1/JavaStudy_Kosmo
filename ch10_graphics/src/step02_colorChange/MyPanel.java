package step02_colorChange;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MyPanel extends JPanel implements ActionListener {
	private JButton btnOfRandomColor;
	private Color colorOfPnl;
	
	public MyPanel() {
		setLayout(new BorderLayout());
		btnOfRandomColor = new JButton("색상 변경");
		btnOfRandomColor.addActionListener(this);
		add(btnOfRandomColor, BorderLayout.SOUTH);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int r = (int)(Math.random() * 256);
		int g = (int)(Math.random() * 256);
		int b = (int)(Math.random() * 256);
		colorOfPnl = new Color(r, g, b);
		repaint();
	}
		
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(colorOfPnl);
		g.fillRect(10, 10, 210, 220);
		
	}
}
