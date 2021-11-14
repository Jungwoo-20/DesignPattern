package factory.bankUnique;

public abstract class Bank {
    protected String name;

    public void prepare() {
        System.out.println("Preparing " + name);
    }

    public void make() {
        System.out.println("Please submit your ID and documents and wait.");
    }

    public void result() {
        System.out.println("It's been processed.");
    }
}