public class Student implements Observer {
	private String name;
	// 本系的名称
	private String departmentName;

	@Override
	public void update(Subject subject) {
		departmentName = subject.getDepartmentName();
		System.out.println("学生 " + name + "所在系的名称是： " + departmentName);
	}

	@Override
	public void setObserverName(String observerName) {
		this.name = observerName;
	}

	@Override
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

}
