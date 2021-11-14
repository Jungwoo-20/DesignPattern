package factory.bankUnique;


public class BankTestDrive {
    public static void main(String[] args) {
        Bank bank;
        BankStore store;

        store = new A지점();
        bank = store.order("보통계좌A지점");
        //bank.prepare();

        store = new B지점();
        bank = store.order("증권계좌B지점");

        store = new C지점();
        bank = store.order("마이너스계좌C지점");

    }
}
