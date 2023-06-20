import strategy.Duck;
import strategy.RubberDuck;
import strategy.WoodenDuck;
import strategy.behaviors.NoFly;
import strategy.behaviors.Squeak;

public class Main {
    public static void main(String[] args) {

        Duck wooden = new WoodenDuck(new NoFly(), new Squeak());
        wooden.fly();
        wooden.quack();
        wooden.swim();
        wooden.display();

        Duck robber = new RubberDuck(new NoFly(), new Squeak());
        robber.fly();
        robber.quack();
        robber.swim();
        robber.display();
    }
}
