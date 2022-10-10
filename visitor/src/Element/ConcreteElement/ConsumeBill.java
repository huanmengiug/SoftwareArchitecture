package Element.ConcreteElement;

import java.util.HashMap;
import java.util.Map;

import Element.AbstractBill;
import Visitor.AbstractViewer;
import Visitor.Viewer;

//消费的单子
public class ConsumeBill extends AbstractBill {

    public ConsumeBill(double amount, String item) {
        super(amount, item);
    }

    @Override
    public Map<String,Map<String, ?>> accept(Viewer viewer) {
        Map<String,Map<String, ?>> mapper = new HashMap<>();
        if (viewer instanceof AbstractViewer) {
            Map<String, ?> map = ((AbstractViewer) viewer).viewConsumeBill(this);
            if (map == null) return null;
            mapper.put("out", map);
            return mapper;
        }
        Map<String, ?> map = viewer.viewAbstractBill(this);
        if (map == null) return null;
        mapper.put("out", map);
        return mapper;
    }

}