package proxy;

public class Shortcut extends Subject{
	private Application application = new Application();
    @Override
	public void run() throws Exception{
        System.out.println("Picture is called");
        application.run();
	}
    
}
