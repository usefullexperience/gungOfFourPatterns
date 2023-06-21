package observer;

public class WeatherData {
    private float temperature;
    private float humidity;
    private float pressure;

    private final Display conditionalDisplay;
    private final Display statisticsDisplay;
    private final Display forecastDisplay;

    public WeatherData(Display conditionalDisplay, Display statisticsDisplay, Display forecastDisplay) {
        this.conditionalDisplay = conditionalDisplay;
        this.statisticsDisplay = statisticsDisplay;
        this.forecastDisplay = forecastDisplay;
    }

    public void measurementsChanged(){
        float temperature = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        conditionalDisplay.update(temperature, humidity, pressure);
        statisticsDisplay.update(temperature, humidity, pressure);
        forecastDisplay.update(temperature, humidity, pressure);
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}
