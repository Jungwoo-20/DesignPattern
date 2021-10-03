package singleton.subclass;

public class SingletonTestDrive {
	public static void main(String[] args) {
		Singleton foo = CoolerSingleton.getInstance();
		Singleton bar = HotterSingleton.getInstance();
		System.out.println("foo print");
		System.out.println(foo);
		System.out.println("============");
		System.out.println("bar print");
		System.out.println(bar);
 	}
}
