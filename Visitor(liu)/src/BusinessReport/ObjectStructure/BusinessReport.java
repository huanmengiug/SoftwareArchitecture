package BusinessReport.ObjectStructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import BusinessReport.Element.Staff;
import BusinessReport.Element.ConcreteElement.Engineer;
import BusinessReport.Element.ConcreteElement.Manager;
import BusinessReport.Visitor.Visitor;

// 员工业务报表类
public class BusinessReport {

    private List<Staff> mStaffs = new LinkedList<>();

    public BusinessReport() {
        mStaffs.add(new Manager("经理-A"));
        mStaffs.add(new Engineer("工程师-A"));
        mStaffs.add(new Engineer("工程师-B"));
        mStaffs.add(new Engineer("工程师-C"));
        mStaffs.add(new Manager("经理-B"));
        mStaffs.add(new Engineer("工程师-D"));
    }

    /**
     * 为访问者展示报表
     * @param visitor 公司高层，如CEO、CTO
     */
    public List<String> showReport(Visitor visitor) {
        List<String> staffList = new ArrayList<String>();
        for (Staff staff : mStaffs) {
            staffList.add(staff.accept(visitor));
        }
        return staffList;
    }
}