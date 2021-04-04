package comparable;

import java.util.Collection;
import java.util.TreeSet;

public class PrintBySort {

	public static void main(String[] args) {
		Collection<Person> l = new TreeSet<>();
		
		l.add(new Person(1, "홍"));
		l.add(new Person(3, "김"));
		l.add(new Person(2, "박"));
		
		for (Person i : l) {
			System.out.print(i + " ");
		}
	}

}
