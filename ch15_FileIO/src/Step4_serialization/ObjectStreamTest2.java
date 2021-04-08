package Step4_serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class ObjectStreamTest2 implements Serializable {
	private Date birthDate;
	private String name;
	private boolean sex;

	
	public ObjectStreamTest2(Date birthDate, String name, boolean sex) {
		this.birthDate = birthDate;
		this.name = name;
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "ObjectStreamTest [birthDate=" + birthDate + ", name=" + name + ", sex=" + sex + "]";
	}

	public static void main(String[] args) throws Exception {

		try (ObjectOutputStream out = new ObjectOutputStream(
				new FileOutputStream("object.dat"));
				ObjectInputStream in = new ObjectInputStream(
						new FileInputStream("object.dat"));) 
		{
				out.writeObject(new ObjectStreamTest2(new Date(), "홍", false));
				out.flush();

				ObjectStreamTest2 d = (ObjectStreamTest2) in.readObject();
				
				System.out.println(d);
		} 
	}
}
