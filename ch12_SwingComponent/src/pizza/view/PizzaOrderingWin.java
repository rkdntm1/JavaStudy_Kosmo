package pizza.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

import pizza.model.Menu;

public class PizzaOrderingWin extends JFrame {
	private static final int WIDTH = 600, HEIGHT = 400;

	// ( 이 안에는 파라미터 받아 들이는 곳) { 이 안에는 처리하는 문장 넣는 곳}
	private PizzaOrderingWin() {
		this.setTitle("피자 주문");
		this.setSize(WIDTH, HEIGHT);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		// 공통성은 클래스화 가변성은 데이터화 ReFactoring하기
		// North 구성
		JPanel pnl4Top = new GuidePanel();
		this.add(pnl4Top, BorderLayout.NORTH);

		// West 구성
		String[] kindItems = { "콤보", "포테이토", "불고기" };
		Menu menu = new Menu("종류", kindItems);
		RadioMenuPanel pnlKind = new RadioMenuPanel(menu);
		this.add(pnlKind, BorderLayout.WEST);

		// Center 구성
		String[] toppingItems = { "피망", "치즈", "페페로니", "베이컨" };
		menu = new Menu("추가토핑", toppingItems);
		CheckMenuPanel pnlTopping = new CheckMenuPanel(menu);
		this.add(pnlTopping, BorderLayout.CENTER);

		// East 구성
		String[] sizeItems = { "small", "medium", "large" };
		menu = new Menu("크기", sizeItems);
		RadioMenuPanel pnlSize = new RadioMenuPanel(menu);
		this.add(pnlSize, BorderLayout.EAST);

		// South 구성
		JPanel pnl4South = new JPanel(new FlowLayout(FlowLayout.CENTER, 30, 5));
		JButton btnOrder = new JButton("주문");
		JButton btnCancel = new JButton("취소");
		pnl4South.add(btnOrder);
		pnl4South.add(btnCancel);
		this.add(pnl4South, BorderLayout.SOUTH);

		this.pack();
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new PizzaOrderingWin();
	}

}
