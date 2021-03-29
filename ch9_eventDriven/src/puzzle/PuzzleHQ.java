package puzzle;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import utill.Pair;

class MyButton extends JButton {
	static int count = 0;
	int rowIndex, colIndex;
	private List<MyButton> listAdjCell = new ArrayList<>();

	public MyButton(String s) {
		// 버튼이 만들어질때 인덱스
		super(s); // Caption 주기
		// c 0 -> row : 0, col : 0 / 1 -> row :0 col :1 / 7 -> row 2, 1
		rowIndex = count / PuzzleHQ.ROOT;
		colIndex = count++ % PuzzleHQ.ROOT;		
	}
	
	void buildAdjCell(MyButton[][] buttons) {
		for (Direction dir : Direction.values()) {
			// 각 버튼마다 동서남북 방향 확인하기
			// 각 방향 값을 + 해주어 getSafeIdx 함수에 넣어 안전 범위 안에 있는지 확인하여
			// 안전범위안에 있을 경우 row 값과 col 값을 가져온다.
			Pair<Integer, Integer> safeIdx = getSafeIdx(rowIndex + dir.getRowDelta(), colIndex + dir.getColDelta());
			if (safeIdx != null) {
				listAdjCell.add(buttons[safeIdx.getFrist()][safeIdx.getSecond()]);				
			}
		}
	}

	private Pair<Integer, Integer> getSafeIdx(int i, int j) {
		if (i >= 0 && i < PuzzleHQ.ROOT && j >= 0 && j < PuzzleHQ.ROOT) {
			return new Pair(i, j);
		}
		return null;
	}

	public MyButton findEmptyCell() {
		for(MyButton adjCell : listAdjCell) {
			if (adjCell.getText().equals(PuzzleHQ.EMPTY_CELL_CAPTION)) {
				return adjCell; 
			}
		}
		return null;
	}
}

public class PuzzleHQ extends JFrame implements ActionListener {
	static final int ROOT = 4, SQUARE_OF_ROOT = 9;
	static final String EMPTY_CELL_CAPTION = " "; 
	MyButton[][] buttons;
	JButton reset;

	public PuzzleHQ() {
		super("puzzle");
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0, ROOT, 2, 2));
		buttons = new MyButton[ROOT][ROOT];
		// 9개의 버튼 만들기[1~9]
		for (int r = 0; r < ROOT; r++) {
			for (int c = 0; c < ROOT; c++) {
				buttons[r][c] = new MyButton("" + (r * ROOT + c + 1));
				panel.add(buttons[r][c]);
				buttons[r][c].addActionListener(this);
			}
		}	
		// 3행 3열 자리(9번 버튼)는 빈칸으로
		buttons[ROOT - 1][ROOT - 1].setText(" ");		
		add(panel, BorderLayout.CENTER);
		
		for (int r = 0; r < ROOT; r++) {
			for (int c = 0; c < ROOT; c++) {
				buttons[r][c].buildAdjCell(buttons);
			}
		}	
		
		reset = new JButton("reset");
		reset.setBackground(Color.red);
		reset.setForeground(Color.yellow);
		add(reset, BorderLayout.SOUTH);
		// reset.addActionListener(this);

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		MyButton b= (MyButton) e.getSource();
		// 빈칸을 눌렀을 경우 리턴
		if(b.getText().equals(EMPTY_CELL_CAPTION) == true)
			return;
		// 클릭한곳 주변을 조사하여 빈칸이면 바꾸어주자.
		MyButton emptyCell = b.findEmptyCell();
		if (emptyCell != null) {
			emptyCell.setText(b.getText());
			b.setText(EMPTY_CELL_CAPTION);
		}
	}
	
	public static void main(String[] args) {
		new PuzzleHQ();
	}
}
