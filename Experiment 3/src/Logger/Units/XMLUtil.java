//designpatterns.factorymethod.XMLUtil.java
package Logger.Units;

import javax.xml.parsers.*;
import org.w3c.dom.*;

import Logger.factory.LoggerFactory;

import java.io.File;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

public class XMLUtil {

	// public static void main(String[] args) throws Exception {
    //     getAllShape();
    // }
	// 该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象
	public static Object getBean() {
		try {
			// 创建DOM文档对象
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;
			doc = builder.parse(new File("src//Logger//config.xml"));

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

	// 获取子类
	private static List<String> getAllShape() throws Exception {
		List<String> fileList = new ArrayList<String>();
		List<String> shapes = new ArrayList<String>();
		File baseFile = new File(System.getProperty("user.dir") + File.separator + "src");
		if (baseFile.exists()) {// 开发环境，读取源文件
			getSubFileNameList(baseFile, fileList);
		}
		// 获取Shape的所有实现类（不包含抽象类,接口忽略）
		for (String name : fileList) {
			if (isChildClass(name, LoggerFactory.class)) {
				System.out.println(name);
			}
		}
		return shapes;
	}

	/**
	 * 递归查找指定目录下的类文件的全路径
	 * 
	 * @param baseFile
	 *            查找文件的入口
	 * @param fileList
	 *            保存已经查找到的文件集合
	 */
	public static void getSubFileNameList(File baseFile, List<String> fileList) {
		if (baseFile.isDirectory()) {
			File[] files = baseFile.listFiles();
			for (File tmpFile : files) {
				getSubFileNameList(tmpFile, fileList);
			}
		}
		String path = baseFile.getPath();
		if (path.endsWith(".java")) {
			String name1 = path.substring(path.indexOf("src") + 4, path.length());
			String name2 = name1.replaceAll("\\\\", ".");
			String name3 = name2.substring(0, name2.lastIndexOf(".java"));
			fileList.add(name3);
		}
	}

	/**
	 * 判断一个类是否继承某个父类或实现某个接口
	 */
	public static boolean isChildClass(String className, Class<?> parentClazz) {
		if (className == null)
			return false;

		Class<?> clazz = null;
		try {
			clazz = Class.forName(className);
			if (Modifier.isAbstract(clazz.getModifiers())) {// 抽象类忽略
				return false;
			}
			if (Modifier.isInterface(clazz.getModifiers())) {// 接口忽略
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return parentClazz.isAssignableFrom(clazz);
	}

}