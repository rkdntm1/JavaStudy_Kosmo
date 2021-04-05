package utill;

/**
 * 간단하게 개발하기 위해 동서남북으로만 가자.
 */
public enum Direction {
	//0 , 1 , 2 , 3
	east, west, south, north;

	public boolean is90Degree(Direction direction) {
		// east, west => 0, south, north => 1 그룹
		int myGroupId = this.ordinal() / 2;  //나의 그룹 넘버 
		int yourGroupId = direction.ordinal() / 2;
		return myGroupId != yourGroupId;
	}
}
