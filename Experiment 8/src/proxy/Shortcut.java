package proxy;

public class Shortcut implements Subject{
	private Application application = new Application();
    @Override
	public void run() throws Exception{
        System.out.println("Picture is called");
        application.run();
	}
    
}
