package xxxhaotian.test10;

import java.util.ArrayList;

public class Composite extends Component{
	Composite(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	ArrayList<Component> components = new ArrayList<Component>();
	@Override
	public void issue() {
		// TODO Auto-generated method stub
		System.out.println(super.getName()+"收到公文");
		for(Component component:components) {
			System.out.print(super.getName()+"的");
			component.issue();
		}
	}
	
	public void add(Component component) {
		components.add(component);
	}
	
	public void remove(Component component) {
		components.remove(component);
	}

}
