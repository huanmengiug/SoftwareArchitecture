package service.Visitor;


import service.Element.AbstractBill;
import service.Element.cBill;
import service.Element.ConcreteElement.ConsumeBill;
import service.Element.ConcreteElement.IncomeBill;

//比Viewer接口低一个层次的访问者接口
public abstract class AbstractViewer implements Viewer {

	// 查看消费的单子
	public abstract cBill viewConsumeBill(ConsumeBill bill);

	// 查看收入的单子
	public abstract cBill viewIncomeBill(IncomeBill bill);

	public final cBill viewAbstractBill(AbstractBill bill) {
		return null;
	}
}