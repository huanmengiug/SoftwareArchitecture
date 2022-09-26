package proxy.reflect;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;
import java.lang.reflect.Method;

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
			Class<?> c = Class.forName(cName);
			Object obj = c.getDeclaredConstructor().newInstance();

			// 直接执行方法
			Class<?>[] m = new Class[1];
			m[0] = String.class;
			Method method = c.getDeclaredMethod("Subject", m);
			Object[] values = new Object[1];
			values[0] = object;
			method.invoke(obj, values);

			return obj;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
