public class Client {
    public static void main(String[] args) {
        // 1.创建目标
        Subject department1 = new Subject("信息");
        Subject department2 = new Subject("金融");

        // 2.创建观察者
        Observer observerStudent1 = new Student();
        observerStudent1.setObserverName("张三");
        Observer observerStudent2 = new Student();
        observerStudent2.setObserverName("谢弘");

        Observer observerTeacher1 = new Teacher();
        observerTeacher1.setObserverName("李刚");
        Observer observerTeacher2 = new Teacher();
        observerTeacher2.setObserverName("杨俊杰");

        // 3.注册观察者到观察者列表中
        department1.attch(observerStudent1);
        department1.attch(observerTeacher1);
        department2.attch(observerStudent2);
        department2.attch(observerTeacher2);

        // 4.在目标处显示本系名称
        department1.notifyObservers();
        department2.notifyObservers();

        // 4.在目标处修改本系名称
        department1.setDepartmentName("软件工程");
    }
}