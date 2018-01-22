package xxxhaotian.test9;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Component member = new Member("Jack");
		Component member2 = new Member("Anna");
		Component member3 = new Member("Joe");
		Component group = new Group();
		group.addMember((Member)member2);
		group.addMember((Member)member3);
		member.shareInfo();
		System.out.println("分享信息给群组1");
		group.shareInfo();
		
		Component group2 = new Group();
		group2.addMember(group);
		group2.addMember(member);
		System.out.println("分享信息给群组2");
		group2.shareInfo();
	}

}
