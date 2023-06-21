package observer;

public class ConditionsDisplay extends Display{

    @Override
    public void display() {
        System.out.printf("\nConditional displays\n temperature: %f\nhumidity: %f", getTemp(), getHumidity());
    }
}
