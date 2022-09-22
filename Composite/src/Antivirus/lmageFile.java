package Antivirus;

public class lmageFile extends AbstractFile{
    private String name;

    public lmageFile(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {
        System.out.println("无方法");
    }

    @Override
    public void remove(AbstractFile file) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public AbstractFile getChild(int i) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void killVlrus() {
        System.out.println("查杀图像文件 "+name);
        
    }

    @Override
    public void show() {
        System.out.println("图像文件 :"+name);
    }
    
}
