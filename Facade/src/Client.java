

public class Client {
	public static void main(String args[]) {
		/*
		EncryptFacade ef = new EncryptFacade();
		ef.fileEncrypt("src//designpatterns//facade//src.txt","src//designpatterns//facade//des.txt");
		*/
		//加入抽象外观类后.在更换具体外观类时只需修改配置文件，无需修改源代码，符合开闭原则
		AbstractEncryptFacade ef;
		ef = (AbstractEncryptFacade)XMLUtil.getBean();
		ef.fileEncrypt("src//designpatterns//facade//src.txt","src//designpatterns//facade//des.txt");

	}
}
