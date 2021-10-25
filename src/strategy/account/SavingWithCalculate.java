package strategy.account;

public class SavingWithCalculate implements CalculateInterestBehavior {
    private static final int interest = 5;

    @Override
    public int calculateInterest() {
        return interest;
    }
}
