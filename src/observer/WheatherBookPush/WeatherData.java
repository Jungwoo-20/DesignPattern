package observer.WheatherBookPush;

import java.util.ArrayList;
import java.util.Observable;

public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;
    private ArrayList<Observable> observables;
    public WeatherData() {
    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers(observables);
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}