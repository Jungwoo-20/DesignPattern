package strategy.account;

public class NormalWithCalculate implements CalculateInterestBehavior {
    public static final int interest = 3;

    public int calculateInterest() {
        return interest;
    }
}
