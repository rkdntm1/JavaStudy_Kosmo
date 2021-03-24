package tv;

public class Television {
	private int channel; // 채널
	private int volumn; // 볼륨
	private boolean onOff; // 켜짐상태

	// Default Constructor. 기본 생성자
	public Television() {
		channel = 1; // 파란색 -> 속성(atribute)
		volumn = 6;
		onOff = false;
	}

	// 우클릭 소스 -> generator get/set
	public int getChannel() { //get 가져옴 set 갑집어넣음
		return channel; 
	}

	@Override
	public String toString() {
		return "Television [channel=" + channel + ", volumn=" + volumn + ", onOff=" + onOff + "]";
	}

	public void setChannel(int channel) {
		this.channel = channel; //this : 나한테 있는 
	}

}
