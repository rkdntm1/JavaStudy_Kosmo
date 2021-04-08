package Step4_serialization;

import java.io.Serializable;
import java.util.Date;

public class Book implements Serializable {
	private String name;
	private int price;
	
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + "]";
	}
	
}
