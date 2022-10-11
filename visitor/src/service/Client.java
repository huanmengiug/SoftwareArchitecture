package service;

import  java.util.Date;
import java.text.SimpleDateFormat;
import service.Element.ConcreteElement.ConsumeBill;
import service.Element.ConcreteElement.IncomeBill;
import service.ObjectStructure.AccountBook;
import service.Visitor.Viewer;
import service.Visitor.ConcreteVisitor.Boss;
import service.Visitor.ConcreteVisitor.CFO;
import service.Visitor.ConcreteVisitor.CPA;

public class Client {

	public static void main(String[] args) {
		AccountBook accountBook = new AccountBook();
		Date dNow = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String time = ft.format(dNow);

		// 添加收入
		accountBook.addBill(new IncomeBill(10000, "卖商品", time));
		accountBook.addBill(new IncomeBill(12000, "卖广告位", time));
		// 添加支出
		accountBook.addBill(new ConsumeBill(1000, "工资1", time));
		accountBook.addBill(new ConsumeBill(1000, "工资2", time));
		accountBook.addBill(new ConsumeBill(1000, "工资3", time));
		accountBook.addBill(new ConsumeBill(1000, "工资4", time));
		accountBook.addBill(new ConsumeBill(1000, "工资5", time));
		accountBook.addBill(new ConsumeBill(1000, "工资6", time));
		accountBook.addBill(new ConsumeBill(2000, "材料费", time));

		Viewer boss = new Boss();
		Viewer cpa = new CPA();
		Viewer cfo = new CFO();

		// 两个访问者分别访问账本
		System.out.println(accountBook.show(cpa));
		System.out.println(accountBook.show(cfo));
		System.out.println(accountBook.show(boss));

		((Boss) boss).getTotalConsume();
		((Boss) boss).getTotalIncome();
	}
}