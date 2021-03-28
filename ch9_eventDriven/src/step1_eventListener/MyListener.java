package step1_eventListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;

public class MyListener implements ActionListener, FocusListener {

	/**
	 * e : 사건에 대한 정보
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("눌렸군");
	}

	@Override
	public void focusGained(FocusEvent e) { // handler
		System.out.println(((JButton) e.getSource()).getLabel() + "들어왔군");
	}

	@Override
	public void focusLost(FocusEvent e) {
		System.out.println(((JButton) e.getSource()).getLabel() + "나갔꾼");		
	}

}
