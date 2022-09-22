package Plate.安全组合;

public class Banana extends AbstractPlate{
    private String name;

    public Banana() {
        this.name = "香蕉";
    }

    @Override
    public void show() {
        // TODO Auto-generated method stub

    }

    @Override
    public void eat(String s) {
        System.out.println(s+"吃掉"+name);

    }
    
}
