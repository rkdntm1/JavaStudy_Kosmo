package step7.calcDesign;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class CalcViewr extends JFrame {
	//Coding Convention. 개발 표준. (접두어같은거)
	private JPanel pnlControl;
	private JTextField txtResult;
	private JButton[] btnControls; //변수명은 연관성있게.
	
	private String[][] lblControls = { // 구조부터 만들고 채운다.
			{"Backspace","","","CE","C"}, 
			{"7","8","9","/","sqrt"},
			{"4","5","6","x","%"},
			{"1","2","3","-","1/x"},
			{"0","+/-",".","+","="}
			};
	
	private CalcViewr() {
		this.setTitle("계산기");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// 창 크기는 스크린의 절반으로 설정하고, 정 중앙에 띄울 것임
		Toolkit toolkit = this.getToolkit();
		Dimension dimension = toolkit.getScreenSize();		
		this.setLocation(dimension.width / 4, dimension.height / 4);
		this.setSize(dimension.width / 2, dimension.height / 2);
		
		txtResult = new JTextField(35);
		txtResult.setText("0.");
		txtResult.setEnabled(false); // 편집 불가
		
		pnlControl = new JPanel();
		pnlControl.setLayout(new GridLayout(0, 5, 3, 3));
		
		btnControls = new JButton[25];
		int idx = 0;
		for (int row = 0; row < 5; row++) {
			for (int col = 0; col < 5; col++) {
				btnControls[idx] = new JButton(lblControls[row][col]);
				if (col >= 3) {
					btnControls[idx].setForeground(Color.RED);
				} else {
					btnControls[idx].setForeground(Color.BLUE);
				}
				btnControls[idx].setBackground(Color.YELLOW);
				pnlControl.add(btnControls[idx]);
				idx++;
			}	
		}
		
		this.add(txtResult, BorderLayout.NORTH);
		this.add(pnlControl, BorderLayout.CENTER);
		
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new CalcViewr();
	}

}
