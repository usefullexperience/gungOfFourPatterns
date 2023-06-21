import observer.*;

public class Main {
    public static void main(String[] args) {
        Display conditional = new ConditionsDisplay();
        Display forecast = new ForecastDisplay();
        Display statistics = new StatisticsDisplay();
        WeatherData weatherData = new WeatherData(conditional, statistics, forecast);
        weatherData.setHumidity(1);
        weatherData.setPressure(2);
        weatherData.setTemperature(75);
        weatherData.measurementsChanged();
        conditional.display();
        statistics.display();
        forecast.display();
    }
}
