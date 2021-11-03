package decoratorRevised;

public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;
    public void Milk(Beverage beverage) {
        this.beverage = beverage;
    }
}