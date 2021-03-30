package step00_recursion;

import java.util.Stack;

public class Hanoi extends Stack<Integer> {
	private String name;
	
	Hanoi(String name) {
		this.name = name;
	} 
	
	
	@Override
	public String toString() {
		return "Hanoi [name=" + name + ", 접시들" + super.toString() + "]";
	}

	public static void main(String[] args) {
		Hanoi src = new Hanoi("src");
		Hanoi temp = new Hanoi("temp");
		Hanoi trg = new Hanoi("trg");
		
		for (int i = 5; i >= 1; i--)
			src.push(i);
		move(src, temp, trg, 5);
		System.out.println(src);
		System.out.println(temp);
		System.out.println(trg);
	}		
	
	private static void move(Hanoi src, Hanoi temp, Hanoi trg, int size) {
		
		//10개.> 9개짜리 타워를 temp에 옮기고 맨 밑의 한개를 trg으로 temp에 있던 9개를 trg으로 옮긴다.
		if (size == 1) {
			int plate = src.pop();
			trg.push(plate);
			System.out.println(src);
			System.out.println(temp);
			System.out.println(trg);
			System.out.println();
			return;
		}		
		move(src, trg, temp, size - 1); // n - 1 
		trg.push(src.pop()); // n
		move(temp, src, trg, size - 1);
		
	}

}
