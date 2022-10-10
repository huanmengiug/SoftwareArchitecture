import Element.ConcreteElement.ConsumeBill;
import Element.ConcreteElement.IncomeBill;
import ObjectStructure.AccountBook;
import Visitor.Viewer;
import Visitor.ConcreteVisitor.Boss;
import Visitor.ConcreteVisitor.CFO;
import Visitor.ConcreteVisitor.CPA;

public class Client {
 
	public static void main(String[] args) {
		AccountBook accountBook = new AccountBook();
		//添加两条收入
		accountBook.addBill(new IncomeBill(10000, "卖商品"));
		accountBook.addBill(new IncomeBill(12000, "卖广告位"));
		//添加两条支出
		accountBook.addBill(new ConsumeBill(1000, "工资"));
		accountBook.addBill(new ConsumeBill(2000, "材料费"));
		
		Viewer boss = new Boss();
		Viewer cpa = new CPA();
		Viewer cfo = new CFO();
		
		//两个访问者分别访问账本
		System.out.println(accountBook.show(cpa));
		System.out.println(accountBook.show(cfo));
		System.out.println(accountBook.show(boss));
		
		
		((Boss) boss).getTotalConsume();
		((Boss) boss).getTotalIncome();
	}
}