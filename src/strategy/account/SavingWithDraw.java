package strategy.account;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SavingWithDraw implements WithDrawBehavior {
    @Override
    public void withdraw(Account account, int money) {
        Date today = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        String dateStr = simpleDateFormat.format(today);
        if (((Saving) account).getDate().equals(dateStr)) {
            int tmp = account.getBalance() - money;
            System.out.println("출금 완료");
            account.setBalance(tmp);
            System.out.println("잔액 : " + (tmp));
            return;
        } else {
            System.out.println("출금 불가");
        }
    }
}
