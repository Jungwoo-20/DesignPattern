package singleton.threadsafe;

import singleton.threadsafe.Singleton;

public class SingletonClient {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

    }
}
