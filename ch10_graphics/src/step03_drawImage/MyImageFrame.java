package step03_drawImage;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyImageFrame extends JFrame implements ActionListener {
	private int pieces = 4;
	private int totalPieces = pieces * pieces;
	private int[] pieceNumber;
	private BufferedImage img;
	
	public MyImageFrame() {
		setTitle("Image Draw Test");		
		try {
			img = ImageIO.read(new File("cannon.png"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		pieceNumber = new int[totalPieces]; // 8개의 방을 만들어줌
		for (int i = 0; i < totalPieces; i++) {
			pieceNumber[i] = i; // 0~7까지의 값을 각 방에 넣어줌
		}
		add(new Mypanel(), BorderLayout.CENTER); // 프레임 Center위치에 Panel추가 
		JButton button = new JButton("DIVIDE"); // 버튼 생성
		button.addActionListener(this); // 버튼에 ActionListener를 달아줌
		add(button, BorderLayout.SOUTH);
		setSize(img.getWidth(null), img.getHeight(null)); // 이미지의 크기에 맞춰 폭 너비 설정
		setVisible(true); 
	}
	
	public static void main(String[] args) {
		new MyImageFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		divide();		
		repaint();
	}

	private void divide() {
		Random rand = new Random();
		int ri;
		for (int i = 0; i < totalPieces; i++) {
			ri = rand.nextInt(totalPieces); // 조각수 만큼 랜덤값을 가져옴
			int tmp = pieceNumber[i]; // 조각의 value 값을 tmp에 저장
			pieceNumber[i] = pieceNumber[ri]; // 랜덤하게 value들을 섞어준다. 
			pieceNumber[ri] = tmp;			// 랜덤하게 value들을 섞어준다.(마무리)
		}
	}
	
	public class Mypanel extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			int pieceWidth = img.getWidth(null) / pieces; // 조각을 4등분
			int pieceHeight = img.getHeight(null) / pieces; // 조각을 4등분
			
			for (int x = 0; x < pieces; x++) {
				int sx = x * pieceWidth; // sx는 각 조각의 x좌표 값
				for (int y = 0; y < pieces; y++) {
					int sy = y * pieceHeight; // sy는 각 조각의 y좌표 값
					int number = pieceNumber[x * pieces + y]; // number에 16조각의 값들을 넣어준다. 
					int dx = (number / pieces) * pieceWidth;
					int dy = (number % pieces) * pieceHeight;
					
					g.drawImage(img, dx, dy, dx + pieceWidth, dy + pieceHeight, sx, sy, sx + pieceWidth, sy + pieceHeight, null);
				}
			}
		}
	}
}
