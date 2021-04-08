package Step4_serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ObjectStreamTest3 implements Serializable {
	private Date birthDate;
	private String name;
	private boolean sex;
	private List<Book> books = new ArrayList<>();

	public ObjectStreamTest3(Date birthDate, String name, boolean sex) {
		this.birthDate = birthDate;
		this.name = name;
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "ObjectStreamTest3 [birthDate=" + birthDate + ", name=" + name + ", sex=" + sex + ", books=" + books
				+ "]";
	}

	private void addBook(Book book) {
		books.add(book);
	}

	public static void main(String[] args) throws Exception {

		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("object.dat"));
				ObjectInputStream in = new ObjectInputStream(new FileInputStream("object.dat"));) {
			ObjectStreamTest3 outerObj = new ObjectStreamTest3(new Date(), "홍", false);
			outerObj.addBook(new Book("사람이란", 100000));
			outerObj.addBook(new Book("헤어짐이란", 2222222));
			out.writeObject(outerObj);
			out.flush();

			ObjectStreamTest3 d = (ObjectStreamTest3) in.readObject();

			System.out.println(d);
		}
	}
}
