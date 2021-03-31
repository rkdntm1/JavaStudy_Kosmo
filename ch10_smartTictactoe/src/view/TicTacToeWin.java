package view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import model.Board;

public class TicTacToeWin extends JFrame {
	// 게임 상황에 따라 사용자에게게 가이드하기
	private JLabel lblGuideGame = new JLabel("게임을 즐깁시다.");
	// 사용자의 클릭에 따른 Cell 선택과 전체 상황 출력 용도 
	private DisplayPanel pnlDisplay;
	
	public TicTacToeWin(Board board) {
		this.setTitle("Smart Tictactoe");
		this.setSize(300, (int) (300 / 1.6)); //폭 , 높이
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//사용자 가이드 관련 처리
		this.add(lblGuideGame, BorderLayout.NORTH);
		
		//상황 출력 관련처리
		pnlDisplay = new DisplayPanel(board, lblGuideGame);
		pnlDisplay.setBounds(25, 10, 250, (int) (250 / 1.6));
		this.add(pnlDisplay, BorderLayout.CENTER);
		
		//Reset button 관련 처리 
		JButton btnReset = new JButton("다시 게임하기");
		btnReset.addActionListener(e -> {System.out.println("다시 게임하기 선택됨");});
		this.add(btnReset, BorderLayout.SOUTH);
		this.setVisible(true);
	}
}
