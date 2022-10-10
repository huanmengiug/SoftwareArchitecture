package Element.ConcreteElement;

import java.util.HashMap;
import java.util.Map;

import Element.AbstractBill;
import Visitor.AbstractViewer;
import Visitor.Viewer;

//收入单子
public class IncomeBill extends AbstractBill {

    public IncomeBill(double amount, String item) {
        super(amount, item);
    }

    @Override
    public Map<String,Map<String, ?>> accept(Viewer viewer) {
        Map<String,Map<String, ?>> mapper = new HashMap<>();
        if (viewer instanceof AbstractViewer) {
            Map<String, ?> map = ((AbstractViewer) viewer).viewIncomeBill(this);
            if (map == null) return null;
            mapper.put("in", map);
            return mapper;
        }

        Map<String, ?> map = viewer.viewAbstractBill(this);
        if (map == null) return null;
        mapper.put("in", map);
        return mapper;
    }
}