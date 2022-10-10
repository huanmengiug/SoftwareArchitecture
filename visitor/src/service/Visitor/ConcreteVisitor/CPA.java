package service.Visitor.ConcreteVisitor;


import java.util.HashMap;
import java.util.Map;

import service.Element.ConcreteElement.ConsumeBill;
import service.Element.ConcreteElement.IncomeBill;
import service.Visitor.AbstractViewer;

//注册会计师类，查看账本的类之一，作用于最低层次结构
public class CPA extends AbstractViewer {

    // 注会在看账本时，如果是支出，则如果支出是工资，则需要看应该交的税交了没
    public Map<String,String> viewConsumeBill(ConsumeBill bill) {
        if (bill.getItem().equals("工资")) {
            // System.out.println("注会查看账本时，如果单子的消费目的是发工资，则注会会查看有没有交个人所得税。");
            Map<String,String> map = new HashMap<>();
            map.put("工资", String.valueOf(bill.getAmount()));
            return map;
        }
        return null;
    }

    // 如果是收入，则所有的收入都要交税
    public Map<String,String>viewIncomeBill(IncomeBill bill) {
        // System.out.println("注会查看账本时，只要是收入，注会都要查看公司交税了没。");
        Map<String,String> map = new HashMap<>();
        map.put(bill.getItem(), String.valueOf(bill.getAmount()));
        return map;
    }

}