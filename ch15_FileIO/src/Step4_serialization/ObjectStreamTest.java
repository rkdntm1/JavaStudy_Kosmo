package Step4_serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class ObjectStreamTest {
	
	public static void main(String[] args) throws Exception {
		//try-with-resources(자동으로 닫혀짐)
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("object.dat")); ObjectInputStream in = new ObjectInputStream(new FileInputStream("object.dat"));) {
			out.writeObject(new Date()); // 현재 시간을 out에 write
			out.flush(); // outfile에 기록
			
			Date d = (Date) in.readObject(); // in에서 시간을 읽어옴
			System.out.println(d); //출력
			
		}		
	}
}
