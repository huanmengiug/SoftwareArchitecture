package Visitor;

import java.util.Map;

import Element.AbstractBill;
import Element.ConcreteElement.ConsumeBill;
import Element.ConcreteElement.IncomeBill;

//比Viewer接口低一个层次的访问者接口
public abstract class AbstractViewer implements Viewer {

	// 查看消费的单子
	public abstract Map<String,String> viewConsumeBill(ConsumeBill bill);

	// 查看收入的单子
	public abstract Map<String,String> viewIncomeBill(IncomeBill bill);

	public final Map<String,String> viewAbstractBill(AbstractBill bill) {
		return null;
	}
}