package BusinessReport.Element.ConcreteElement;

import java.util.Random;

import BusinessReport.Element.Staff;
import BusinessReport.Visitor.Visitor;

// 经理
public class Manager extends Staff {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    // 一年做的产品数量
    public int getProducts() {
        return new Random().nextInt(10);
    }
}
