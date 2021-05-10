package singleton;

public class MySingle {
	private static MySingle theInstance = new MySingle();
	
	private MySingle() {
	}
	
	public static MySingle getInstance() {
		return theInstance;
	}
}
