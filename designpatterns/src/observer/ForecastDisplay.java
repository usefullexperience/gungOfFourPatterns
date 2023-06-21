package observer;

public class ForecastDisplay extends Display{
    @Override
    public void display() {
        System.out.printf("\nForecast displays\n temperature: %f\nhumidity: %f", getTemp(), getHumidity());
    }
}
