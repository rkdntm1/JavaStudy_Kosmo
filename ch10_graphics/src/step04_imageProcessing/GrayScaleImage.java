package step04_imageProcessing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GrayScaleImage extends JFrame {
	private BufferedImage image;

	public GrayScaleImage() {
		try {
			// 파일 입력 받기
			File input = new File("cannon.jpg"); // (전)이미지 파일 생성
			image = ImageIO.read(input); // 이미지 읽기
			int width = image.getWidth(); // 이미지 폭
			int height = image.getHeight(); // 이미지 높이

			// 반복문을 돌려 색상을 지정
			for (int r = 0; r < height; r++) {
				for (int c = 0; c < width; c++) {
					Color color = new Color(image.getRGB(r, c)); // 이미지의 색상
					int red = (int) color.getRed();
					int green = (int) color.getGreen();
					int blue = (int) color.getBlue();

					// 흑백이미지를 구하여 원본 이미지에 색 설정해주기
					int avg = (red + green + blue) / 3;
					Color newColor = new Color(avg, avg, avg);
					image.setRGB(r, c, newColor.getRGB());
				}
			}

			// 흑백 사진 출력
			File output = new File("output.png"); // (후)이미지 파일 생성
			ImageIO.write(image, "png", output); // image를 가지고 output에 이미지 쓰기
			add(new MyPanel());

			pack();
			setVisible(true);
		} catch (IOException e) {
			System.out.println("이미지 읽기 실패!");
		}
	}

	public static void main(String[] args) throws Exception {
		new GrayScaleImage();
	}

	class MyPanel extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			g.drawImage(image, 0, 0, null);
		}

		public Dimension getPreferredSize() {
			if (image == null) {
				
				// Dimension : Constructs a Dimension and initializesit to the specified width
				// and specified height.
				return new Dimension(100, 100);
			} else {
				return new Dimension(image.getWidth(null), image.getHeight(null));
			}
		}
	}
}
