package strategy.duck;

public class QuackWithMouse implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("꽥꽥");
    }
}
