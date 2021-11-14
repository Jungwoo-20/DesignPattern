package factory.pizzaFactory;

public abstract class PizzaStore {

    // 피자 생성 인터페이스만 정의; 실제 생성은 subclass에게 맡김.
    abstract Pizza create(String 피자유형);

    Pizza order(String 피자유형) {
        Pizza pz = create(피자유형);
        pz.prepare();
        pz.bake();
        pz.cut();
        pz.box();
        System.out.println();
        return pz;
    }
}