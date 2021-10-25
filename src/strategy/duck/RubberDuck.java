package strategy.duck;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new QuackNoMouse();
    }

    @Override
    void display() {
        System.out.println("I'm a real Rubber duck");
        flyBehavior.fly();
        quackBehavior.quack();
    }
}
