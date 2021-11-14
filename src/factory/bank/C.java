package factory.bank;


public class C extends BankStore {

    Bank create(String 계좌유형) {
        Bank bank = null;
        if (계좌유형.equals("보통계좌C")) bank = new C보통계좌();
        else if (계좌유형.equals("마이너스계좌C")) bank = new C마이너스계좌();
        else if (계좌유형.equals("증권계좌C")) bank = new C증권계좌();
        return bank;
    }
}
