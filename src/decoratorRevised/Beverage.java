package decoratorRevised;

public abstract class Beverage {
    String description = "Unknown Beverage";
    public String getDesc() { return description; }
    public abstract double cost();
}