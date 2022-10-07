package BusinessReport.Visitor.ConcreteVisitor;

import BusinessReport.Element.ConcreteElement.Engineer;
import BusinessReport.Element.ConcreteElement.Manager;
import BusinessReport.Visitor.Visitor;

public class CTOVisitor implements Visitor {
    @Override
    public String visit(Engineer engineer) {
        // System.out.println("工程师: " + engineer.name + ", 代码行数: " + engineer.getCodeLines());
        return "工程师: " + engineer.name + ", value: " + engineer.getCodeLines() + ", tager: 代码行数";
    }

    @Override
    public String visit(Manager manager) {
        // System.out.println("经理: " + manager.name + ", 产品数量: " + manager.getProducts());
        return "经理: " + manager.name + ", value: " + manager.getProducts() + ", tager: 产品数量";
    }
}