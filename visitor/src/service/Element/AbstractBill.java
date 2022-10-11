package service.Element;

 
//抽象单子类，一个高层次的单子抽象
public abstract class AbstractBill implements Bill{
	
	protected double amount;
	
	protected String item;

	protected String time;
	
	public AbstractBill(double amount, String item, String time) {
		super();
		this.amount = amount;
		this.item = item;
		this.time = time;
	}
	
	public double getAmount() {
		return amount;
	}
 
	public String getItem() {
		return item;
	}

	public String getTime() {
		return time;
	}
	
}