package Logger;

import Logger.Units.XMLUtil;
import Logger.factory.LoggerFactory;

public class Client {
    public static void main(String[] args) throws Exception {
        LoggerFactory factory;
        factory = (LoggerFactory) XMLUtil.getBean();
        factory.writeLog("s");
    }
    
}
