package factory.bankUnique;

public abstract class BankStore {

    abstract Bank create(String 계좌유형);

    Bank order(String 계좌유형) {
        Bank bank = create(계좌유형);
        bank.prepare();
        bank.make();
        bank.result();
        System.out.println();
        return bank;
    }
}