package BidirectionalAdapter;

public class Adapter implements Cat, Dog{
    private Cat cat;
    private Dog dog;

    public void setAdapter(Cat catt){
        this.cat = catt;
    }

    public void setAdapter(Dog dogg){
        this.dog = dogg;
    }

    @Override
    public void Barked() {
        System.out.println("猫学狗汪汪叫");
        cat.Catch();
        
    }

    @Override
    public void Catch() {
        System.out.println("狗学猫抓老鼠");
        dog.Barked();
        
    }
    
}
