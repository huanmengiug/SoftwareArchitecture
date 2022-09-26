package facade;

public class Client {
    public static void main(String[] args) {
        Mainframe gj19Mainframe = new Mainframe();
        System.out.println("电脑开机....");
        gj19Mainframe.on();
        System.out.println("电脑关闭....");
        gj19Mainframe.off();
    }
}
