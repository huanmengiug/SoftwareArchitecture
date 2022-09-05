package Logger.factory;

import Logger.product.Logger;

//日志记录器工厂
public abstract class LoggerFactory {

    public void writeLog(){
        Logger log = this.createLogger();
        log.writeLog();
    }
    public void writeLog(String logId){
        Logger log = this.createLogger(logId);
        log.writeLog();
    }
    public void writeLog(Object obj){
        Logger log = this.createLogger(obj);
        log.writeLog();
    }
    public abstract Logger createLogger();

    public abstract Logger createLogger(String logId);

    public abstract Logger createLogger(Object obj);
}
