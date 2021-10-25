package observer.Weather;

public interface Observer {
    //push model
    public void update(float t, float h, float p, float w);
}