package keypad;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KeypadFrame extends JFrame implements ActionListener {
	private static final String[] NUMBERPAD = { "1", "2","3","4","5", "6", "7", "8"};
	private JTextField txtResult = new JTextField(35);
	private JPanel pnlNumberPad = new JPanel(); 
	private JButton[] btnNumberPad = new JButton[NUMBERPAD.length]; 
	
	KeypadFrame(){
		this.setTitle("키패드");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		locateCenterWithHalfSize();
		putKeypadInPanel();	// 키패드 만들어 판넬에 넣기		
		
		pnlNumberPad.setLayout(new GridLayout(3, 3)); // 키패드 판넬 레이아웃 설정(3, 3)
		this.add(txtResult, BorderLayout.NORTH); //텍스트필드 NORTH 설정하여 Frame에 넣기
		this.add(pnlNumberPad, BorderLayout.CENTER); //키패드 판넬 CENTER 설정하여 Frame에 넣기
		
		//this.pack();
		this.setVisible(true);
	}

	/**
	 * 키패드 버튼을 만들어 판넬안에 넣기
	 */
	private void putKeypadInPanel() {		
		for (int i = 0; i < NUMBERPAD.length; i++) {
			btnNumberPad[i] = new JButton(NUMBERPAD[i]);
			btnNumberPad[i].addActionListener(this);
			pnlNumberPad.add(btnNumberPad[i]);
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
		txtResult.setText(txtResult.getText() + actionCommand);
	}
	
	public static void main(String[] args) {
		KeypadFrame keypad = new KeypadFrame();
	}	
}


