import observer.Observer;
import observer.Subject;

public class WeatherData implements Subject {
    private float temp;
    private float humidity;
    private float pressure;

    @Override
    public void register(Observer observer) {

    }

    @Override
    public void unregister(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
