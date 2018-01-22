package xxxhaotian.test2;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public class Test2 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, ParserConfigurationException, SAXException, IOException {
		// TODO Auto-generated method stub
		ImageReaderFactory irf;
		irf = (ImageReaderFactory)XMLUtil.getXmlUtil();
		ImageReader ir;
		ir = irf.createReader();
		ir.reader();

	}

}
