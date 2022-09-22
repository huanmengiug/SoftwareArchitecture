package Antivirus;

import java.util.ArrayList;

public class Folder extends AbstractFile {
    private ArrayList<AbstractFile> fileList = new ArrayList<AbstractFile>();
    private String name;

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {
        fileList.add(file);

    }

    @Override
    public void remove(AbstractFile file) {
        fileList.remove(file);

    }

    @Override
    public AbstractFile getChild(int i) {
        return (AbstractFile) fileList.get(i);
    }

    @Override
    public void killVlrus() {
        System.out.println("正在遍历 📂"+name);
        for (Object o : fileList){
            ((AbstractFile) o).killVlrus();
        }

    }

}
