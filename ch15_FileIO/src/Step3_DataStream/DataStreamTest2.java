package Step3_DataStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest2 {

	public static void main(String[] args) throws IOException {
		
		try (DataInputStream in = new DataInputStream(new BufferedInputStream(
				new FileInputStream("data2.bin")));
				DataOutputStream out = new DataOutputStream(new BufferedOutputStream(
						new FileOutputStream("data2.bin")));) 
		{
			out.writeDouble(2.14);
			out.writeInt(1003);
			out.writeUTF("반갑습니다.");
			out.flush();
		
			System.out.println(in.readDouble());
			System.out.println(in.readInt());
			System.out.println(in.readUTF());
			
		} 
	}
}
