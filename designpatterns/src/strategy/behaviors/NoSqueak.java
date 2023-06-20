package strategy.behaviors;

public class NoSqueak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Silent ...");
    }
}
