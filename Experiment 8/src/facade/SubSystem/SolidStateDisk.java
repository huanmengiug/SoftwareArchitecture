package facade.SubSystem;

public class SolidStateDisk {
    public boolean read(int cf){
        boolean flag = false;
        try {
            System.out.println("Solid State Disk is read.....");
            cf = 5/cf;
            flag = !flag;
        } catch (Exception e) {
            System.out.println("Solid State Disk is Error!!!");
        }
        return flag;
    }
    public boolean off(int cf){
        boolean flag = false;
        try {
            System.out.println("Solid State Disk off.....");
            cf = 5/cf;
            flag = !flag;
        } catch (Exception e) {
            System.out.println("Solid State Disk is Error!!!");
        }
        return flag;
    }
}
