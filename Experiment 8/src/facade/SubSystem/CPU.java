package facade.SubSystem;

public class CPU {
    public boolean run(int cf){
        boolean flag = false;
        try {
            System.out.println("CPU is running.....");
            cf = 5/cf;
            flag = !flag;
        } catch (Exception e) {
            System.out.println("CPU is Error");
        }
        return flag;
    }
    public boolean off(int cf){
        boolean flag = false;
        try {
            System.out.println("CPU off.....");
            cf = 5/cf;
            flag = !flag;
        } catch (Exception e) {
            System.out.println("CPU is Error");
        }
        return flag;
    }
}
