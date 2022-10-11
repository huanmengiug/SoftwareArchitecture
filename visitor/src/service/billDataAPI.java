package service;

import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;

import service.Element.ConcreteElement.ConsumeBill;
import service.Element.ConcreteElement.IncomeBill;
import service.ObjectStructure.AccountBook;
import service.Visitor.Viewer;

public class billDataAPI {

	public static String data(String viewer) {

		AccountBook accountBook = new AccountBook();
		// 添加两条收入
		accountBook.addBill(new IncomeBill(10000, "卖商品"));
		accountBook.addBill(new IncomeBill(12000, "卖广告位"));
		accountBook.addBill(new IncomeBill(10000, "1"));
		accountBook.addBill(new IncomeBill(12000, "2"));
		accountBook.addBill(new IncomeBill(10000, "3"));
		accountBook.addBill(new IncomeBill(12000, "4"));
		// 添加两条支出
		accountBook.addBill(new ConsumeBill(1000, "工资1"));
		accountBook.addBill(new ConsumeBill(1000, "工资2"));
		accountBook.addBill(new ConsumeBill(1000, "工资3"));
		accountBook.addBill(new ConsumeBill(1000, "工资4"));
		accountBook.addBill(new ConsumeBill(1000, "工资5"));
		accountBook.addBill(new ConsumeBill(1000, "工资6"));
		accountBook.addBill(new ConsumeBill(2000, "材料费"));

		Viewer viewe = (Viewer) XMLUtil.getBean(viewer);

		// 两个访问者分别访问账本
		Map<String, List<?>> map = accountBook.show(viewe);
		String mapJson = JSON.toJSONString(map);

		return mapJson;

	}

}
