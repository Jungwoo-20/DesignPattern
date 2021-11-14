package factory.pizzaFactory;

public class PizzaTestDrive {
    public static void main(String[] args) {
        Pizza pizza;
        PizzaStore store;
        store = new NY가게();
        pizza = store.order("치즈피자");
        pizza = store.order("야채피자");
        store = new Chicago가게();
        pizza = store.order("치즈피자");
        pizza = store.order("야채피자");
    }
}