package observer.Weather;

public class WeatherStation {
    public static void main(String[] args) {
        // subject 생성
        WeatherData weatherData = new WeatherData();

        //Observers 생성
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        //기상대 시뮬레이션
        currentDisplay.update(20,60,30.4f,10);
        forecastDisplay.update(25,55,30,20);
        weatherData.setMeasurements(78, 90, 29.2f,30);

    }
}