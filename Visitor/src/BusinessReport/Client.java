package BusinessReport;

import BusinessReport.ObjectStructure.BusinessReport;
import BusinessReport.Visitor.ConcreteVisitor.CEOVisitor;
import BusinessReport.Visitor.ConcreteVisitor.CTOVisitor;

public class Client {

    public static void main(String[] args) {
        // 构建报表
        BusinessReport report = new BusinessReport();
        System.out.println("=========== CEO看报表 ===========");
        report.showReport(new CEOVisitor());
        System.out.println("=========== CTO看报表 ===========");
        report.showReport(new CTOVisitor());
    }
}