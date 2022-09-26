package facade;

import facade.Facade.Mainframe;

public class Client {
    public static void main(String[] args) {
        Mainframe Mainframe = new Mainframe();
        System.out.println("电脑开机....");
        Mainframe.on();
        
        System.out.println("电脑关闭....");
        Mainframe.off();
    }
}
