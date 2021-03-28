package puzzle;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PuzzlFrame extends JFrame implements ActionListener {
	private static final String[] NUMBERPAD = { "1", "2", "3", "4", "5", "6", "7", "8", "" };
	private static final String[][] NUMBERPAD2 = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "" } };
	private JPanel pnlNumberPad = new JPanel();
	private JButton[][] btnNumberPad = new JButton[NUMBERPAD2.length][NUMBERPAD2[0].length];
	private JButton btnReset = new JButton("reset");

	PuzzlFrame() {
		this.setTitle("퍼즐");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		locateCenterWithHalfSize();
		putPanelMakeKeyPad();

		pnlNumberPad.setLayout(new GridLayout(3, 3, 2, 2));
		this.add(pnlNumberPad, BorderLayout.CENTER);
		this.add(btnReset, BorderLayout.SOUTH);

		btnReset.setBackground(Color.red);
		btnReset.setForeground(Color.yellow);
		btnReset.addActionListener(this);
		this.pack();
		this.setVisible(true);
	}

	/**
	 * 키패드 숫자버튼 만들어서 판넬에 넣기
	 */
	private void putPanelMakeKeyPad() {
		for (int row = 0; row < NUMBERPAD2.length; row++) {
			for (int col = 0; col < NUMBERPAD2.length; col++) {
				btnNumberPad[row][col] = new JButton(NUMBERPAD2[row][col]);
				pnlNumberPad.add(btnNumberPad[row][col]);
				btnNumberPad[row][col].addActionListener(this);
			}
		}
	}

	/**
	 * 창 크기는 스크린의 절반으로 설정하고, 정 중앙에 띄울 것임
	 */
	private void locateCenterWithHalfSize() {
		Toolkit toolkit = this.getToolkit();
		Dimension dimension = toolkit.getScreenSize();
		this.setLocation(dimension.width / 4, dimension.height / 4);
		this.setSize(dimension.width / 2, dimension.height / 2);
	}

	public static void main(String[] args) {
		new PuzzlFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		char collect = 'c';
		for (int row = 0; row < NUMBERPAD2.length; row++) {
			for (int col = 0; col < NUMBERPAD2[0].length; col++) {
				if (button.getText().equals("")) { // 빈칸을 눌렀을경우
					System.out.println("빈칸누름");
				} else if (button.getLabel() == "reset") { // reset 눌렀을경우 초기화
					System.out.println("리셋");
					btnNumberPad[row][col].setText(NUMBERPAD2[row][col]);
				} else { // 숫자 버튼을 눌렀을 경우
					rowEmpty(collect, row, col);
					colEmpty(collect, row, col);
					if (collect == 'd') {
						btnNumberPad[row][col].setText(NUMBERPAD2[row][col]);
						System.out.println(NUMBERPAD2[row][col]);
						button.setText(" ");
					}

				}

			}
		}
	}

	/**
	 * 각 이웃한 행에 빈칸이 있을 경우
	 * 
	 * @param button
	 * @param row
	 * @param col
	 */
	private void rowEmpty(char collect, int row, int col) {
		if (row == 0) {
			if (NUMBERPAD2[1][col] == "") {
				collect = 'a';
			}
		} else if (row == 1) {
			if (NUMBERPAD2[0][col] == "") {
				collect = 'a';
			} else if (NUMBERPAD2[2][col] == "") {
				collect = 'a';
			}
		} else if (row == 2) {
			if (NUMBERPAD2[1][col] == "") {
				collect = 'a';
			}
		}
	}

	/**
	 * 이웃한 열에 빈칸이 있을 경우 자리 교체
	 * 
	 * @param button
	 * @param row
	 * @param col
	 */
	private void colEmpty(char collect, int row, int col) {
		if (col == 0) {
			if (NUMBERPAD2[row][1] == "") {
				collect = 'd';
			}
		} else if (col == 1) {
			if (NUMBERPAD2[row][0] == "") {
				collect = 'd';
			} else if (NUMBERPAD2[row][2] == "") {
				collect = 'd';
			} else if (col == 2) {
				if (NUMBERPAD2[row][1] == "") {
					collect = 'd';
				}
			}
		}
	}
}
