package factory.bankUnique;

public class A지점 extends BankStore {

    Bank create(String 계좌유형) {
        Bank bank = null;
        if (계좌유형.equals("보통계좌A지점")) bank = new 보통계좌();
        else if (계좌유형.equals("마이너스계좌A지점")) bank = new 마이너스계좌();
        else if (계좌유형.equals("증권계좌A지점")) bank = new 증권계좌();
        return bank;
    }
}
