package strategy.duck;

public class DuckTestDrive { // client

    public static void main(String[] args) {
        Duck[] ducks = {
                new CommonDuck(),
                new MallardDuck(),
                new RubberDuck()
        };
        for (Duck d: ducks){
            d.display();
        }

    }
}