package step13_5_CarAdapter_v2;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class CarKeyListener extends KeyAdapter {
	private CarPanel carPanel;

	public CarKeyListener(CarPanel carPanel) {
		super();
		this.carPanel = carPanel;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int KeyCode = e.getKeyCode();
		carPanel.controlCar(KeyCode);

	}

}
