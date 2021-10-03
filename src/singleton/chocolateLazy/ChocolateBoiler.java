package singleton.chocolateLazy;
 
public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;

	private static class Holder{
		private static final ChocolateBoiler uniqueInstance = new ChocolateBoiler();
	}
	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}
  
	public static ChocolateBoiler getInstance() {
		System.out.println("Chocolate Lazy Singleton getInstance()");
		return Holder.uniqueInstance;
	}

	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
			// fill the boiler with a milk/chocolate mixture
			System.out.println("fill function");
		}
	}
 
	public void drain() {
		if (!isEmpty() && isBoiled()) {
			// drain the boiled milk and chocolate
			empty = true;
			System.out.println("drain function");
		}
	}
 
	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			// bring the contents to a boil
			boiled = true;
			System.out.println("boil function");
		}
	}
  
	public boolean isEmpty() {
		return empty;
	}
 
	public boolean isBoiled() {
		return boiled;
	}
}
