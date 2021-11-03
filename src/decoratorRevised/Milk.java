package decoratorRevised;

public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDesc() {
        return beverage.getDesc() + ", Milk";
    }

    public double cost() {
        return beverage.cost() + 0.10;
    }
}