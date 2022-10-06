public class Teacher implements Observer {
	private String name;
	// 本系的名称
	private String departmentName;

	@Override
	public void update(Subject subject) {
		departmentName = (subject).getDepartmentName();
		System.out.println("老师 " + name + "所在系的名称是： " + departmentName);
	}

	public String getObserverName() {
		return name;
	}

	@Override
	public void setObserverName(String observerName) {
		this.name = observerName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	@Override
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
}
