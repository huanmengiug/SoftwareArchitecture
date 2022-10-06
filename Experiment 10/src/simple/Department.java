package simple;

import java.util.Observable;

public class Department extends Observable {
    private String departmentName;

    public String getDepartmentName() {
        return departmentName;
    }

    public void changeDepartmentName(String departmentName){
        this.departmentName=departmentName;
        this.setChanged();
        this.notifyObservers(departmentName);
    }
}
