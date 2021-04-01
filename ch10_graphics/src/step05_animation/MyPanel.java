package step05_animation;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MyPanel extends JPanel implements ActionListener {
	private final int WIDTH = 500;   // 패널 너비
	private final int HEIGHT = 300;  // 패널 높이
	private final int START_X = 0;   // 초기 x좌표
	private final int START_Y = 250; // 초기 y좌표
	private BufferedImage image;
	private int x, y; // 그림의 현재위치 정보. 
	private Timer timer;

	public MyPanel() {
		setBackground(Color.black); // 붓에 검은 물감
		setPreferredSize(new Dimension(WIDTH, HEIGHT)); // 패널의 선호 사이즈 생성
		setDoubleBuffered(true); // 패널의 구성요소가 그리는데 버퍼역할을 하는가? . 버피-> 성능향상
		
		// 이미지 입력
		File input = new File("cannon.jpg");
		try {
			image = ImageIO.read(input);
		} catch (IOException e) {
			// 예외 발생시 처리
			e.printStackTrace();
		}
		x = START_X;
		y = START_Y;
		// 각 이벤트 사이를 20milisecond 딜레이를 주고 Callback 시킴 
		timer = new Timer(20, this);
		timer.start();
	}

	/**
	 * Timer에 의한 Callback에 반응(EventListener)하는 기능
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// x, y좌표 방향값 설정
		x += 2;
		y -= 0.5;
		// 안전범위 내(x좌표값이 WIDTH 범위)에 있으면 방향변경이 되도록 아니면 시작점으로 돌아가기. 
		if (x > WIDTH) {
			x = START_X;
			y = START_Y;
		}
		repaint();
	}	
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		//이미지 출력
		g.drawImage(image, x, y, this);
	}
}
