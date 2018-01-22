package xxxhaotian.test9;

public class Member extends Component{
	private String name;
	Member(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	@Override
	public void shareInfo() {
		// TODO Auto-generated method stub
		System.out.println("分享信息给成员"+name);
	}

	@Override
	public void addMember(Component component) {
		// TODO Auto-generated method stub
		System.out.println("Error!!!");
		
	}

	@Override
	public void removeMember(Component component) {
		// TODO Auto-generated method stub
		System.out.println("Error!!!");
	}

}
