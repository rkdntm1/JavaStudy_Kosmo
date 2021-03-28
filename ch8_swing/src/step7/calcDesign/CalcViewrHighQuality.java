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

public class CalcViewrHighQuality extends JFrame {
	private static final int NUM_COLUMNS = 3;
	private static final String[][] lblControls = { // 구조부터 만들고 채운다.
			{"Backspace","","","CE","C"}, 
			{"7","8","9","/","sqrt"},
			{"4","5","6","x","%"},
			{"1","2","3","-","1/x"},
			{"0","+/-",".","+","="}
			};
	
	//Coding Convention. 개발 표준. (접두어같은거)
	private JPanel pnlControl = new JPanel();
	private JTextField txtResult = new JTextField(35);
	private JButton[][] btnControls = new JButton[lblControls.length][lblControls[0].length]; //변수명은 연관성있게. 
	
		
	private CalcViewrHighQuality() {
		this.setTitle("계산기");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		locateCenterWithHalfSize();
		
		txtResult.setText("0.");
		txtResult.setEnabled(false); // 편집 불가
		
		pnlControl.setLayout(new GridLayout(0, lblControls[0].length, 3, 3));
		
		allocateButtonOnCenterPanel();
		
		this.add(txtResult, BorderLayout.NORTH);
		this.add(pnlControl, BorderLayout.CENTER);
		
		this.setVisible(true);
	}
	
/**
 *  버튼을 만들어 Center Panel에 담자
 */
	private void allocateButtonOnCenterPanel() {
		for (int row = 0; row < lblControls.length; row++) {
			for (int col = 0; col < lblControls[0].length; col++) {
				btnControls[row][col] = new JButton(lblControls[row][col]);
				if (col >= NUM_COLUMNS) {
					btnControls[row][col].setForeground(Color.RED);
				} else {
					btnControls[row][col].setForeground(Color.BLUE);
				}
				btnControls[row][col].setBackground(Color.YELLOW);
				pnlControl.add(btnControls[row][col]);
			}	
		}
	}

	/**
	 *  창 크기는 스크린의 절반으로 설정하고, 정 중앙에 띄울 것임
	 */
	private void locateCenterWithHalfSize() {
		Toolkit toolkit = this.getToolkit();
		Dimension dimension = toolkit.getScreenSize();		
		this.setLocation(dimension.width / 4, dimension.height / 4);
		this.setSize(dimension.width / 2, dimension.height / 2);
	}

	public static void main(String[] args) {
		new CalcViewrHighQuality();
	}

}
