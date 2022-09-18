package database.Product.Connection.impl;

import database.Product.Connection.Connection;


public class mysqlConnection implements Connection{
    public void connection() {
        System.out.println("提供MySql连接对象");
    }
}
