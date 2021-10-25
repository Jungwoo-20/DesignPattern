package strategy.account;

public class Minus extends Account {
    private int limit;

    public Minus(String name, int balance, int limit) {
        super(name, balance);
        wb = new MinusWithDraw();
        cb = new MinusWithCalculate();
        this.limit = limit;
    }

    public int getLineCredit() {
        return limit;
    }
}
