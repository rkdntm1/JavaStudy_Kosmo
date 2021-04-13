package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.Board;
import model.BoardType;

public class MineWin extends JFrame {

	public MineWin(Board board) {
		this.setTitle("World of Minesweeper");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		// 상단 메뉴 구성하기
		JPanel pnlMenus = new JPanel();
		for (BoardType boardType : BoardType.values()) {
			pnlMenus.add(new JButton(boardType.toString()));
		}
		this.add(pnlMenus, BorderLayout.NORTH);

		// 중앙 게임 상황판 만들기
		PanelBoard pnlBoard = new PanelBoard(board);
		this.add(pnlBoard, BorderLayout.CENTER);
		
		this.pack();
		this.setVisible(true);
	}
}
