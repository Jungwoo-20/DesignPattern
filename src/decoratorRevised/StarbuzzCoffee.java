package decoratorRevised;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage1 = new HouseBlend();
        System.out.println(beverage1.getDesc() + " $"+beverage1.cost());
        Beverage beverage2 = new HouseBlend();
        beverage2 = new Milk(beverage2);
        System.out.println(beverage2.getDesc() + " $"+beverage2.cost());
    }
}
