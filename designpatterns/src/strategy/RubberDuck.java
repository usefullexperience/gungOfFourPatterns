package strategy;


import strategy.behaviors.FlyBehavior;
import strategy.behaviors.QuackBehavior;

public class RubberDuck extends Duck {
    public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("This is the RubberDuck");
    }
}
