package observer.Wheather_pull;

public class ForecastDisplay implements Observer, DisplayElement {
    private float temperature, humidity, pressure, wind;    // 관심 정보
    private Subject weatherData;                // 탈퇴時 필요함.

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);    // subject에 등록함.
    }

    // DisplayElement 인터페이스 구현:
    public void display() {
        System.out.println("Forecast conditions: " + temperature
                + "F degrees and " + humidity + "% humidity" + " wind : " + wind);
    }

    @Override
    public void update() {
        if (weatherData instanceof Subject) {
            WeatherData weatherData1 = (WeatherData) weatherData;
            this.pressure = weatherData1.get기압();
            this.humidity = weatherData1.get습도();
            this.wind = weatherData1.get풍속();
            this.temperature = weatherData1.get온도();
        }
        display();
    }
}
