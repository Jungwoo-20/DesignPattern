package factory.pizzaFactory;

public class Chicago가게 extends PizzaStore {

    // Factory Method: 자신의 피자를 생성함:
    Pizza create(String 유형) {
        Pizza pizza = null;
        if (유형.equals("치즈피자")) pizza = new Chicago치즈피자();
        else if (유형.equals("야채피자")) pizza = new Chicago야채피자();
        //else if (유형.equals("감자피자")) return new NY감자피자();
        return pizza;
    }
}