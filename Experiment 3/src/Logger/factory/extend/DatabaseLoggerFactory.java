package Logger.factory.extend;

import Logger.factory.LoggerFactory;
import Logger.product.Logger;
import Logger.product.impl.DatabaseLogger;

//数据库日志记录器工厂类
public class DatabaseLoggerFactory extends LoggerFactory {

    @Override
    public Logger createLogger() {
        System.out.println("使用默认方式连接数据库");
        Logger logger = new DatabaseLogger();
        System.out.println("初始化数据库日志记录器");
        return logger;
    }

    @Override
    public Logger createLogger(String log) {
        System.out.println("使用参数 " + log + " 作为连接字符串来连接数据库");
        Logger logger = new DatabaseLogger();
        System.out.println("初始化数据库日志记录器");
        return logger;
    }

    @Override
    public Logger createLogger(Object obj) {
        System.out.println("使用封装在参数obj中的连接字符串来连接数据库");
        Logger logger = new DatabaseLogger();
        System.out.println("使用封装在参数obj中的数据来初始化数据库日志记录器");
        return logger;
    }

}
