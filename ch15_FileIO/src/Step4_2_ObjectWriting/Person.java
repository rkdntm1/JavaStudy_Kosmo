package Step4_2_ObjectWriting;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Person {
	private String name;
	private boolean sex;
	
	private List<Book> books = new ArrayList<>();
	
	public Person(String name, boolean sex) {
		this.name = name;
		this.sex = sex;
	}
	
	private void add(Book book) {
		books.add(book);
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", sex=" + sex + ", books=" + books + "]";
	}

	public static void main(String[] args) {
		Person 홍길동 = new Person("홍길동", false);
		홍길동.add(new Book("홍길동전", 1000));
		홍길동.add(new Book("허생전", 2000));
		
		Gson gson = new GsonBuilder().create();
		String serializedPerson = gson.toJson(홍길동);
		System.out.println(serializedPerson);
	}
}
