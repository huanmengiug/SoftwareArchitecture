package BusinessReport.Visitor.ConcreteVisitor;

import BusinessReport.Element.ConcreteElement.Engineer;
import BusinessReport.Element.ConcreteElement.Manager;
import BusinessReport.Visitor.Visitor;

public class CTOVisitor implements Visitor {
    @Override
    public String visit(Engineer engineer) {
        System.out.println("工程师: " + engineer.name + ", 代码行数: " + engineer.getCodeLines());
        return "工程师: " + engineer.name + ", 代码行数: " + engineer.getCodeLines();
    }

    @Override
    public String visit(Manager manager) {
        System.out.println("经理: " + manager.name + ", 产品数量: " + manager.getProducts());
        return "经理: " + manager.name + ", 产品数量: " + manager.getProducts();
    }
}