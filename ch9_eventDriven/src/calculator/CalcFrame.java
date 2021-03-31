package calculator;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalcFrame extends JFrame implements ActionListener {
	private static final String[] lblControls = { "+", "-", "x", "/", "=", "clear" };
	private static final String[] lblNUMBER = { "7", "8","9","4","5", "6", "1", "2", "3", "","0", "" };
	private JPanel pnlControl = new JPanel();
	private JPanel pnlNumberPad = new JPanel();
	private JTextField txtResult = new JTextField(35);
	private JButton[] btnControls = new JButton[lblControls.length];
	private JButton[] btnNumberPad = new JButton[lblNUMBER.length];

	CalcFrame() {
		this.setTitle("계산기");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		locateCenterWithHalfSize(); //창 사이즈 중간설정 및 중앙정렬
		
		pnlNumberPad.setLayout(new GridLayout(4, lblControls.length,	3,3)); //넘버패드 레이아웃설정
		pnlControl.setLayout(new BoxLayout(pnlControl, BoxLayout.Y_AXIS)); //컨트롤패드 레이아웃설정
		
		putPanelMakeKeyPad();		// 넘버패드 버튼 만들어 판넬에 추가
		putPanelMakeControl();      // 컨트롤패드 버튼 만들어 판넬에 추가

		this.add(txtResult, BorderLayout.NORTH); //텍스트 NORTH 위치
		this.add(pnlNumberPad, BorderLayout.CENTER); // 넘버패드판넬 CENTER 위치
		this.add(pnlControl, BorderLayout.EAST); // 컨트롤패드판넬 EAST 위치
		
		this.pack();
		this.setVisible(true);

	}

	/**
	 * 키패드 연산버튼을 만들어 판넬에 넣기
	 */
	private void putPanelMakeControl() {
		for (int i = 0; i < lblControls.length; i++ ) {
			btnControls[i] = new JButton(lblControls[i]);
			pnlControl.add(btnControls[i]);
			btnControls[i].addActionListener(this);
		}
	}

	/**
	 *  키패드 숫자버튼 만들어서 판넬에 넣기
	 */
	private void putPanelMakeKeyPad() {
		for (int i = 0; i < lblNUMBER.length; i++ ) {
			btnNumberPad[i] = new JButton(lblNUMBER[i]); 
			pnlNumberPad.add(btnNumberPad[i]);
			btnNumberPad[i].addActionListener(this);
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
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		String operator = e.getSource().toString();
		// = 버튼 눌려졌을경우 각 연산자 별 결과 값 출력
		if (actionCommand == "=") {
			switch(operator) { 
			case "+": // 연산자가 + 일떄
				if (actionCommand == "=" ) {
					txtResult.setText(actionCommand);	
				} 
				break;
			case "-":
				break;
			case "x":
				break;
			case "/":
				break;
			}			
			// clear 버튼 눌러졌을 경우
		} else if (actionCommand == "clear") {
			txtResult.setText("");	
		} else {
			txtResult.setText(txtResult.getText() + actionCommand);
		}
	}

	public static void main(String[] args) {
		CalcFrame keypad = new CalcFrame();
	}

}
