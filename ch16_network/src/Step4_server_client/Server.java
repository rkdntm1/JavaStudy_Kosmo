package Step4_server_client;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Server {
	/** 연결 전용 소켓 */
	public static final int PORT_REQUEST_ONLY = 8883;
	public static void main(String[] args) throws Exception {
		try(ServerSocket ss = new ServerSocket(PORT_REQUEST_ONLY);){
			while (true) {
				//Client 연결 요청에 따라 소켓을 만듦
				try(Socket socket = ss.accept();){				
				boolean autoFlush = true; // 양동이 다 채워질때 까지 기다리지 않고 즉시 비우기, 응답성능 향상
				PrintWriter response = new PrintWriter(socket.getOutputStream(), autoFlush);
				response.println(new Date().toString());
				// 요청한 ip 주소 확인
				System.out.println(socket.getInetAddress().toString());
				}
			}
		}
	}
}
