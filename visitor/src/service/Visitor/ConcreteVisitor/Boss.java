package service.Visitor.ConcreteVisitor;


import service.Element.cBill;
import service.Element.ConcreteElement.ConsumeBill;
import service.Element.ConcreteElement.IncomeBill;
import service.Visitor.AbstractViewer;

//老板类，查看账本的类之一，作用于最低层次结构
public class Boss extends AbstractViewer {

    private double totalIncome;

    private double totalConsume;

    // 老板只关注一共花了多少钱以及一共收入多少钱，其余并不关心
    public cBill viewConsumeBill(ConsumeBill bill) {
        totalConsume += bill.getAmount();
		cBill cBill = new service.Element.cBill(bill.getItem(), bill.getAmount(), bill.getTime());
        return cBill;
    }

    public cBill viewIncomeBill(IncomeBill bill) {
        totalIncome += bill.getAmount();
		cBill cBill = new service.Element.cBill(bill.getItem(), bill.getAmount(), bill.getTime());
        return cBill;
    }

    public double getTotalIncome() {
        System.out.println("老板查看一共收入多少，数目是：" + totalIncome);
        return totalIncome;
    }

    public double getTotalConsume() {
        System.out.println("老板查看一共花费多少，数目是：" + totalConsume);
        return totalConsume;
    }

}