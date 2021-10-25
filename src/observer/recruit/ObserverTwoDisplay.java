package observer.recruit;

public class ObserverTwoDisplay implements Observer, DisplayElement {
    private String name;
    private int age;
    private String department;
    private Subject data;

    public ObserverTwoDisplay(Subject data) {
        this.data = data;
        data.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("name : " + name + " / age limit : " + age + " / department : " + department);
    }

    @Override
    public void update(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
        display();
    }
}
