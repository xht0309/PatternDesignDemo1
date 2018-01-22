package xxxhaotian.test10;

public class Test10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Component beijing = new Composite("北京总部");
		Component edu = new Leaf("教务办公室");
		Component hunan = new Composite("湖南分校");
		Component admin = new Leaf("行政办公室");
		beijing.add(edu);
		beijing.add(hunan);
		beijing.add(admin);
		Component changsha = new Composite("长沙教学点");
		Component xiangtan = new Composite("湘潭教学点");
		hunan.add(edu);
		hunan.add(edu);
		hunan.add(changsha);
		hunan.add(xiangtan);
		changsha.add(edu);
		changsha.add(admin);
		xiangtan.add(edu);
		xiangtan.add(admin);
		beijing.issue();
		
	}
}
