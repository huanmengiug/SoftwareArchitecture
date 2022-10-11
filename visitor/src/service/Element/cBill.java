package service.Element;

public class cBill {
    private String tag;
    private Double money;

    public cBill(String tag, Double money) {
        this.tag = tag;
        this.money = money;
    }
    public String getTag(){
        return tag;
    }
    public Double getMoney(){
        return money;
    }
}
