package step8_keyevent;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyKeyListener implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("Typed " + e.getKeyChar() + " : " + e.getKeyCode());		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("Pressed " + e.getKeyChar() + " : " + e.getKeyCode());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("Released " + e.getKeyChar() + " : " + e.getKeyCode());
	}

}
