package Step7_udp_chat;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Step6_udp.UDP_PORT;

public class Messanger2 implements PortNum {
	// 주고 받는 메시지를 출력해주는곳
	private JTextArea txaChatHistory = new JTextArea(10, 50);
	private InetAddress receiverIP;
	private DatagramSocket 우체통;

	private Messanger2() {
		MyFrame myFrame = new MyFrame();
		try {
			// My IP = 121.171.209.247
			receiverIP = InetAddress.getByName("localhost");
			우체통 = new DatagramSocket(PORT_NUM);
		} catch (UnknownHostException | SocketException e) {
			e.printStackTrace();
		}
	}

	private void receiveMessage() {
		while (true) {
			try {
				byte[] buf = new byte[256];
				DatagramPacket packet = new DatagramPacket(buf, buf.length);
				우체통.receive(packet); // 패킷을 받는다.
				// 받은 패킷을 텍스트 영역에 표시
				txaChatHistory.append("RECIEVED: " + new String(buf) + "\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	class MyFrame extends JFrame implements ActionListener {
		// 내가 보낼 말을 쓰는 곳
		private JTextField txtSendingMsg = new JTextField(10);

		private MyFrame() {
			setTitle("채팅");
			setSize(400, 500);
			setDefaultCloseOperation(EXIT_ON_CLOSE);

			txtSendingMsg.addActionListener(this);
			add(txtSendingMsg, BorderLayout.SOUTH);
			txaChatHistory.setEditable(false);
			add(txaChatHistory, BorderLayout.CENTER);

			setVisible(true);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			String justWrite = txtSendingMsg.getText(); // 니가 입력한거 꺼낼거야
			// 바이트 버퍼로 만들거야
			byte[] buf = justWrite.getBytes();
			// 데이타그램 패키지 만들거야
			DatagramPacket 편지 = new DatagramPacket(buf, buf.length, receiverIP, PORT_NUM);
			try {
				우체통.send(편지);
				txaChatHistory.append("Sent : " + justWrite + "\n");
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			txtSendingMsg.selectAll(); // 몽땅 선택
		}
	}

	public static void main(String[] args) {
		Messanger2 msg = new Messanger2();
		msg.receiveMessage();
	}
}
