package database.Factory.ext;

import database.Factory.DatabaseFactory;
import database.Product.Connection.Connection;
import database.Product.Connection.impl.oracleConnection;
import database.Product.Statement.Statement;
import database.Product.Statement.impl.oracleStatement;

public class OracleFactory extends DatabaseFactory {

    @Override
    public Connection createConnection() {
        return new oracleConnection();
    }

    @Override
    public Statement createStatement() {
        return new oracleStatement();
    }

}
