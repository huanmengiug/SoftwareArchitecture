package Plate.安全组合;

public class Apple extends AbstractPlate {
    private String name;

    public Apple() {
        this.name = "苹果";
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
