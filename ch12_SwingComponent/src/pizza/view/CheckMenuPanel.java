package pizza.view;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

import pizza.model.Menu;

public class CheckMenuPanel extends JPanel {
	public CheckMenuPanel(Menu menu) {
		this.setLayout(new GridLayout(0, 1));
		this.setBorder(BorderFactory.createTitledBorder(menu.getName()));
		
		for (String item : menu.getKinds()) {
			JCheckBox itemButton = new JCheckBox(item);
			this.add(itemButton);
		}
	}
}
