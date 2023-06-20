package strategy;

import strategy.behaviors.FlyBehavior;
import strategy.behaviors.QuackBehavior;

public abstract class Duck {

    private  FlyBehavior flyBehavior;
    private  QuackBehavior quackBehavior;

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performQuack() {
        quackBehavior.quack();
    }
    public void swim() {
        System.out.println("Swimming ...");
    }
    public void performFlay(){
        flyBehavior.fly();
    }


    public abstract void display();
}
