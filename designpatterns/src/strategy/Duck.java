package strategy;

import strategy.behaviors.FlyBehavior;
import strategy.behaviors.QuackBehavior;

public abstract class Duck {

    private final FlyBehavior flyBehavior;
    private final QuackBehavior quackBehavior;

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void quack() {
        quackBehavior.quack();
    }
    public void swim() {
        System.out.println("Swimming ...");
    }
    public void fly(){
        flyBehavior.fly();
    }

    public abstract void display();
}
