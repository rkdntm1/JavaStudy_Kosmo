package view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Board;

public class PackManWin extends JFrame {
	private JTextField txtScore = new JTextField(5);
	private BoardPanel boardPanel; 
	
	public PackManWin(Board board) {
		this.setTitle("PackManWin 게임");
		this.setSize(Board.WIDTH, Board.HEIGHT); //폭 , 높이
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel pnlNorth = new JPanel();
		pnlNorth.add(new JLabel("현재까지의 획득점수는 "));
		txtScore.setFocusable(false);
		txtScore.setText("0");
		pnlNorth.add(txtScore);
		this.add(pnlNorth, BorderLayout.NORTH);
		
		boardPanel = new BoardPanel(board);
		boardPanel.setBackground(new Color(20, 120, 55));
		boardPanel.requestFocus();
		boardPanel.setFocusable(true); // 키를 누를때 판넬이 캐치할 수 있음
		this.add(boardPanel, BorderLayout.CENTER);
				
		this.setVisible(true);
	}
}
