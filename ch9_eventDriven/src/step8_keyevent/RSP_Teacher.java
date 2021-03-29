package step8_keyevent;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RSP_Teacher extends JFrame implements ActionListener {
	private JTextField txtOutput = new JTextField(20);
	
	private RSP_Teacher(){
		this.setTitle("가위바위보게임");
		this.setSize(300, 200); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(new JLabel("가위 바위 보 중 하나를 선택하시오"), BorderLayout.NORTH);
		JPanel pnlCenter = new JPanel();
		pnlCenter.setLayout(new GridLayout(0, RSP_Types_Teacher.values().length, 0, 2 ));
		this.add(pnlCenter, BorderLayout.CENTER);		
		// 버튼 만들어 패널에 넣기
		for (RSP_Types_Teacher val : RSP_Types_Teacher.values()) {
			JButton btn = new JButton(val.toString());
			btn.addActionListener(this);
			pnlCenter.add(btn); 
		}
		this.add(txtOutput, BorderLayout.SOUTH);
		txtOutput.addKeyListener(new MyKeyListener());
		
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new RSP_Teacher();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// 컴퓨터가 임의의 선택을 한다. 
		// 사용자의 선택과 비교하여 승부를 판단하고 이를 txtOutput에 출력한다.
		String userChoose = ((JButton) e.getSource()).getText();
		String whoWin = RSP_Types_Teacher.whoWin(userChoose);
		txtOutput.setText("사용자는 " + userChoose + " 이에 " + whoWin);
	}

}
