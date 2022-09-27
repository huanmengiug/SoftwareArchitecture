package proxy.reflect;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;
import java.lang.reflect.Constructor;

public class XMLUtil {
	// 该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象
	public static Object getBean() {
		try {
			// 创建DOM文档对象
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;
			doc = builder.parse(new File("src//proxy//reflect//config.xml"));

			// 获取包含类名的文本结点
			NodeList nl = doc.getElementsByTagName("className");
			Node classNode = nl.item(0).getFirstChild();
			String cName = classNode.getNodeValue();

			// 通过类名生成实例对象并将其返回
			Class<?> c = Class.forName(cName);
			Object obj = c.getDeclaredConstructor().newInstance();
			return obj;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public static Object getBean(Object object) {
		try {
			// 创建DOM文档对象
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;
			doc = builder.parse(new File("src//proxy//reflect//config.xml"));

			// 获取包含类名的文本结点
			NodeList nl = doc.getElementsByTagName("className");
			Node classNode = nl.item(1).getFirstChild();
			String cName = classNode.getNodeValue();

			// 通过类名生成实例对象并将其返回
			Class<?> cls = Class.forName(cName);
			Constructor<?> cons = cls.getConstructor(Object.class);
			Object obj = cons.newInstance(object);

			return obj;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
