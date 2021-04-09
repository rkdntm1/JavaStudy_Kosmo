package Step5_Translation.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import Step5_Translation.ConnRequestID;

public class TranslationServer implements ConnRequestID {

	private static class Translator extends Thread {
		private Socket connToClient;
		
		public Translator(Socket connToClient) {
			this.connToClient = connToClient;
		}

		@Override
		public void run() {
			try {
				InputStream is = connToClient.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				// 고객으로부터 요청된 단어를 받는 곳 
				BufferedReader requestFromClient = new BufferedReader(isr);
				
				OutputStream os = connToClient.getOutputStream();
				boolean autoFlush = true;
				// 고객에게 번역결과를 응답해주는 Writer 
				PrintWriter responseToClient = new PrintWriter(os, autoFlush);
				// 고객에게 인삿말 날리기				
				StringBuilder sb = new StringBuilder();
				sb.append("안녕하세요? 고객 IP 주소는 ");
				sb.append(connToClient.getInetAddress().toString());
				responseToClient.println(sb.toString());
				// 계속 기다리다가 번역할 단어가 들어오면 즉시 응답하고.. null이 들어오면 종료. 
				while (true) {
					//궁금증. 연결되었던 고객이 아무런 연락없이 꺼버렸을때 어떡하지?
					String foreignWord = requestFromClient.readLine();
					if (foreignWord == null) {
						break; // null이 들어오면 종료.
					}
					if (foreignWord.equals("java")) {
						responseToClient.println("java -> 자바");
					} else {
						responseToClient.println("java아니면 몰라요.");
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					connToClient.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				StringBuilder sb = new StringBuilder();
				sb.append("고객 IP 주소 ");
				sb.append(connToClient.getInetAddress().toString());
				sb.append("인 것을 처리종료");
				System.out.println(sb.toString());
			}
		}
	}
	
	public static void main(String[] args) {
		try {
			// 연결 요청 받아들이는 소켓
			ServerSocket receiveConnRequsetSocket = new ServerSocket(PORT_NUM);
			while (true) {
				// 궁금한거. 동시 접속자가 차고 넘칠떄는 어떡하지?
				// 특정 고객님과의 잡은 손
				Socket	connToClient = receiveConnRequsetSocket.accept();
				// 특정 고객님과의 대화를 관리해주는 쓰레드 처리
				Translator translator = new Translator(connToClient);
				translator.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
