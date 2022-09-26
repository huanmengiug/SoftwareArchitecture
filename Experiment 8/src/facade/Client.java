package facade;

import facade.Facade.Mainframe;

public class Client {
    public static void main(String[] args) {
        Mainframe frame;
        System.out.println("电脑开机....");
        frame = Mainframe.getMainframe("on");
        
        System.out.println("电脑关闭....");
        frame = Mainframe.getMainframe("off");
    }
}
