package Step6_Translator;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public Server() throws Exception {
		System.out.println("영어 번역 서비스 실행중...");
		int clientId = 0;
		ServerSocket socket = null;
		try {
			socket = new ServerSocket(9101);

			while (true) {
				clientId++;
				new Thread(new Translator(socket.accept(), clientId)).start();
			}
		} finally {
			socket.close();
		}
	}

	private static class Translator implements Runnable {
		private Socket accept;
		private int myId;

		public Translator(Socket accept, int myId) {
			this.accept = accept;
			this.myId = myId;
		}

		@Override
		public void run() {
			
		}
	}

	public static void main(String[] args) throws Exception {
		new Server();
	}
}
