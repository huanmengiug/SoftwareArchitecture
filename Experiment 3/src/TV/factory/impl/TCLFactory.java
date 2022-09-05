package TV.factory.impl;

import TV.factory.TVFactory;
import TV.product.TV;
import TV.product.impl.TCLTV;

public class TCLFactory implements TVFactory {

    @Override
    public TV produceTV() {
        System.out.println("TCL电视机工厂生产TCL电视机。");
        return new TCLTV();
    }

}
