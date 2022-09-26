package facade.SubSystem;

public class OS {
    public boolean load(int cf){
        boolean flag = false;
        try {
            System.out.println("OS is loading.....");
            cf = 5/cf;
            flag = !flag;
        } catch (Exception e) {
            System.out.println("OS is Error!!!");
        }
        return flag;
    }
    public boolean off(int cf){
        boolean flag = false;
        try {
            System.out.println("OS off.....");
            cf = 5/cf;
            flag = !flag;
        } catch (Exception e) {
            System.out.println("OS is Error!!!");
        }
        return flag;
    }
}
