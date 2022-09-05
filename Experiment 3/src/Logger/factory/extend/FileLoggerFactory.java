package Logger.factory.extend;

import Logger.factory.LoggerFactory;
import Logger.product.Logger;
import Logger.product.impl.FileLogger;
//文件日志记录器工厂类
public class FileLoggerFactory extends LoggerFactory{

    @Override
    public Logger createLogger() {
        System.out.println("创建日志文件");
        Logger logger = new FileLogger();
        System.out.println("初始化日志文件");
        return logger;
    }

    @Override
    public Logger createLogger(String log) {
        System.out.println("创建日志文件"+log);
        Logger logger = new FileLogger();
        System.out.println("初始化日志文件");
        return logger;
    }

    @Override
    public Logger createLogger(Object obj) {
        System.out.println("创建日志文件");
        Logger logger = new FileLogger();
        System.out.println("初始化日志文件");
        return logger;
    }
    
}
