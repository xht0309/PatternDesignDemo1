package xxxhaotian.test1;

public class RoleFactory {
	public static Role createRole(String arg) {
		Role role = null;
		if(arg.equals("angel")) {
			role = new Angel();
		}
		else if(arg.equals("hero")) {
			role = new Hero();
		}
		else if(arg.equals("witch")) {
			role = new Witch();
		}
		else {
			System.out.println("error");
		}
		return role;
	}
}
