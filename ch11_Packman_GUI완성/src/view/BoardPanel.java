package view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import model.Board;

public class BoardPanel extends JPanel {
	private Board board;
	
	public BoardPanel(Board board) {
		super(); // 상위클래스의 기본 생성자를 부름 . 있어도 없어도 됨.
		this.board = board;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		board.display(g);
	}

	
}
