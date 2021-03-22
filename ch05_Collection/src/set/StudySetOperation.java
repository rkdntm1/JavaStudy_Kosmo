package set;

import java.util.Set;
import java.util.TreeSet;

public class StudySetOperation {

	public static void main(String[] args) {
		Set<Character> s1 = new TreeSet<>();// < > ���� ������ü�����Ѵ�.
		Set<Character> s2 = new TreeSet<>();
		// s1
		s1.add('a');
		s1.add('b');
		s1.add('c');
		// s2
		s2.add('c');
		s2.add('d');
		s2.add('e');

		// ������(difference)
		s1.removeAll(s2);
		System.out.println(s1);

		// ������(intersect)
		// Call by Name, Call by Value, Call by Reference
		intersect(s1, s2);
		
		// ������(union)
		s1.addAll(s2); 
		System.out.println(s1);
		
		// �κ�����Ȯ��
		s1.add('a');		
		System.out.println(s1.containsAll(s2)); //
	}

	private static void intersect(Set<Character> s1, Set<Character> s2) {
		s1.retainAll(s2);
		System.out.println(s1);
	}

}
