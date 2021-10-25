package observer.Wheather_pull;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private float 온도, 습도, 기압, 풍속; // 관심 정보
    private boolean flag;
    private ArrayList<Observer> observers; // observer list

    public WeatherData() {
        observers = new ArrayList<Observer>();
        flag = false;
    }

    // Subject 인터페이스 구현:
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer o : observers) o.update();
        flag = false;
    }

    public void setMeasurements(float t, float h, float p, float w) { // 기상청이 호출함.
        온도 = t;
        습도 = h;
        기압 = p;
        풍속 = w;
        measurementsChanged();
    }

    protected void setChanged() {
        flag = true;
    }

    public void measurementsChanged() { // 통지 방법에 융통성을 부여하기 위해.
        setChanged(); //flag change
        notifyObservers();                // (예) if ( condition ) notifyObservers();
    }

    public float get온도() {
        return 온도;
    }


    public float get습도() {
        return 습도;
    }


    public float get기압() {
        return 기압;
    }


    public float get풍속() {
        return 풍속;
    }

}