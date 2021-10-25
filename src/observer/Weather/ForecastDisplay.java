package observer.Weather;

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
                + "F degrees and " + humidity + "% humidity" + wind);
    }

    @Override
    public void update(float t, float h, float p, float w) {
        temperature = t;
        humidity = h;
        pressure = p;
        wind = w;
        display();
    }
}
