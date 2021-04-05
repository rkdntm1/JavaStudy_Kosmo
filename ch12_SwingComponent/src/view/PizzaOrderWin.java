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

public class PizzaOrderWin extends JFrame {

	private PizzaOrderWin() {
		this.setTitle("피자");
		this.setSize(900, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//North 구성
		JPanel pnlOfTop = new JPanel();
		pnlOfTop.setAlignmentX(Component.CENTER_ALIGNMENT); // 가운데 정렬
		JLabel lblOnTop = new JLabel("자바 피자에 오신것을 환영합니다.");
		pnlOfTop.add(lblOnTop);
		this.add(pnlOfTop, BorderLayout.NORTH); 
		//West 구성
		JPanel pnlOfWest = new JPanel(new GridLayout(0, 1));
		TitledBorder border = BorderFactory.createTitledBorder("주문");
		pnlOfWest.setBorder(border);
			//콤보, 포테이토, 불고기
		ButtonGroup menu = new ButtonGroup();
		JRadioButton[] btnOfMenu = new JRadioButton[3];
		btnOfMenu[0] = new JRadioButton("콤보");
		btnOfMenu[1] = new JRadioButton("포테이토");
		btnOfMenu[2] = new JRadioButton("불고기");
		for (JRadioButton btn : btnOfMenu) {
			menu.add(btn);
			pnlOfWest.add(btn);
		}
		this.add(pnlOfWest, BorderLayout.WEST);
		
		//Center 구성
		//East 구성
		//South 구성
		JPanel pnlOfBot = new JPanel(new FlowLayout(FlowLayout.CENTER, 50, 10));
		pnlOfBot.setAlignmentX(Component.CENTER_ALIGNMENT); // 가운데 정렬 
		JButton btnOrder = new JButton("주문");
		JButton btnCancel = new JButton("취소");
		pnlOfBot.add(btnOrder);
		pnlOfBot.add(btnCancel);
		this.add(pnlOfBot, BorderLayout.SOUTH);
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new PizzaOrderWin();
	}

}
