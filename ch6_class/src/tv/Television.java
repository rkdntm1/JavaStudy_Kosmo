package tv;

public class TeleVision {
	private int channel;
	private int volumn;
	private boolean onOff;
	
	// 디폴트 생성자
	public TeleVision(){
		channel = 1;
		volumn = 6;
		onOff = false;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int ch) {
		this.channel = ch; // this : 나한테있는
	}

	@Override
	public String toString() {
		return "TeleVision [channel=" + channel + ", volumn=" + volumn + ", onOff=" + onOff + "]";
	}
	
	
}
