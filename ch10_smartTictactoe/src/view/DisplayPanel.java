package view;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import model.Board;
import model.Cell;
import model.Stone;

public class DisplayPanel extends JPanel {
	private CellButton[][] cellButtons = new CellButton[Board.ROOT][Board.ROOT];

	protected DisplayPanel(Board board, JLabel lblGuideGame) {
		Cell[][] cells = board.getCells();
		this.setLayout(new GridLayout(Board.ROOT, Board.ROOT));
		for (int row = 0; row < Board.ROOT; row++) {
			for (int col = 0; col < Board.ROOT; col++) {
				cellButtons[row][col] = new CellButton(row, col, cells[row][col]);
				cellButtons[row][col].addActionListener(e -> { //클릭이 일어났을때
					//사용자가 선택한  Cell에 userStone 놓기
					CellButton btnCell = (CellButton) e.getSource();
					Cell cell = btnCell.getCell();
					if (!cell.isEmpty()) {
						return;
					}
					cell.setStone(Stone.userStone);
					btnCell.setText("" + Stone.userStone.getDisplayChar());
					if (cell.isSomeoneWin()) { //cell의 관점에서 유저가 플레이했던 cell을 바탕으로 이겼는지
						lblGuideGame.setText("플레이어가 승리하였습니다.");
						return;
					}
					Cell comCell = board.play();
					cellButtons[comCell.getRow()][comCell.getCol()].setText("" + Stone.comStone.getDisplayChar());
					if (comCell.isSomeoneWin()) {
						lblGuideGame.setText("컴퓨터가 승리하였습니다.");
						return;
					}
					
					if (board.isEnded()) {
						lblGuideGame.setText("다시 하시겠습니까?");
						return;
					}
				});
				this.add(cellButtons[row][col]);
			}
		}
	}
}
