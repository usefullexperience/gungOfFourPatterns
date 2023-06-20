package strategy;


import strategy.behaviors.FlyBehavior;
import strategy.behaviors.QuackBehavior;

public class WoodenDuck extends Duck {

    public WoodenDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("This is the WoodenDuck");
    }
}
