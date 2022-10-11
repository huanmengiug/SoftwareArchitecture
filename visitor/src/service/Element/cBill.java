package service.Element;

public class cBill {
    private String tag;
    private Double money;
    private String time;

    public cBill(String tag, Double money, String time) {
        this.tag = tag;
        this.money = money;
        this.time = time;
    }

    public String getTag() {
        return tag;
    }

    public Double getMoney() {
        return money;
    }

    public String getTime() {
        return time;
    }
}
