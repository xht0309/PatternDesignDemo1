package xxxhaotian.test4;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import xxxhaotian.test4.XMLUtil;

public class Test4 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, ParserConfigurationException, SAXException, IOException {
		// TODO Auto-generated method stub
		DBFactory dbf;
		dbf = (DBFactory)XMLUtil.getXmlUtil();
		Connection c = dbf.createConn();
		Statement s = dbf.createState();
	}

}
