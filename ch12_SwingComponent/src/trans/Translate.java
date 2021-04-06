package trans;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Translate extends JFrame {
	private static final int WIDTH = 600, HEIGHT = 400;
	protected static JButton btnTranslate;
	protected static JButton btnCancel;
	protected static JTextArea txtEng;
	protected static JTextArea txtKor;
	
	
	
	public Translate() {
		ButtonActionListener listener = new ButtonActionListener();
		this.setTitle("텍스트 변환");
		this.setSize(WIDTH, HEIGHT);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Center 구성 - 변환 전 한글문장 / 변환 후 영어문장 
		JPanel pnlOfCenter = new JPanel(new FlowLayout(FlowLayout.CENTER, 30, 50));
		txtKor = new JTextArea("번역할 문장을 쓰시오", 14, 22);
		txtKor.addMouseListener(listener); // 영역 클릭시 빈칸으로 변경되도록 Listener를 넣어줌
		txtEng = new JTextArea("-번역전-", 14, 22);
		txtEng.setFocusable(false);
		pnlOfCenter.add(txtKor);
		pnlOfCenter.add(txtEng);
		this.add(pnlOfCenter, BorderLayout.CENTER);
		
		//South 구성 - 전환버튼 / 취소 버튼 버튼에 Listener 추가
		JPanel pnlOfButton = new JPanel(new FlowLayout(FlowLayout.CENTER, 30, 20));
		btnTranslate = new JButton("변환");
		btnTranslate.addActionListener(listener);  
		btnCancel = new JButton("취소");
		btnCancel.addActionListener(listener);
		pnlOfButton.add(btnTranslate);
		pnlOfButton.add(btnCancel);
		this.add(pnlOfButton, BorderLayout.SOUTH);
		
		this.pack();
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Translate();
	}


}
