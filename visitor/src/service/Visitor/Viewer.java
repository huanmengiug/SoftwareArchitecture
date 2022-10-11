package service.Visitor;


import service.Element.AbstractBill;
import service.Element.cBill;

//超级访问者接口（它支持定义高层操作）
public interface Viewer {

	cBill viewAbstractBill(AbstractBill bill);

}