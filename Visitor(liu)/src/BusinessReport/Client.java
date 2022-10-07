package BusinessReport;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;

import BusinessReport.ObjectStructure.BusinessReport;
import BusinessReport.Visitor.ConcreteVisitor.CEOVisitor;
import BusinessReport.Visitor.ConcreteVisitor.CTOVisitor;

public class Client {
    public static String data(String Visitor) {
        Map<String, List<Map<String, String>>> map = new HashMap<String, List<Map<String, String>>>();
        BusinessReport report = new BusinessReport();
        List<String> bss ;
        if(Visitor.equals("CEO")){
            bss = report.showReport(new CEOVisitor());
            System.out.println(Visitor);
        }else{
            bss = report.showReport(new CTOVisitor());
        }
        

        Iterator<String> iterator = bss.iterator();
        while (iterator.hasNext()) {
            List<Map<String, String>> list = new ArrayList<>();
            Map<String, String> tmp = new HashMap<>();
            String next = iterator.next();
            String lei = next.split(": ", 2)[0];
            String name_kl = next.split(": ", 2)[1];
            String name = name_kl.split(",")[0];
            String vl = name_kl.split(", ")[1];
            String tager = name_kl.split(", ")[2];
            if (!map.containsKey(lei)) {
                tmp.put("tager", tager.split(": ")[1]);
                tmp.put("name", name);
                tmp.put(vl.split(": ")[0], vl.split(": ")[1]);
                list.add(tmp);
                map.put(lei, list);
            } else {

                list = map.get(lei);
                tmp.put("tager", tager.split(": ")[1]);
                tmp.put("name", name);
                tmp.put(vl.split(": ")[0], vl.split(": ")[1]);
                list.add(tmp);
            }
        }
        String mapJson = JSON.toJSONString(map);
        System.out.println(mapJson);

        return mapJson;
    }

    public static void main(String[] args) throws Exception {
        // 构建报表
        BusinessReport report = new BusinessReport();
        System.out.println("=========== CEO看报表 ===========");
        report.showReport(new CEOVisitor());
        System.out.println("=========== CTO看报表 ===========");
        report.showReport(new CTOVisitor());
        // data("11");
    }
}