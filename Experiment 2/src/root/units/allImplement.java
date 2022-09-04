package root.units;
import java.io.File;
import java.lang.reflect.Modifier;
import java.util.List;
public class allImplement {

   
    /**
	 *  递归查找指定目录下的类文件的全路径
	 * @param baseFile 查找文件的入口
	 * @param fileList 保存已经查找到的文件集合
	 */
	public static  void getSubFileNameList(File baseFile, List<String> fileList){
		if(baseFile.isDirectory()){
			File[] files = baseFile.listFiles();
			for(File tmpFile : files){
				getSubFileNameList(tmpFile,fileList);
			}
		}
		String path = baseFile.getPath();
		if(path.endsWith(".java")){
			String name1 = path.substring(path.indexOf("src")+4, path.length());
			String name2 = name1.replaceAll("\\\\", ".");
			String name3 = name2.substring(0, name2.lastIndexOf(".java"));
			fileList.add(name3);
		}
	}


    /**
	 *  判断一个类是否继承某个父类或实现某个接口
	 */
	public static boolean isChildClass(String className,Class<?> parentClazz){
		if(className == null) return false;
		
		Class<?> clazz = null;
		try {
			clazz = Class.forName(className);
			if(Modifier.isAbstract(clazz.getModifiers())){//抽象类忽略
				return false;
			}
			if(Modifier.isInterface(clazz.getModifiers())){//接口忽略
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return parentClazz.isAssignableFrom(clazz);
		
	}


}
