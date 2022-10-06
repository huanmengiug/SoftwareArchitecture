import java.util.ArrayList;
import java.util.List;

public class Subject {
    // 用来保存本系的观察者对象
    private List<Observer> observers = new ArrayList<Observer>();

    // 把老师或学生加入到本系中
    public void attch(Observer observer) {
        observers.add(observer);
    }

    // 删除本系的老师或学生
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    // 通知本系的所有人系名
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    // 获取本系的系名
    private String departmentName;

    public Subject(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
        // 将系名通知给所有的本系人员
        this.notifyObservers();
    }

}
