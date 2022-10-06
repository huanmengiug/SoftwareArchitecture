package BusinessReport;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;

import BusinessReport.ObjectStructure.BusinessReport;
import BusinessReport.Visitor.ConcreteVisitor.CEOVisitor;
import BusinessReport.Visitor.ConcreteVisitor.CTOVisitor;
import org.json.simple.JSONObject;

public class Client {
    public static String data(String Visitor) throws IOException {
        JSONObject json = new JSONObject();
        BusinessReport report = new BusinessReport();
        List<String> bss = report.showReport(new CTOVisitor());

        Iterator<String> iterator = bss.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            next = next.split(": ")[1];
            json.put("name",next.split(",")[0]);
        }
        StringWriter out = new StringWriter();
        json.writeJSONString(out);
        String data = out.toString();
        return data ;
    }

    public static void main(String[] args) {
        // 构建报表
        BusinessReport report = new BusinessReport();
        System.out.println("=========== CEO看报表 ===========");
        report.showReport(new CEOVisitor());
        System.out.println("=========== CTO看报表 ===========");
        report.showReport(new CTOVisitor());
    }
}