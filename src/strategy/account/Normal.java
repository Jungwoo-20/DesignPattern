package strategy.account;

public class Normal extends Account {

    public Normal(String name, int balance) {
        super(name, balance);
        wb = new NormalWithDraw();
        cb = new NormalWithCalculate();
    }
}
