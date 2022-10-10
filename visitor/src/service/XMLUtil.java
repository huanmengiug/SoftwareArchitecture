package service;


public class XMLUtil {
	// 该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象
	public static Object getBean(String Viewer) {
		try {
			String cName = "service.Visitor.ConcreteVisitor."+Viewer;
	
			// 通过类名生成实例对象并将其返回
			Class<?> c = Class.forName(cName);
			Object obj = c.getDeclaredConstructor().newInstance();
			return obj;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}