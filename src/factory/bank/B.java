package factory.bank;


public class B extends BankStore {

    Bank create(String 계좌유형) {
        Bank bank = null;
        if (계좌유형.equals("보통계좌B")) bank = new B보통계좌();
        else if (계좌유형.equals("마이너스계좌B")) bank = new B마이너스계좌();
        else if (계좌유형.equals("증권계좌B")) bank = new B증권계좌();
        return bank;
    }
}
