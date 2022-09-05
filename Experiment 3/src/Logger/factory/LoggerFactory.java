package Logger.factory;

import Logger.product.Logger;

//日志记录器工厂
public interface LoggerFactory {
    public Logger createLogger();

    public Logger createLogger(String logId);

    public Logger createLogger(Object obj);
}
