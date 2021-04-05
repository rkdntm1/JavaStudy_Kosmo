package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Board;
import utill.Direction;

public class PackManWin extends JFrame {
	private JTextField txtScore = new JTextField(5);
	private BoardPanel boardPanel;
	
	public PackManWin() {
		this.setTitle("PackMan 게임즐기기");
		this.setSize(Board.WIDTH, Board.HEIGHT); //폭 , 높이
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel pnlNorth = new JPanel(); 
		pnlNorth.add(new JLabel("현재까지의 획득 점수는 "));
		txtScore.setFocusable(false);
		txtScore.setText("0");
		pnlNorth.add(txtScore);
		this.add(pnlNorth, BorderLayout.NORTH);
		
		boardPanel = new BoardPanel();
		boardPanel.setBackground(new Color(20, 200, 80));
		boardPanel.requestFocus();
		boardPanel.setFocusable(true);
		this.add(boardPanel, BorderLayout.CENTER);
		boardPanel.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("방향 바꿔");
				switch(e.getKeyCode()) {
				case KeyEvent.VK_UP:   // To the North
					Board.getInstance().getPackMan().changeDirection(Direction.north);
					break;
				case KeyEvent.VK_DOWN: // To the South
					Board.getInstance().getPackMan().changeDirection(Direction.south);
					break;
				case KeyEvent.VK_LEFT: // To the West
					Board.getInstance().getPackMan().changeDirection(Direction.west);
					break;
				case KeyEvent.VK_RIGHT:// To the East
					Board.getInstance().getPackMan().changeDirection(Direction.east);
					break;
				}			
			}
		});
		
		this.setVisible(true);
	}
}
