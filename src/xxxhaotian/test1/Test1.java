package xxxhaotian.test1;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Role role1;
		Role role2;
		Role role3;
		role1 = RoleFactory.createRole("angel");
		role2 = RoleFactory.createRole("hero");
		role3 = RoleFactory.createRole("witch");
		role1.create();
		role2.create();
		role3.create();
	}

}
