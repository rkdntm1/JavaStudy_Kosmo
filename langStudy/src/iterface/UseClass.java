package iterface;

import java.util.LinkedList;
import java.util.List;

import iterface.provider.B;

public class UseClass {

	public static void main(String[] args) {
		List<String> l = new LinkedList<>();
		//List<Integer> p = new LinkedList<>();
		// 가면
		l.add("A");
		
		iMyinterface a = new B();
		a.a();
	}

}
