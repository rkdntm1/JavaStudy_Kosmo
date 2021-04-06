package trans;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ButtonActionListener implements ActionListener, MouseListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("beep");
		// 전환 버튼을 눌렀을 경우 -> txtEng 텍스트를 변경
		if (e.getSource() == Translate.btnTranslate) {
			Translate.txtEng.setText(""); // 빈칸으로 청소
			// txtKor로 부터 텍스트를받아 변역시키는 함수를 만들어 저장하자
			String trans = translate(Translate.txtKor.getText()); 
			Translate.txtEng.setText(trans);
		}
		// 취소 버튼을 눌렀을 경우 -> txtKor txtEng 텍스트값 초기화
		if (e.getSource() == Translate.btnCancel) {
			Translate.txtKor.setText("번역할 문장을 쓰시오");
			Translate.txtEng.setText("전환전");
		}
	}

	/**
	 * 텍스트를 받아서 번역하여 리턴해줌
	 * @param beforeTrans - txtKor의 텍스트
	 * @return 번역한 텍스트
	 */
	private String translate(String beforeTrans) {
		String afterTrans = beforeTrans;
		afterTrans = afterTrans.replace("하이", "hi");  // "하이" -> "hi"로 대체
		return afterTrans;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == Translate.txtKor) { // 쓰기 편하도록 txtKor 지역 클릭시 빈칸으로 설정해주기
			Translate.txtKor.setText("");
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}
}
