package root;

public class Singleton {
    private static Singleton instance = null;// 静态私有成员变量
    // 私有构造函数

    private Singleton() {
    }

    // 静态公有工厂方法，返回唯一实例
    public static Singleton getlnstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }

}
