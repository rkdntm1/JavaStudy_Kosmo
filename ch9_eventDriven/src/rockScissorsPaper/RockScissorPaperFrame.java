package rockScissorsPaper;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RockScissorPaperFrame extends JFrame implements ActionListener {
	private JPanel pnlSelect = new JPanel(); 
	private JTextField txtOfTop = new JTextField("아래 버튼중 하나를 클릭하시오.");
	private JTextField  txtOfResult = new JTextField(20);
	private JButton rock = new JButton("ROCK");
	private JButton paper = new JButton("PAPER");
	private JButton scissor = new JButton("SCISSOR");
	
	RockScissorPaperFrame(){
		setTitle("가위, 바위, 보");
		setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pnlSelect.setLayout(new GridLayout(0, 3));
		putBtn(); // 버튼 만들어서 판넬에 넣기
		
		this.add(txtOfTop, BorderLayout.NORTH);
		this.add(pnlSelect, BorderLayout.CENTER);
		this.add(txtOfResult, BorderLayout.SOUTH);
		
		this.pack();
		this.setVisible(true);
	}
	
	/**
	 * 버튼 만들어 판넬에 넣기
	 */
	private void putBtn() {
		pnlSelect.add(rock);
		rock.addActionListener(this);
		pnlSelect.add(paper);
		paper.addActionListener(this);
		pnlSelect.add(scissor);
		scissor.addActionListener(this);
	}
	
	/**
	 * 각 버튼을 눌렀을때 3가지의 경우의 수를 랜덤으로 발생하도록 개발
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		String[] resultOfCom = {"사용자 승리", "비겼음", "컴퓨터 승리"}; 
		//주먹 냈을때
		if (e.getSource() == rock) {
			txtOfResult.setText(resultOfCom[(int)(Math.random() * 3)]);
			//보 냈을때
		} else if (e.getSource() == paper) {
			txtOfResult.setText(resultOfCom[(int)(Math.random() * 3)]);
			//가위 냈을때
		} else if (e.getSource() == scissor) {
			txtOfResult.setText(resultOfCom[(int)(Math.random() * 3)]);			
		}
	}
	
	public static void main(String[] args) {
		new RockScissorPaperFrame();
	}

	

}
