
import java.util.*;

//实现创建迭代器对象的抽象工厂方法
public class ProductList extends AbstractObjectList {
	public ProductList(List<Object> products) {
		super(products);
	}

	public AbstractIterator createIterator() {
		return new ProductIterator(this);
	}
}
