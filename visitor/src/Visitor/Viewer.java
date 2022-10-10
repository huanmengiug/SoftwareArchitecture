package Visitor;

import java.util.Map;

import Element.AbstractBill;

//超级访问者接口（它支持定义高层操作）
public interface Viewer {

	Map<String,String> viewAbstractBill(AbstractBill bill);

}