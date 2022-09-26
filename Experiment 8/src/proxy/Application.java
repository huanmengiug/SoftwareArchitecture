package proxy;

public class Application implements Subject {
    @Override
    public void run() throws Exception {
        System.out.println("Application is running!");
    }

}
