package BusinessReport.Visitor.ConcreteVisitor;

import BusinessReport.Element.ConcreteElement.Engineer;
import BusinessReport.Element.ConcreteElement.Manager;
import BusinessReport.Visitor.Visitor;

// CEO访问者
public class CEOVisitor implements Visitor {
    @Override
    public String visit(Engineer engineer) {
        System.out.println("工程师: " + engineer.name + ", KPI: " + engineer.kpi);
        return "工程师: " + engineer.name + ", KPI: " + engineer.kpi;
    }

    @Override
    public String visit(Manager manager) {
        System.out.println("经理: " + manager.name + ", KPI: " + manager.kpi +
                ", 新产品数量: " + manager.getProducts());
        return "经理: " + manager.name + ", KPI: " + manager.kpi +", 新产品数量: " + manager.getProducts();
    }
}
