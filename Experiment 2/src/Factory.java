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
    //首字母大写
    public static String upperCaseFirstLatter(String str){
		char[] strChar=str.toCharArray();
		strChar[0]-=32;
		return String.valueOf(strChar);
	}
    public static Shape createShape(String shapeName) throws UnSupportedShapeException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        List<String> shapes = null;
        try {
            shapes = getAllShape();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Shape shape = null;

        if (shapes.contains(shapeName)){
            String UpShapeName = upperCaseFirstLatter(shapeName);
            System.out.println(UpShapeName);

            try {
                shape = (Shape) Class.forName(UpShapeName).newInstance();
            } catch (NoClassDefFoundError e) {
                System.out.println("未找到 "+UpShapeName+" 类");
                e.printStackTrace();
            }

        }else{
            throw new UnSupportedShapeException("未知图形！\n支持以下参数：\n"+shapes.toString());
        }

        return shape;
    }
    
}
