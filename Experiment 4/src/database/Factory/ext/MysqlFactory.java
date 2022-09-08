package database.Factory.ext;

import database.Factory.DatabaseFactory;
import database.Product.Connection.Connection;
import database.Product.Connection.impl.mysqlConnection;
import database.Product.Statement.Statement;
import database.Product.Statement.impl.mysqlStatement;

public class MysqlFactory extends DatabaseFactory {

    @Override
    public Connection createConnection() {
        return new mysqlConnection();
    }

    @Override
    public Statement createStatement() {
        return new mysqlStatement();
    }

}
