package xxxhaotian.test10;

public abstract class Component {
	private String name;
	public abstract void issue();
	public abstract void add(Component component);
	public abstract void remove(Component component);
	Component(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
