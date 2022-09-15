package BidirectionalAdapter;

public class ConcreteDogAdaptee implements Dog{

    @Override
    public void Barked() {
        System.out.println("汪汪叫");
    }
    
}
