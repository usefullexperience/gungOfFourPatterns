import strategy.Duck;
import strategy.RubberDuck;
import strategy.WoodenDuck;
import strategy.behaviors.Fly;
import strategy.behaviors.NoFly;
import strategy.behaviors.NoSqueak;
import strategy.behaviors.Squeak;

public class Main {
    public static void main(String[] args) {

        Duck wooden = new WoodenDuck(new NoFly(), new Squeak());
        wooden.performFlay();
        wooden.performQuack();
        wooden.swim();
        wooden.display();

        Duck robber = new RubberDuck(new NoFly(), new Squeak());
        robber.performFlay();
        robber.performQuack();
        robber.swim();
        robber.display();

        Duck wooden2 = new WoodenDuck(new NoFly(), new NoSqueak());
        wooden2.performQuack();
        wooden2.performFlay();
        wooden2.setFlyBehavior(new Fly());
        wooden2.setQuackBehavior(new Squeak());
        wooden2.performFlay();
        wooden2.performQuack();
    }
}
