package Plate;

import java.util.ArrayList;

public class Plate extends AbstractPlate {
    private ArrayList<AbstractPlate> Plate = new ArrayList<AbstractPlate>();
    private String name;

    public Plate(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractPlate plate) {
        Plate.add(plate);
        
    }

    @Override
    public void remove(AbstractPlate plate) {
        Plate.remove(plate);
        
    }

    @Override
    public AbstractPlate getChild(int i) {
        // TODO Auto-generated method stub
        return (AbstractPlate)Plate.get(i);
    }

    @Override
    public void show() {
        System.out.println(name);
        
    }

    @Override
    public void eat() {
        for(AbstractPlate aPlate:Plate){
            aPlate.eat();
        }
        
    }

}
