package xxxhaotian.test8;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Brand brand = new Airbus();
		Plane plane;
		plane = new CargoPlane();
		plane.setBrand(brand);
		plane.des();
	}

}
