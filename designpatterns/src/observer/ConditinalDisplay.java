package observer;

public class ConditinalDisplay implements DisplayElement, Observer {

    public ConditinalDisplay(Subject subject) {
        subject.register(this);
    }

    private float temp;
    private float humidity;

    @Override
    public void display() {
        System.out.printf("\nConditional Display");
        System.out.printf("\nTemperature: %f", temp);
        System.out.printf("\nHumidity: %f", humidity);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
    }
}
