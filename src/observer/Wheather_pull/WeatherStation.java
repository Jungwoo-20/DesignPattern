package observer.Wheather_pull;

public class WeatherStation {
    public static void main(String[] args) {
        // subject 생성
        WeatherData weatherData = new WeatherData();
        WeatherData weatherData1 = new WeatherData();
        WeatherData weatherData2 = new WeatherData();

        //Observers 생성
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData1);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData2);


        //기상대 시뮬레이션
        weatherData.setMeasurements(20, 50, 990, 6);
        weatherData1.setMeasurements(10, 35, 980, 7);
        weatherData2.setMeasurements(30, 70, 1000, 3);
    }
}