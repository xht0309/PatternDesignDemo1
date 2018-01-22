package xxxhaotian.test10;

public class Leaf extends Component{
	private String name;
	Leaf(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void issue() {
		// TODO Auto-generated method stub
		System.out.println(super.getName()+"收到公文");
	}

	@Override
	public void add(Component component) {
		// TODO Auto-generated method stub
		System.out.println("Error!!!");
		
	}

	@Override
	public void remove(Component component) {
		// TODO Auto-generated method stub
		System.out.println("Error!!!");
	}

}
