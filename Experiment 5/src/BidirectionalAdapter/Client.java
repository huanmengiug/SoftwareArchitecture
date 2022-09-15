package BidirectionalAdapter;

public class Client {
    public static void main(String[] args) throws Exception {
        //适配器
        Adapter adapter = new Adapter();
 
        //目标类通过适配器调用适配者方法
        Cat concreteTarget = new ConcreteCarTarget();
        adapter.setAdapter(concreteTarget);
        adapter.Barked();

        //目标类通过适配器调用目标类方法
        Dog concreteAdaptee = new ConcreteDogAdaptee();
        adapter.setAdapter(concreteAdaptee);
        adapter.Catch();
    }
    
}
