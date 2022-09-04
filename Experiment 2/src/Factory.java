import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Factory {
    private static List<String> getAllShape() throws Exception {
        List<String> fileList = new ArrayList<String>();
		List<String> shapes = new ArrayList<String>();
		File baseFile = new File(System.getProperty("user.dir")+File.separator+"src");
		if(baseFile.exists()){//开发环境，读取源文件
			allImplement.getSubFileNameList(baseFile,fileList);
		}
        // 获取Shape的所有实现类（不包含抽象类,接口忽略）
        for(String name:fileList){
			if(allImplement.isChildClass(name, Shape.class))
			shapes.add(name.toLowerCase());
		}
        return shapes;

    }
    public static Shape createShape(String shapeName) throws UnSupportedShapeException {
        List<String> shapes = null;
        try {
            shapes = getAllShape();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Shape shape = null;

        if (shapeName.equalsIgnoreCase(shapes.get(0))) {
            shape = new Circle();
        }else if (shapeName.equalsIgnoreCase(shapes.get(1))) {
            shape = new Rectangle();
        }else if (shapeName.equalsIgnoreCase(shapes.get(2))) {
            shape = new Triangle();
        }else {
            throw new UnSupportedShapeException("未知图形！\n支持以下参数：\n"+shapes.toString());
        }
        return shape;
    }
    
}
