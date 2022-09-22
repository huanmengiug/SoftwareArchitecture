package Antivirus;

public class TextFile extends AbstractFile{
    private String name;

    public TextFile(String name) {
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
        System.out.println("查杀文本文件 "+name);
        
    }
    
}
