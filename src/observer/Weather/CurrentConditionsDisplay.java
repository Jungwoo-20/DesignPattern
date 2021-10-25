package observer.Weather;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature, humidity, pressure, wind;	// 관심 정보
    private Subject weatherData; 				// 탈퇴時 필요함.

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);	// subject에 등록함.
    }

    // DisplayElement 인터페이스 구현:
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity" + wind);
    }

    @Override
    public void update(float t, float h, float p, float w) {
        temperature = t; humidity = h; pressure = p; wind = w;
        display();
    }
}