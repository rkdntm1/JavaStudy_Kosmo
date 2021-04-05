package view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

public class PizzaOrderingWin extends JFrame {
	private static final int WIDTH = 600, HEIGHT = 400;
	
	// ( 이 안에는 파라미터 받아 들이는 곳) { 이 안에는 처리하는 문장 넣는 곳}
	private PizzaOrderingWin() {
		this.setTitle("피자 주문");
		this.setSize(WIDTH, HEIGHT);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		//North 구성
		JPanel pnl4Top = new JPanel();
		JLabel lblTopGuide = new JLabel("자바 피자 세상에 오신걸 환영합니다.");
		lblTopGuide.setAlignmentX(Component.CENTER_ALIGNMENT);
		pnl4Top.add(lblTopGuide);
		this.add(pnl4Top, BorderLayout.NORTH);
		//West 구성
		JPanel pnlKind = new JPanel(new GridLayout(0, 1));
		TitledBorder kindTitleBorder = BorderFactory.createTitledBorder("종류");
		pnlKind.setBorder(kindTitleBorder);
			//콤보, 포테이토, 불고기
		JRadioButton[] kindButtons = new JRadioButton[3];
		kindButtons[0] = new JRadioButton("콤보");
		kindButtons[1] = new JRadioButton("포테이토");
		kindButtons[2] = new JRadioButton("불고기");
		ButtonGroup kindGroup = new ButtonGroup();
		for (JRadioButton btn : kindButtons) {
			kindGroup.add(btn);
			pnlKind.add(btn);
		}
		this.add(pnlKind, BorderLayout.WEST);
		//Center 구성
		//East 구성
		//South 구성 
		JPanel pnl4South = new JPanel(new FlowLayout(FlowLayout.CENTER, 50, 5));
		JButton btnOrder = new JButton("주문");
		JButton btnCancel = new JButton("취소");
		pnl4South.add(btnOrder);
		pnl4South.add(btnCancel);
		this.add(pnl4South, BorderLayout.SOUTH);
		
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new PizzaOrderingWin();
	}

}
