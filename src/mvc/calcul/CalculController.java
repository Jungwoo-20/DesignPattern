package mvc.calcul;

import java.awt.event.*;

public class CalculController implements ActionListener {
    private View view;
    private CalculatorData calculatorData;

    public CalculController(View view, CalculatorData calculatorData) {
        this.view = view;
        this.calculatorData = calculatorData;
        view.settingButton(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int num1 = view.getNum1();
        int num2 = view.getNum2();
        if (e.getSource().equals(view.getSumButton())) {
            calculatorData.add(num1, num2);
        } else if (e.getSource().equals(view.getSubButton())) {
            calculatorData.sub(num1, num2);
        }
    }

}
