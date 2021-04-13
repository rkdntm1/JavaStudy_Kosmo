package view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.Board;
import model.Cell;

public class PanelBoard extends JPanel {
	// 남은 지뢰 개수를 보여줄 레이블
	private JLabel lblRemainedMineCounts = new JLabel();

	private Board board;

	public PanelBoard(Board board) {
		super();
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		this.board = board;
		lblRemainedMineCounts.setText("" + board.getMines());
		lblRemainedMineCounts.setBounds(0, 0, 20, 10);;
		this.add(lblRemainedMineCounts);
		
		JPanel pnlField = new JPanel(new GridLayout(board.getHeight(), board.getWidth()));
		Cell[][] cells = board.getCells();
		for (int row = 0; row < board.getHeight(); row++) {
			for (int col = 0; col < board.getWidth(); col++) {
				ButtonCell btnCell = new ButtonCell(cells[row][col]);
				btnCell.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						if (e.getButton() == MouseEvent.BUTTON1) {
							//펼치기
							Cell cell= ((ButtonCell) e.getSource()).getCell();
							if (cell.hasMine()) {
								// 지뢰 밟았음 
								System.out.println("지뢰");
							} else {
								// 지뢰가 아니니 펼쳐주자
								((ButtonCell) e.getSource()).setText("" + cell.getAroundMineCount());
								// 펼쳤을때 주변 값이 0 이면 자동으로 펼쳐주자
							}
						} else if (e.getButton() == MouseEvent.BUTTON3) {
							// 사용자가 지뢰 있다고 깃발 달기
							((ButtonCell) e.getSource()).setText("*");
						}
					}
				});
				pnlField.add(btnCell);
			}
		}		
		this.add(pnlField);
	}
}
