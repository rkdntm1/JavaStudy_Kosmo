package cloneable;

public class TestMain {

	public static void main(String[] args) {
		Arm la = new Arm(33);
		Arm lb = new Arm(33);
		Body b= new Body(100, la, lb);
		
		//복제양 돌리 만들기
		Body doly = b.clone();  
	}

}
