package strategy;

import strategy.behaviors.FlyBehavior;
import strategy.behaviors.QuackBehavior;

public class MallardDuck extends Duck{

    public MallardDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("This is MallardDuck");
    }
}
