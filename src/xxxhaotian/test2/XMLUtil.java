package xxxhaotian.test2;

import java.io.File;
import java.io.IOException;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;



public class XMLUtil {
	//创建DOM文档对象
	public static Object getXmlUtil() throws ParserConfigurationException, SAXException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		DocumentBuilderFactory dFactory=DocumentBuilderFactory.newInstance();
		DocumentBuilder builder=dFactory.newDocumentBuilder();
		Document doc;
		doc=builder.parse(new File("src/xxxhaotian/test2/config.xml"));
	//获取包含类名的文本结点
		NodeList nl=doc.getElementsByTagName("className");//放置类名的一对标签的名称为className
		Node classNode=nl.item(0).getFirstChild();
		String cName=classNode.getNodeValue();//得到类名
		
		//通过类名生成实例对象并将其返回
		//通过反射创建对象
		/*Java中有四中方法创建对象
		 * 1.new对象
		 * 2.反射机制
		 * 3.克隆（深&浅）
		 * 4.创建工厂*/
		Class c=Class.forName(cName);
		Object obj=c.newInstance();
		return obj;
	}
	
	
	
}
