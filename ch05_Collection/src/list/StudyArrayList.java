package list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class StudyArrayList {

	public static void main(String[] args) {
		// 문자열 리스트 생성
		List<String> list = new LinkedList<>();
		list.add("Apple"); 
		list.add("Milk");
		list.add("Bread");
		
		list.add(1, "Corn");  // 1번 자리에 Corn 추가 -> A C M B
		list.set(0, "Grape"); // 0번 자리를 Grape로 변경 -> G C M B
		list.remove(list.size() - 1); //맨 마지막 자리를 제거 -> G C M
		
		for (String ele : list) { //리스트 출력하기
			System.out.println(ele);
		}
		System.out.println();
		
		// 앞에서부터 뒤로 탐색 - 애는 뒤로만 갈 수 있음 
		Iterator<String> iter = list.iterator(); 
		while (iter.hasNext()) {  
			String ele = iter.next();
			System.out.println(ele);
			//list.remove(ele); - ConcurentModificationException
		}
		System.out.println();
		
		// 뒤에서부터 앞으로 탐색 - 애는 앞으로도 갈 수 있고 뒤로도 갈 수 있음
		ListIterator<String> backiter = list.listIterator(list.size());
		while (backiter.hasPrevious()) { 
			String ele = backiter.previous();			
			System.out.println(ele);
		}
		System.out.println();
		
		// ConcurentModificationException . 반복을 돌면서 없앨 수 없음.
		for (String ele : list) {
			System.out.println(ele);
			//list.remove(ele); - ConcurentModificationException
		}
		System.out.println();
		
		//ConcurentModificationException를 발생 시키지 않으면서 반복 시 없애기
		Iterator<String> iter2 = list.iterator(); 
		while (iter2.hasNext()) { 
			String ele = iter2.next();
			System.out.println(ele);
			iter2.remove(); 
		}
		System.out.println();
		
		System.out.println("For로 출력");
		// ConcurentModificationException . 반복을 돌면서 없앨 수 없음.
		for (String ele : list) {
			System.out.println(ele);
			//list.remove(ele); - ConcurentModificationException
		}
		
		System.out.println("끝");

	}

}
