package observer;

public class StatisticsDisplay extends Display {
    @Override
    public void display() {
        System.out.printf("\nStatistics displays\n temperature: %f\nhumidity: %f\npressure: %f", getTemp(), getHumidity(), getPressure());
    }
}
