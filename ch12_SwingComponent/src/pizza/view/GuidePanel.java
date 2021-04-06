package pizza.view;

import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class GuidePanel extends JPanel {
	
	public GuidePanel() {
		JLabel lblTopGuide = new JLabel("자바 피자 세상에 오신걸 환영합니다.");
		lblTopGuide.setAlignmentX(Component.CENTER_ALIGNMENT);
		this.add(lblTopGuide);
	}
}
