package Plate.安全组合.Composite;

import java.util.ArrayList;

import Plate.安全组合.Component.AbstractPlate;

public class Plate extends AbstractPlate {
    private ArrayList<AbstractPlate> Plate = new ArrayList<AbstractPlate>();
    private String name;

    public Plate(String name) {
        this.name = name;
    }

   
    public void add(AbstractPlate plate) {
        Plate.add(plate);
        
    }

 
    public void remove(AbstractPlate plate) {
        Plate.remove(plate);
        
    }


    public AbstractPlate getChild(int i) {
        // TODO Auto-generated method stub
        return (AbstractPlate)Plate.get(i);
    }

    @Override
    public void show() {
        System.out.println(name);
        
    }

    @Override
    public void eat(String s) {
        System.out.println(s+name);
        for(AbstractPlate aPlate:Plate){
            // System.out.println("|");
            aPlate.eat("|"+s+"-");
        }
        
    }

}
