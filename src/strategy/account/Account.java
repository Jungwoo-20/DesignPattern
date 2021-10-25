package strategy.account;

public abstract class Account {
    private String name;
    private int balance;
    public WithDrawBehavior wb;
    public CalculateInterestBehavior cb;

    public Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int deposit) {
        if (deposit <= 0) {
            System.out.println("입금 금액이 0원입니다.");
        } else {
            balance += deposit;
            setBalance(balance);
            System.out.println(deposit + "원 입금 완료.");
            System.out.println("잔액 : " + balance + "원 입니다.");
        }
    }

    public void withdraw(int money) {
        wb.withdraw(this, money);
    }

    public int calculateInterest() {
        return cb.calculateInterest();
    }
}
