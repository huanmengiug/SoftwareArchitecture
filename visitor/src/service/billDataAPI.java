package service;

import com.alibaba.fastjson.JSON;

import service.Element.ConcreteElement.ConsumeBill;
import service.Element.ConcreteElement.IncomeBill;
import service.ObjectStructure.AccountBook;
import service.Visitor.Viewer;
import service.Visitor.ConcreteVisitor.CFO;

public class billDataAPI {

	public static String data(String Viewer) {

		AccountBook accountBook = new AccountBook();
		// 添加两条收入
		accountBook.addBill(new IncomeBill(10000, "卖商品"));
		accountBook.addBill(new IncomeBill(12000, "卖广告位"));
		// 添加两条支出
		accountBook.addBill(new ConsumeBill(1000, "工资"));
		accountBook.addBill(new ConsumeBill(2000, "材料费"));

		Viewer viewer = new CFO();

		// 两个访问者分别访问账本

		String mapJson = JSON.toJSONString(accountBook.show(viewer));

		return mapJson;

	}

	public static void main(String[] args) {
		System.out.println(data("CFO"));
	}

}
