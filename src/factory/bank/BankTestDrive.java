package factory.bank;


public class BankTestDrive {
    public static void main(String[] args) {
        Bank bank;
        BankStore store;

        store = new A();
        bank = store.order("보통계좌A");
        //bank.prepare();

        store = new B();
        bank = store.order("증권계좌B");

        store = new C();
        bank = store.order("마이너스계좌C");

    }
}
