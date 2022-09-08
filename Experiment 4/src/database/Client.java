package database;

import database.Factory.DatabaseFactory;
import database.Product.Connection.Connection;
import database.Product.Statement.Statement;
import database.Units.XMLUtil;

public class Client {
	public static void main(String args[]) {
        //使用抽象层定义
		DatabaseFactory databaseFactory = (DatabaseFactory)XMLUtil.getBean();;
		Connection conn;
		Statement stmt;

		conn = databaseFactory.createConnection();
		stmt = databaseFactory.createStatement();

		conn.connection();
		stmt.statement();
		
	}
}