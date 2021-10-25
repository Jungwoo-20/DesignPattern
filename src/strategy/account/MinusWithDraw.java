package strategy.account;

public class MinusWithDraw implements WithDrawBehavior {
    @Override
    public void withdraw(Account account, int money) {
        int tmp = account.getBalance() + ((Minus) account).getLineCredit();
        if (tmp >= 0) {
            tmp = account.getBalance() - money;
            System.out.println("출금 완료");
            System.out.println("잔액 : " + tmp);
            account.setBalance(tmp);
            return;
        } else {
            System.out.println("출금 불가");
        }

    }
}
