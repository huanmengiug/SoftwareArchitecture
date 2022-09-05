package TV.factory.impl;

import TV.factory.TVFactory;
import TV.product.TV;
import TV.product.impl.HisenseTV;

public class HisenseFactory implements TVFactory{

    @Override
    public TV produceTV() {
        System.out.println("海信电视机工厂-->生产海信电视机");
        return new HisenseTV();
    }
    
}
