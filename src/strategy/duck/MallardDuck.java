package strategy.duck;

public class MallardDuck extends Duck {

    // 생성자에서 자신의 (default) 행동 생성(설정)
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new QuackWithMouse();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
        flyBehavior.fly();
        quackBehavior.quack();
    }
}