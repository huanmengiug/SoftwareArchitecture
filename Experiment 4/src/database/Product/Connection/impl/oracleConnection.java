package database.Product.Connection.impl;

import database.Product.Connection.Connection;

public class oracleConnection implements Connection {
    public void connection() {
        System.out.println("提供oracle连接对象");
    }
}
