package ConnectionPool;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ConnectionPool {
    private Integer connectionInitSize = 5;
    private static volatile ConnectionPool connectionPool;
    private List<Connection> connectionList = new ArrayList<>();

    private ConnectionPool(Integer connectionInitSize) {
        this.connectionInitSize = connectionInitSize;
        for (int i = 0; i < connectionInitSize; i++) {
            Connection connection = new Connection("连接" + i);
            connectionList.add(connection);
        }
    }
    
    private static ConnectionPool getInstance() {
        if (connectionPool == null) {
            synchronized (ConnectionPool.class) {
                if (connectionPool == null) {
                    connectionPool = new ConnectionPool(3);
                }
            }
        }
        return connectionPool;
    }

    public static Connection getConnection() {
        Integer nextInt = new Random().nextInt(getInstance().connectionInitSize);
        return getInstance().connectionList.get(nextInt);
    }
    
}
