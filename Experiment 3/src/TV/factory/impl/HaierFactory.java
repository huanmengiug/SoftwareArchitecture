package TV.factory.impl;

import TV.factory.TVFactory;
import TV.product.TV;
import TV.product.impl.HaierTV;

public class HaierFactory implements TVFactory {

    @Override
    public TV produceTV() {
        System.out.println("海尔电视机工厂生产海尔电视机。");
        return new HaierTV();
    }

}
