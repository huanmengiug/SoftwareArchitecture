package Logger.product.impl;

import Logger.product.Logger;

public class FileLogger implements Logger{

    @Override
    public void writeLog() {
        // 文件日志记录器
        System.out.println("写入文件日志");
        
    }
    
}
