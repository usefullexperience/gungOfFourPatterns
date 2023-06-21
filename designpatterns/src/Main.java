import observer.*;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        ConditinalDisplay conditinalDisplay = new ConditinalDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeatherData(75, 80, 2);
        conditinalDisplay.display();
        forecastDisplay.display();

    }
}
