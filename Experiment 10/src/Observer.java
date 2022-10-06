public interface Observer {
    //更新的接口
	//传入目标对象，方便获取相应的目标状态的状态
	public void update(Subject subject);

	public void setObserverName(String observerName);

	public void setDepartmentName(String departmentName);
}
