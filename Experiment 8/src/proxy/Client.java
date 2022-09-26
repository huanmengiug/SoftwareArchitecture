package proxy;

public class Client {
    public static void main(String[] args) throws Exception {
        Subject proxy = new Shortcut();
        proxy.run();
    }
}
