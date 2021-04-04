package cloneable;

/** 팔 */
public class Arm implements Cloneable {
	private int length;

	public Arm(int length) {
		this.length = length;
	}
	
	@Override
	public Arm clone() {
		//내가 가지고 있는 기본형 정보만 복사해 줌. (얕은 복사: Swallow copy)
		//내가 가지고 있는 참조형 정보까지 몽땅 복사해 줌. (깊은 복사:Deep copy)
		return new Arm(length);
	}
}
