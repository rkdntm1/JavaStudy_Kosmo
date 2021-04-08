package Step3_DataStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) throws IOException {
		DataInputStream in = null;
		DataOutputStream out = null;
		
		try {
			out = new DataOutputStream(new BufferedOutputStream(
					new FileOutputStream("data.bin")));
			out.writeDouble(3.14);
			out.writeInt(100);
			out.writeUTF("안녕하세요");
			out.flush();
		
			in = new DataInputStream(new BufferedInputStream(
					new FileInputStream("data.bin")));
			System.out.println(in.readDouble());
			System.out.println(in.readInt());
			System.out.println(in.readUTF());
			
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}

}
