package facade.SubSystem;

public class Memory {
    public boolean check(int cf){
        boolean flag = false;
        try {
            System.out.println("Memory is checking.....");
            cf = 5/cf;
            flag = !flag;
        } catch (Exception e) {
            System.out.println("Memory is Error!!!");
        }
        return flag;
    }
    public boolean off(int cf){
        boolean flag = false;
        try {
            System.out.println("Memory off.....");
            cf = 5/cf;
            flag = !flag;
        } catch (Exception e) {
            System.out.println("Memory is Error!!!");
        }
        return flag;
    }
}
