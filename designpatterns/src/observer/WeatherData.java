package observer;

import observer.Observer;
import observer.Subject;

import java.util.ArrayList;
import java.util.Collection;
public class WeatherData implements Subject {
    private float temp;
    private float humidity;
    private float pressure;

    Collection<Observer> observerList;

    public WeatherData() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(o -> o.update(temp, humidity, pressure));
    }
    public void measureDataChanged(){
        notifyObservers();
    }
    public void setMeatherData(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
        measureDataChanged();
    }
}
