package Antivirus;

public abstract class AbstractFile {
    // 增加成员
    public abstract void add(AbstractFile file);

    // 删除成员
    public abstract void remove(AbstractFile file);

    // 获取成员
    public abstract AbstractFile getChild(int i);;

    // 业务方法
    public abstract void killVlrus();

}
