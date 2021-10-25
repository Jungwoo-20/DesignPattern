package strategy.account;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AccountTestDrive {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        String dateStr = simpleDateFormat.format(date);
        Account[] lists = {
                new Normal("홍길동", 38500),
                new Minus("강감찬", 150000, 1000),
                new Saving("광개토대왕", 250000, dateStr)
        };
        for (int i = 0; i < lists.length; i++) {
            Account account = lists[i];
            System.out.println("Name : " + account.getName());
            account.deposit(100);
            account.withdraw(100);
            account.calculateInterest();
            int interest = (int) (account.getBalance() * account.calculateInterest()/100);
            System.out.println("잔액 : " + account.getBalance());
            System.out.println("이자금액 : " + interest);
            System.out.println("====================================");
        }
    }
}
