package strategy.otherducks;

import strategy.Duck;

public class RubberDuck extends Duck {
    @Override
    public void fly() {
        System.out.println("RubberDuck can't fly");
    }

    @Override
    public void quack() {
        System.out.println("Squeak Squeak");
    }

    @Override
    public void display() {
        System.out.println("This is the RubberDuck");
    }
}
