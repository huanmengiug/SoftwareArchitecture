package Visitor;
import Element.AbstractBill;
import Element.ConcreteElement.ConsumeBill;
import Element.ConcreteElement.IncomeBill;

//比Viewer接口低一个层次的访问者接口
public abstract class AbstractViewer implements Viewer{
 
	//查看消费的单子
	public abstract void viewConsumeBill(ConsumeBill bill);
	
	//查看收入的单子
	public abstract void viewIncomeBill(IncomeBill bill);
	
	public final void viewAbstractBill(AbstractBill bill){}
}