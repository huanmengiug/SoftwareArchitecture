import database.Factory.DatabaseFactory;
import database.Product.Connection.Connection;
import database.Product.Statement.Statement;

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
