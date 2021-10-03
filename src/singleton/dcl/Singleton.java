package singleton.dcl;

public class Singleton {
	private static volatile Singleton uniqueInstance;
 
	private Singleton() {}
 
	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			synchronized (Singleton.class) {
				uniqueInstance = new Singleton();
				System.out.println("dcl Singleton getInstance()");

			}
		}

		return uniqueInstance;
	}
}
