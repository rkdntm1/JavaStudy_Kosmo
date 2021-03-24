package tv;

public class TVTEST {

	public static void main(String[] args) {
		TeleVision tv = new TeleVision();
		System.out.println(tv.getChannel());
		tv.setChannel(44);
		System.out.println(tv);
		
	}

}
