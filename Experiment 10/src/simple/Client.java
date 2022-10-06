package simple;

public class Client {
    public static void main(String args[]){
        Department department=new Department();
        Teacher teacher=new Teacher();
        Student student=new Student();
        department.addObserver(teacher);
        department.addObserver(student);
        department.changeDepartmentName("计算机系");
    }
}