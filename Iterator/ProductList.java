//designpatterns.iterator.ProductList.java
package designpatterns.iterator;
import java.util.*;

//实现创建迭代器对象的抽象工厂方法
public class ProductList extends AbstractObjectList {
	public ProductList(List<Object> products) {
		super(products);
	}
	
	//ʵ�ִ�������������ľ��幤������
	public AbstractIterator createIterator() {
		return new ProductIterator(this);
	}
} 
