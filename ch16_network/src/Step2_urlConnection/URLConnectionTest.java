package Step2_urlConnection;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionTest {

	public static void main(String[] args) throws Exception{
		//url을 지정
		URL naverIP = new URL("https://www.google.com");
		//연결
		URLConnection naverCon = naverIP.openConnection();
		//url에 빨대를 뽑고 데이터로 가져와 버퍼링시킨다
		BufferedReader naverBuf = new BufferedReader(new InputStreamReader(naverCon.getInputStream())); 
		//null이 아니면 한줄씩 가져온다.
		String inLine;
		while ((inLine = naverBuf.readLine()) != null) {
			//출력	
			System.out.println(inLine);
		}
		
 
	}

}
