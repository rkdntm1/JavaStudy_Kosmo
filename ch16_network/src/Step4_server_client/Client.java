package Step4_server_client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {

	public static void main(String[] args) throws Exception {
		// 연결 요청으로 만들어진 소켓(로컬호스트, 포트번호) 
		try(Socket socket = new Socket("192.168.0.23", 8888);){
			// 그 곳에 꼽은 빨때
			BufferedReader request = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//한 모금 마시기
			String res = request.readLine();
			System.out.println(res);
		} 
	}
}
