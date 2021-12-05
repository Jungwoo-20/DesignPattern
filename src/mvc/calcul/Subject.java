package mvc.calcul;

public interface Subject {
    public void addObserver(Observer o);
    public void subtractObserver(Observer o);
    public void notifyObservers();

}
