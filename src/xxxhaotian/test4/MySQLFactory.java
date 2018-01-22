package xxxhaotian.test4;

public class MySQLFactory implements DBFactory{

	@Override
	public Connection createConn() {
		// TODO Auto-generated method stub
		return new MySQLConn();
	}

	@Override
	public Statement createState() {
		// TODO Auto-generated method stub
		return new MySQLState();
	}

}
