package singleton.stat;

public class Singleton {
	private static final Singleton uniqueInstance = new Singleton();
 
	private Singleton() {}
 
	public static Singleton getInstance() {
		System.out.println("Stat Singleton getInstance()");
		return uniqueInstance;
	}
}
