package pizza.model;

public class Menu {
	private String name;
	private String[] kinds;
	
	
	public Menu(String name, String[] kinds) {
		this.name = name;
		this.kinds = kinds;
	}
	public String getName() {
		return name;
	}
	public String[] getKinds() {
		return kinds;
	}
	
}
