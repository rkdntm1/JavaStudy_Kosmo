package exceptionInBusiness;

public class BizException extends Exception {
	// 내 통장. 잔고 500. 인출 500000000 ... => BizException("잔고가부족하여 인출이 불가능합니다.")
	
	private String msg;

	public BizException(String msg) {
		super();
		this.msg = msg;
	}
	
	public void print() {
		System.out.println(msg);
	}
	
	
}
