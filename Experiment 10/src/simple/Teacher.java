package simple;

import java.util.Observable;
import java.util.Observer;

public class Teacher implements Observer {
    public void update(Observable o,Object arg){
        Department department=(Department)o;
        System.out.println("老师修改系名为"+department.getDepartmentName());
    }
}
