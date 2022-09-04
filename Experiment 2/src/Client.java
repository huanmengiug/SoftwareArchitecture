
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
public class Client {
    public static void main(String[] args) throws UnSupportedShapeException, InterruptedException, InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        
        String shapeType = getChartType();
        Shape shape = Factory.createShape(shapeType);
        shape.Paint(9);
        Thread.sleep(1500);
        shape.Erase();
    }

    //获取形状参数(shape)
    public static String getChartType() {
        try {
            String chartType = readXml();;
            return chartType;
        }catch(Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    //dom4j遍历XML
    public static String readXml() {
		SAXReader reader = new SAXReader(); 
        try { 
            Document read = reader.read("lib\\config.xml"); 
            // 获取根节点 
            Element root = read.getRootElement(); 
            // 通过elementIterator方法获取迭代器 
            Iterator Secon = root.elementIterator(); 
            // 遍历迭代器 
            while(Secon.hasNext()) { 
                //开始遍历次级节点
                Element b = (Element)Secon.next(); 
                // 获取每个次级节点的属性 
                // List<Attribute> SeconList = b.attributes(); 
                // for(Attribute a:SeconList) { 
                //     System.out.println(a.getName() + ":" + a.getValue()); 
                // } 
                // 获取每个次级节点下面的子节点 
                Iterator child = b.elementIterator(); 
                while(child.hasNext()) { 
                    Element c = (Element)child.next(); 
                    return c.getStringValue(); 
                } 
                //遍历完成一个次级节点
            } 
        } catch (DocumentException e) { 
            e.printStackTrace(); 
        }
        return null; 
	}
}
