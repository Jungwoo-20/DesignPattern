package strategy.duck;

public class QuackNoMouse implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("꽥꽥 불가");
    }
}
