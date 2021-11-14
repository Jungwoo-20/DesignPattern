package factory.bank;

public abstract class Bank {
    String name;

    void prepare() {
        System.out.println("Preparing " + name);
    }

    void make() {
        System.out.println("Please submit your ID and documents and wait.");
    }

    void result() {
        System.out.println("It's been processed.");
    }
}