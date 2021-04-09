package Step6_udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receiver implements UDP_PORT {

	public static void main(String[] args) throws IOException {
		DatagramSocket socket = new DatagramSocket(PORT_NUM);		
		
		byte[] buf = new byte[1000];		
		DatagramPacket 편지 = new DatagramPacket(buf, buf.length);
		socket.receive(편지);
		System.out.println(new String(buf));
	}
}
