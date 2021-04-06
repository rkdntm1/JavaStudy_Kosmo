package tryWithResource;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class RescouceTry {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("첫 줄");
		list.add("2 줄");
		list.add("3 줄");
		try(PrintWriter pw = new PrintWriter("out.txt")){
			for (String val : list) {
				pw.println(val); // try 영역 벗어나면 pw 사용 못함
			}
		} catch (FileNotFoundException fnfe) {
			
		}
		
		
	}

}
