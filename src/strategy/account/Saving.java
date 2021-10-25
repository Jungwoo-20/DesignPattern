package strategy.account;

public class Saving extends Account {
    private String date;

    public Saving(String name, int balance, String date) {
        super(name, balance);
        wb = new SavingWithDraw();
        cb = new SavingWithCalculate();
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
