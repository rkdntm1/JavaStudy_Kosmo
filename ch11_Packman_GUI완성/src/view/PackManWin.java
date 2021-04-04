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
		this.setTitle("PackMan 게임즐기기");
		this.setSize(Board.WIDTH, Board.HEIGHT); //폭 , 높이
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel pnlNorth = new JPanel(); 
		pnlNorth.add(new JLabel("현재까지의 획득 점수는 "));
		txtScore.setFocusable(false);
		txtScore.setText("0");
		pnlNorth.add(txtScore);
		this.add(pnlNorth, BorderLayout.NORTH);
		
		boardPanel = new BoardPanel(board);
		boardPanel.setBackground(new Color(20, 200, 80));
		this.add(boardPanel, BorderLayout.CENTER);
		boardPanel.requestFocus();
		boardPanel.setFocusable(true);
		
		this.setVisible(true);
	}
}
