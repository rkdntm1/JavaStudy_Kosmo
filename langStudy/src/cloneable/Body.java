package cloneable;

/** 사람의 몸 */
public class Body implements Cloneable {
	private int weight;
	
	private Arm leftArm, rightArm;

	public Body(int weight, Arm leftArm, Arm rightArm) {
		this.weight = weight;
		this.leftArm = leftArm;
		this.rightArm = rightArm;
	}

	@Override
	public Body clone() {
		//내가 가지고 있는 기본형 정보만 복사해 줌. (얕은 복사: Swallow copy)
		//내가 가지고 있는 참조형 정보까지 몽땅 복사해 줌. (깊은 복사:Deep copy)
		return new Body(weight, null, null); //Swallow copy
		//return new Body(weight, leftArm, rightArm); //Deep copy
	}
	
	
}
