package Element.ConcreteElement;

import Element.AbstractBill;
import Visitor.AbstractViewer;
import Visitor.Viewer;


//收入单子
public class IncomeBill extends AbstractBill {

    public IncomeBill(double amount, String item) {
        super(amount, item);
    }

    @Override
    public void accept(Viewer viewer) {
        if (viewer instanceof AbstractViewer) {
            ((AbstractViewer) viewer).viewIncomeBill(this);
            return;
        }
        viewer.viewAbstractBill(this);
    }
}