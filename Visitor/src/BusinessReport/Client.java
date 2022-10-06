package BusinessReport;

import java.util.Iterator;
import java.util.List;

import BusinessReport.ObjectStructure.BusinessReport;
import BusinessReport.Visitor.ConcreteVisitor.CEOVisitor;
import BusinessReport.Visitor.ConcreteVisitor.CTOVisitor;

public class Client {
    public static String data(String Visitor) {
        String data = "{";
        BusinessReport report = new BusinessReport();
        List<String> bss = report.showReport(new CTOVisitor());

        Iterator<String> iterator = bss.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            data += next+',';
        }
        System.out.println(data);
        return data+= "}";
    }

    public static void main(String[] args) {
        // 构建报表
        BusinessReport report = new BusinessReport();
        System.out.println("=========== CEO看报表 ===========");
        report.showReport(new CEOVisitor());
        System.out.println("=========== CTO看报表 ===========");
        report.showReport(new CTOVisitor());
        data("1");
    }
}