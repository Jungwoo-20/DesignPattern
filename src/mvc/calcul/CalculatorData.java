package mvc.calcul;

import java.util.ArrayList;

public class CalculatorData implements Subject {
    private int result; // 결괏값
    private ArrayList<Observer> observers;

    public CalculatorData() {
        result = 0;
        observers = new ArrayList<Observer>();
    }

    public void add(int a, int b) {
        result = a + b;
        notifyObservers();
    }

    public void sub(int a, int b) {
        result = a - b;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void subtractObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(result);
        }
    }
}
