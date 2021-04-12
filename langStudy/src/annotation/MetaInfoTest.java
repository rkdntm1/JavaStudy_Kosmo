package annotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Parameter;

public class MetaInfoTest {

	public static void main(String[] args) {
		Person 홍길동 = new Person("홍길동", 1500);
		
		System.out.println(홍길동.getClass().getName());
		for (Field field : 홍길동.getClass().getFields()) {
			System.out.println(field.getName());
			if (field.getName().equals("name")) {
				try {
					field.set(홍길동, "이순신");
					System.out.println("홍길동 객체에 name 속성값은 " + (String) field.get(홍길동) + "입니다.");										
				} catch (IllegalArgumentException | IllegalAccessException e) {
					e.printStackTrace();
				}
			}
		}
		for (Constructor constructor : 홍길동.getClass().getConstructors()) {
			System.out.println(constructor.getName());
			for (Parameter parameter : constructor.getParameters()) {
				System.out.println(parameter.getName());
				System.out.println(parameter.getType().getName());
			}
		}
	}

}
