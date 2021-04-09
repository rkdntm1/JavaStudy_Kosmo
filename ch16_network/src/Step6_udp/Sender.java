package Step6_udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Sender implements UDP_PORT {

	public static void main(String[] args) throws IOException {
		DatagramSocket socket = new DatagramSocket();
		String msg = "ㄴㄴ";
		InetAddress receiverIP = InetAddress.getByName("localhost");
		byte[] buf = msg.getBytes();		
		DatagramPacket sendMsgPacket = new DatagramPacket(buf, buf.length, receiverIP, PORT_NUM);
		socket.send(sendMsgPacket);
		socket.close();
	}
}
