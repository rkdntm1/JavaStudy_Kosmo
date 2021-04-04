package view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import model.Board;

public class BoardPanel extends JPanel {
	private Board board;

	public BoardPanel(Board board) {
		super();
		this.board = board;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		board.display(g);
	}
	
	
}
