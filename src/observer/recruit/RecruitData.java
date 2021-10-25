package observer.recruit;

import java.util.ArrayList;

public class RecruitData implements Subject {
    private String name;
    private int age;
    private String department;
    private ArrayList<Observer> observers;

    public RecruitData() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) o.update(name, age, department);
    }

    public void setRecruitments(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
        recruitmentsChanged();
    }
    public void recruitmentsChanged(){
        notifyObservers();
    }
}
