package strategy.duck;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    abstract void display();

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public void fly() {
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void quack() {
        quackBehavior.quack();
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}