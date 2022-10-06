package BusinessReport.Visitor;

import BusinessReport.Element.ConcreteElement.Engineer;
import BusinessReport.Element.ConcreteElement.Manager;

public interface Visitor {

    // 访问工程师类型
    void visit(Engineer engineer);

    // 访问经理类型
    void visit(Manager manager);
}
