package Plate.透明组合.Leaf;

import Plate.透明组合.Component.AbstractPlate;

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
    public void eat(String s) {
        System.out.println(s+"吃掉"+name);

    }
    
}
