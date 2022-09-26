package facade.SubSystem;

public class HardDisk {
    public boolean read(int cf){
        boolean flag = false;
        try {
            System.out.println("HardDisk is read.....");
            cf = 5/cf;
            flag = !flag;
        } catch (Exception e) {
            System.out.println("HardDisk is Error!!!");
        }
        return flag;
    }
    public boolean off(int cf){
        boolean flag = false;
        try {
            System.out.println("HardDisk off.....");
            cf = 5/cf;
            flag = !flag;
        } catch (Exception e) {
            System.out.println("HardDisk is Error!!!");
        }
        return flag;
    }
}
