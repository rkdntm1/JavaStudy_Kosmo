package study_while;

public class WelcomeLoop2 {

	public static void main(String[] args) {
		// 0,1,2,3,4,5,6,7,8,9, ->
		// 0,1,2,3,4,5,6,7,8,9
		step4();
	}

	private static void step2() { //�Լ� ����: �巡��-> ��Ŭ��-> refactor -> method ���� 
		int i = 0; 
		while (i < 10) { //�񱳸� �Ѵٴ� ���� �ð��� �䱸�Ѵٴ� ��
			if (i == 0b1001) { //���� ����
				System.out.print(i);
			} else {
				System.out.print(i + ",");
			}
			i++;
		}
	}
	
	private static void step3() { //�Լ� ����: �巡��-> ��Ŭ��-> refactor -> 
		int i = 0; 
		System.out.print(i++);
		while (i < 10) { 
			System.out.print("," + i);
			i++;
		}
	}
	
	private static void step4() { //�Լ� ����: �巡��-> ��Ŭ��-> refactor -> 
		int i = 0;
		boolean isFirst = true;
		while (i < 10) {
			if (isFirst) {
				isFirst = false;
				System.out.print(i);				
			} else {
				System.out.print("," + i);
			}			
			i++;
		}
	}


}
/*
 * 0000 0000
 * 0000 0001
 * 0000 0010
 * 0000 0011
 * ...
 * 0000 1001 
 */
    
