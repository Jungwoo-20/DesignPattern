package strategy.account;

public class MinusWithCalculate implements CalculateInterestBehavior {
    private static final int interest = -7;

    @Override
    public int calculateInterest() {
        return interest;
    }
}
