package step10_trafficLight;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel implements ActionListener {
	private static final int DIAMETER = 100;
	private static Map<Integer, Color> colorMap = new TreeMap<>(); 
	static { // Map으로 Color를 Integer와 결합시켜놓는다. 
		colorMap.put(0, Color.RED);
		colorMap.put(1, Color.YELLOW);
		colorMap.put(2, Color.GREEN);
	}
	
	private int light_number = 0;
	
	public MyPanel() {
		
		setLayout(new BorderLayout());
		JButton btnOfTraffic = new JButton("신호 변경");
		btnOfTraffic.addActionListener(this);
		add(btnOfTraffic, BorderLayout.SOUTH);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (++light_number >= 3) { // 0 1 2
			light_number = 0;
		}
			repaint();
		}
	

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLACK);//붓에 검정물감		
		g.drawOval(DIAMETER, DIAMETER, DIAMETER, DIAMETER); // 신호등 형태만들기
		g.drawOval(DIAMETER, DIAMETER * 2, DIAMETER, DIAMETER);
		g.drawOval(DIAMETER, DIAMETER * 3, DIAMETER, DIAMETER);
		
		g.setColor(colorMap.get(light_number)); // 버튼을 누를때마다 바뀌는 light_number를 이용 
		g.fillOval(DIAMETER, DIAMETER * (light_number + 1) , DIAMETER, DIAMETER);
	}
		
	
}

public class MyFrame extends JFrame {

	MyFrame() {
		this.setTitle("신호등");
		this.setSize(900, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(new MyPanel());
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new MyFrame();
	}

}
