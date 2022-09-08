package Logger.product.impl;

import Logger.product.Logger;

public class DatabaseLogger implements Logger {

    @Override
    public void writeLog() {
        // 数据库日志记录器
        System.out.println("写入数据库日志");

    }

}
