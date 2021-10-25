package strategy.duck;

public class CommonDuck extends Duck {
    public CommonDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new QuackWithMouse();
    }

    @Override
    void display() {
        System.out.println("I'm a real Common duck");
        flyBehavior.fly();
        quackBehavior.quack();
    }
}
