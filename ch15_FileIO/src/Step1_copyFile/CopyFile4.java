package Step1_copyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile4 {
	private static final int EOF = -1;
	
	public static void main(String[] args) throws IOException {

		//try-with-resources(자동으로 닫혀짐)
		try (FileInputStream in = new FileInputStream("car.png");
				FileOutputStream out = new FileOutputStream("car2.png");)
		{
			int c;
			while ((c = in.read()) != EOF) {
				out.write(c);
			}
		}
	}
}
