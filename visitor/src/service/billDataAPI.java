package service;

import  java.util.Date;
import java.text.SimpleDateFormat;
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
		Date dNow = new Date();
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
		String time = ft.format(dNow);
		// 添加收入
		accountBook.addBill(new IncomeBill(10000, "卖商品",time));
		accountBook.addBill(new IncomeBill(12000, "卖广告位",time));
		accountBook.addBill(new IncomeBill(10000, "1",time));
		accountBook.addBill(new IncomeBill(12000, "2",time));
		accountBook.addBill(new IncomeBill(10000, "3",time));
		accountBook.addBill(new IncomeBill(12000, "4",time));
		// 添加支出
		accountBook.addBill(new ConsumeBill(1000, "工资1",time));
		accountBook.addBill(new ConsumeBill(1000, "工资2",time));
		accountBook.addBill(new ConsumeBill(1000, "工资3",time));
		accountBook.addBill(new ConsumeBill(1000, "工资4",time));
		accountBook.addBill(new ConsumeBill(1000, "工资5",time));
		accountBook.addBill(new ConsumeBill(1000, "工资6",time));
		accountBook.addBill(new ConsumeBill(2000, "材料费",time));

		Viewer viewe = (Viewer) XMLUtil.getBean(viewer);

		// 两个访问者分别访问账本
		Map<String, List<?>> map = accountBook.show(viewe);
		String mapJson = JSON.toJSONString(map);

		return mapJson;

	}

}
