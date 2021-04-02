package using_ObjectClass;

import java.util.HashSet;
import java.util.Set;

public class ChiledClass extends SClass {
	private String name;

	public static void main(String[] args) {
		Set<ChiledClass> mySet = new HashSet<>(); // <E> 에 담김 hash코드 값을 바탕으로 중복성판단

		ChiledClass c1 = new ChiledClass();
		ChiledClass c2 = new ChiledClass();
		ChiledClass c3 = new ChiledClass();
		  
		mySet.add(c1);
		mySet.add(c1);
		mySet.add(c1);
		mySet.add(c1);
		mySet.add(c1);
		mySet.add(c1);
		mySet.add(c2);
		mySet.add(c3);
		//클래스는 hashcode를 모두 상속 받고 있다. 
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());

		System.out.println(mySet.size());
		
	}

	
	
}
