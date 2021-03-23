package tv;

public class TVTest {

	public static void main(String[] args) {
		Television my = new Television();
		my.setChannel(8);
		System.out.println(my); //toString()는 자동 호출 됨!
		System.out.println(my.getChannel());
		
	}

}
