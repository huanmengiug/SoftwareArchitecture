package BusinessReport.Element.ConcreteElement;

import java.util.Random;

import BusinessReport.Element.Staff;
import BusinessReport.Visitor.Visitor;

// 工程师
public class Engineer extends Staff {

    public Engineer(String name) {
        super(name);
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }
    // 工程师一年的代码数量
    public int getCodeLines() {
        return new Random().nextInt(10 * 10000);
    }
}