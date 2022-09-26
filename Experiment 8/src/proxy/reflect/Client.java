package proxy.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import proxy.Application;
import proxy.Subject;

public class Client {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        // 设置变量可以保存动态代理类，默认名称以 $Proxy0 格式命名
        // System.getProperties().setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        // 1. 创建被代理的对象，UserService接口的实现类
        Application application = new Application();
        // 2. 获取对应的 ClassLoader
        ClassLoader classLoader = application.getClass().getClassLoader();
        // 3. 获取所有接口的Class
        Class<?>[] interfaces = application.getClass().getInterfaces();
        // 4. 创建一个将传给代理类的调用请求处理器，处理所有的代理对象上的方法调用
        // 这里创建的是一个自定义的日志处理器，须传入实际的执行对象
        InvocationHandler shortcut = new Shortcut(application);
        /*
         * 5.根据上面提供的信息，创建代理对象 在这个过程中，
         * a.JDK会通过根据传入的参数信息动态地在内存中创建和.class 文件等同的字节码
         * b.然后根据相应的字节码转换成对应的class，
         * c.然后调用newInstance()创建代理实例
         */
        Subject proxy = (Subject) Proxy.newProxyInstance(classLoader, interfaces, shortcut);
        // 调用代理的方法
        proxy.run();
    }
}
