package Plate;

public class Banana extends AbstractPlate{
    private String name;

    public Banana() {
        this.name = "香蕉";
    }

    @Override
    public void add(AbstractPlate plate) {
        try {
            System.out.println("无操作");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void remove(AbstractPlate plate) {
        try {
            System.out.println("无操作");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public AbstractPlate getChild(int i) {
        try {
            System.out.println("无操作");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void show() {
        // TODO Auto-generated method stub

    }

    @Override
    public void eat() {
        System.out.println("吃掉"+name);

    }
    
}
