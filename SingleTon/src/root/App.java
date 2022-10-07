package root;

public class App {
    public static void main(String args[]) {
        Singleton s1 = Singleton.getlnstance();
        Singleton s2 = Singleton.getlnstance();
        if (s1 == s2) {
            System.out.println("两个对象是相同实例");
        } else {
            System.out.println("两个对象是不同实例");
        }

    }
}
