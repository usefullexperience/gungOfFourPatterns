package strategy.otherducks;

import strategy.Duck;

public class WoodenDuck extends Duck {
    @Override
    public void fly() {
        System.out.println("WoodenDuck can't fly");
    }

    @Override
    public void quack() {
        System.out.println("Silent ...");
    }

    @Override
    public void display() {
        System.out.println("This is the WoodenDuck");
    }
}
