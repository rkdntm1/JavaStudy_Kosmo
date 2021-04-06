package pizza.view;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import pizza.model.Menu;

public class RadioMenuPanel extends JPanel {
	public RadioMenuPanel(Menu menu) {
		this.setLayout(new GridLayout(0, 1));
		this.setBorder(BorderFactory.createTitledBorder(menu.getName()));
		
		ButtonGroup itemGroup = new ButtonGroup();
		for (String item : menu.getKinds()) {
			JRadioButton itemButton = new JRadioButton(item);
			itemGroup.add(itemButton);
			this.add(itemButton);
		}
	}
}
