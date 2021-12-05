package mvc.calcul;

public class CalCulTestDrive {

    public static void main(String[] args) {
        View view = new View();
        CalculatorData calculatorData = new CalculatorData();
        calculatorData.addObserver(view);
        CalculController calculController = new CalculController(view, calculatorData);
        view.setVisible(true);
    }
}

