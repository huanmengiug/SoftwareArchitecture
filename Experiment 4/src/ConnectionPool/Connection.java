package ConnectionPool;

public class Connection {
    private String name;
    public Connection(String name) {
        this.name = name;
    }

    public void doQuery() {
        System.out.println(name + "开始连接");
    }
}
