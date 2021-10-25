package strategy.account;

public class NormalWithDraw implements WithDrawBehavior {
    @Override
    public void withdraw(Account account, int money) {
        int tmp = account.getBalance() - money;
        if (tmp >= 0) {
            account.setBalance(tmp);
            System.out.println("정상출금");
            System.out.println("잔액 : " + (tmp));
            return;
        } else {
            System.out.println("잔액보다 큰 금액을 입력하였습니다.");
        }

    }
}
