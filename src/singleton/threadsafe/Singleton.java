package singleton.threadsafe;

public class Singleton {
    private static Singleton uniqueInstance = null;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
            System.out.println("threadsafe Singleton getInstance()");
        }
        return uniqueInstance;
    }

}
