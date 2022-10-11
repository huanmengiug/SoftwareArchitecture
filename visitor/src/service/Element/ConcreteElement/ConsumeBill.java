package service.Element.ConcreteElement;

import java.util.HashMap;
import java.util.Map;

import service.Element.AbstractBill;
import service.Element.cBill;
import service.Visitor.AbstractViewer;
import service.Visitor.Viewer;

//消费的单子
public class ConsumeBill extends AbstractBill {

    public ConsumeBill(double amount, String item, String time) {
        super(amount, item, time);
    }

    @Override
    public Map<String,cBill> accept(Viewer viewer) {
        Map<String,cBill> mapper = new HashMap<>();
        if (viewer instanceof AbstractViewer) {
            cBill cBill = ((AbstractViewer) viewer).viewConsumeBill(this);
            if (cBill == null) return null;
            mapper.put("out", cBill);
            return mapper;
        }
        cBill cBill = viewer.viewAbstractBill(this);
        if (cBill == null) return null;
        mapper.put("out", cBill);
        return mapper;
    }

}