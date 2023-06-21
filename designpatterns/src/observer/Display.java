package observer;

public abstract class Display {
    private float temp, humidity, pressure;

    public void update(float temp, float humidity, float pressure) {
        this.humidity = humidity;
        this.temp = temp;
        this.pressure = pressure;
    }

    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public abstract void display();
}
