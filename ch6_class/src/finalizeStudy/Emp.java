package finalizeStudy;

public class Emp {

	private static int count = 0;
	
	

	public Emp() {
		count++;
	}

	@Override
	protected void finalize() throws Throwable {
		count--;
	}

	public static int getCount() {
		return count;
	}

	
	
}
