
public class FunctionButton {
	private Command command; // 维持一个抽象命令对象的引用

	// Ϊ为功能键注入命令
	public void setCommand(Command command) {
		this.command = command;
	}

	// 发送请求的方法
	public void click() {
		System.out.print("单击功能键: ");
		command.execute();
	}
}
