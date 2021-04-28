package lamdaExp;

import java.util.ArrayList;
import java.util.List;

public class ListLooping {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		for (int i = 10; i > 3; i--) {
			l.add(i);
		}
		
		l.forEach(ioo->{System.out.println(" " + ioo);});
	}

}
