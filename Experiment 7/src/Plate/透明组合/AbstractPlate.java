package Plate.透明组合;

public abstract class AbstractPlate {
    // 增加成员
    public abstract void add(AbstractPlate plate);

    // 删除成员
    public abstract void remove(AbstractPlate plate);

    // 获取成员
    public abstract AbstractPlate getChild(int i);

    public abstract void show();

    // 业务方法
    public abstract void eat(String s);

}
