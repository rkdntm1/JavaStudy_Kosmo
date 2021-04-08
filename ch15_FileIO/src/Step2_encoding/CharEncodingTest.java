package Step2_encoding;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class CharEncodingTest {

	public static void main(String[] args) throws Exception {
		File in = new File("input.txt");
		// Pipe Line  : 빨대를 연결  > 편리성, 성능
		InputStreamReader isr = new InputStreamReader(new FileInputStream(in), StandardCharsets.UTF_8);
		BufferedReader br = new BufferedReader(isr);
		
		String readMsg;
		while ((readMsg = br.readLine()) != null) {
			System.out.println(readMsg);
		}
		
	}

}
