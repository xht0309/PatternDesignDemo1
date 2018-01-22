package xxxhaotian.test4;

public class OracleFactory implements DBFactory{

	@Override
	public Connection createConn() {
		// TODO Auto-generated method stub
		return new OracleConn();
	}

	@Override
	public Statement createState() {
		// TODO Auto-generated method stub
		return new OracleState();
	}

}
