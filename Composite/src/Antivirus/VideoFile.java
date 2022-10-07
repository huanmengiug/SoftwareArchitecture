package Antivirus;

public class VideoFile extends AbstractFile{
    private String name;

    public VideoFile(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {
        // TODO Auto-generated method stub
        
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
        System.out.println("查杀视频文件 "+name);
        
    }

    @Override
    public void show() {
        System.out.println("视频文件 :"+name);
        
    }
    
}
