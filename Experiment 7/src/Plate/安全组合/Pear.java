package Plate.安全组合;

public class Pear extends AbstractPlate{
    private String name;

    public Pear() {
        this.name = "梨子";
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
