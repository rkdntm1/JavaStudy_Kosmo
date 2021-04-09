package Step5_Translation.client;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Step5_Translation.ConnRequestID;

public class TranslationClient extends JFrame implements ConnRequestID {
	// 상단에 관심 단어 입력하는 곳
	private JTextField txtWord = new JTextField(10);
	// 인삿말과 번역 결과를 출력해 주는 곳
	private JTextArea txaTransResult = new JTextArea(10, 50);  
	// 서버로부터 응답 받는 버퍼드 리더 
	private BufferedReader responseFromServer;
	// 서버에게 번역을 요청할 단어를 보내는 빨대 
	private PrintWriter requestToServer;
	
	private TranslationClient() {
		setTitle("번역 요청기");
		setSize(500, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.add(txtWord, BorderLayout.NORTH);
		txtWord.addActionListener(e ->{
			//사용자가 번역을 요청하는 단어를 서버로 보낸다.
			requestToServer.println(txtWord.getText());
			try {
				String responseMsg = responseFromServer.readLine();
				txaTransResult.append(responseMsg + "\n \\"); // \n:줄바꿈 \\:\를 문자열에 추가 \t:탭(4칸)만큼 띄우기
			} catch (IOException e1) {
				// 서버가 갑자기 사전 통보도 없이 죽어버렸을때 어떡하지?
				e1.printStackTrace();
			}
		});
		// 특성은 편집(edit) 불가 
		txaTransResult.setEditable(false);
		this.add(txaTransResult, BorderLayout.CENTER);
		setVisible(true);
		
		connectToSever();
		
	}
	
	/**
	 * 번역 서버와 연결을 맺고 서버에서 오는 인삿말을 출력해주자
	 */
	private void connectToSever() {
		try {
			Socket connectedSocket = new Socket("121.171.209.247", PORT_NUM);
			InputStream is = connectedSocket.getInputStream();
			//문자로 받을거야
			InputStreamReader isr = new InputStreamReader(is);
			//버퍼링
			responseFromServer = new BufferedReader(isr);
			txaTransResult.append(responseFromServer.readLine() + "\n");
			
			OutputStream os = connectedSocket.getOutputStream();
			boolean autoFlush = true;
			requestToServer = new PrintWriter(os, autoFlush);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws Exception {
		new TranslationClient();
	}

}
