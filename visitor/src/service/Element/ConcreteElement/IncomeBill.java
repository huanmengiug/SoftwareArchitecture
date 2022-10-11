package service.Element.ConcreteElement;

import java.util.HashMap;
import java.util.Map;

import service.Element.AbstractBill;
import service.Element.cBill;
import service.Visitor.AbstractViewer;
import service.Visitor.Viewer;

//收入单子
public class IncomeBill extends AbstractBill {

    public IncomeBill(double amount, String item) {
        super(amount, item);
    }

    @Override
    public Map<String,cBill> accept(Viewer viewer) {
        Map<String,cBill> mapper = new HashMap<>();
        if (viewer instanceof AbstractViewer) {
            cBill cBill = ((AbstractViewer) viewer).viewIncomeBill(this);
            if (cBill == null) return null;
            mapper.put("in", cBill);
            return mapper;
        }

        cBill cBill = viewer.viewAbstractBill(this);
        if (cBill == null) return null;
        mapper.put("in", cBill);
        return mapper;
    }
}