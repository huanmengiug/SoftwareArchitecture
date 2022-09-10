package database.Factory;

import database.Product.Connection.Connection;
import database.Product.Statement.Statement;

public abstract class DatabaseFactory {
    public abstract Connection createConnection();

    public abstract Statement createStatement();
}
