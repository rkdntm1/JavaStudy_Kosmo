package list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class StudyArrayList {

	public static void main(String[] args) {
		// ���ڿ� ����Ʈ ����
		List<String> list = new LinkedList<>();
		list.add("Apple"); 
		list.add("Milk");
		list.add("Bread");
		
		list.add(1, "Corn");  // 1�� �ڸ��� Corn �߰� -> A C M B
		list.set(0, "Grape"); // 0�� �ڸ��� Grape�� ���� -> G C M B
		list.remove(list.size() - 1); //�� ������ �ڸ��� ���� -> G C M
		
		for (String ele : list) { //����Ʈ ����ϱ�
			System.out.println(ele);
		}
		System.out.println();
		
		// �տ������� �ڷ� Ž�� - �ִ� �ڷθ� �� �� ���� 
		Iterator<String> iter = list.iterator(); 
		while (iter.hasNext()) {  
			String ele = iter.next();
			System.out.println(ele);
			//list.remove(ele); - ConcurentModificationException
		}
		System.out.println();
		
		// �ڿ������� ������ Ž�� - �ִ� �����ε� �� �� �ְ� �ڷε� �� �� ����
		ListIterator<String> backiter = list.listIterator(list.size());
		while (backiter.hasPrevious()) { 
			String ele = backiter.previous();			
			System.out.println(ele);
		}
		System.out.println();
		
		// ConcurentModificationException . �ݺ��� ���鼭 ���� �� ����.
		for (String ele : list) {
			System.out.println(ele);
			//list.remove(ele); - ConcurentModificationException
		}
		System.out.println();
		
		//ConcurentModificationException�� �߻� ��Ű�� �����鼭 �ݺ� �� ���ֱ�
		Iterator<String> iter2 = list.iterator(); 
		while (iter2.hasNext()) { 
			String ele = iter2.next();
			System.out.println(ele);
			iter2.remove(); 
		}
		System.out.println();
		
		System.out.println("For�� ���");
		// ConcurentModificationException . �ݺ��� ���鼭 ���� �� ����.
		for (String ele : list) {
			System.out.println(ele);
			//list.remove(ele); - ConcurentModificationException
		}
		
		System.out.println("��");

	}

}
