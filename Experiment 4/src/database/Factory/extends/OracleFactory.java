import database.Factory.DatabaseFactory;
import database.Product.Connection.Connection;
import database.Product.Statement.Statement;

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
