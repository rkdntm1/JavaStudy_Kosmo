package Step1_copyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile3 {
	public static void main(String[] args) throws IOException {

		//try-with-resources(자동으로 닫혀짐)
		try (FileInputStream in = new FileInputStream("input.txt");
				FileOutputStream out = new FileOutputStream("output.txt");)
		{
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		}
	}
}
