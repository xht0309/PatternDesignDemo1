package xxxhaotian.test9;

import java.util.ArrayList;

public class Group extends Component{
	ArrayList<Component> components = new ArrayList<Component>();
	@Override
	public void shareInfo() {
		// TODO Auto-generated method stub
		for(Component component:components) {
			component.shareInfo();
		}
	}
	
	public void addMember(Component component) {
		components.add(component);
	}
	
	public void removeMember(Component component) {
		components.remove(component);
	}

}
