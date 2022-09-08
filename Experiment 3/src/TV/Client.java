package TV;

import TV.Units.XMLUtil;
import TV.factory.TVFactory;
import TV.product.TV;

public class Client {

    public static void main(String[] args) throws Exception {
        TVFactory factory;
        factory = (TVFactory) XMLUtil.getBean();
        TV product = factory.produceTV();
        product.show();
    }

}
