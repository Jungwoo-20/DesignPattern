package mvc.calcul;

import javax.swing.*;
import java.awt.event.*;


public class View extends JFrame implements Observer {
    private JTextField num1;
    private JTextField num2;
    private JTextField result;
    private JButton sumButton;
    private JButton subButton;

    public View() {
        setTitle("20160609 서정우");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel = new JPanel();

        num1 = new JTextField(20);
        panel.add(num1);

        num2 = new JTextField(20);
        panel.add(num2);
        sumButton = new JButton();
        sumButton.setText("+");

        panel.add(sumButton);
        subButton = new JButton();
        subButton.setText("-");
        panel.add(subButton);

        result = new JTextField(20);
        result.setEditable(false);
        panel.add(result);

        add(panel);
    }

    @Override
    public void update(int res) {
        result.setText(String.valueOf(res));
    }


    public void settingButton(ActionListener actionListener) {
        sumButton.addActionListener(actionListener);
        subButton.addActionListener(actionListener);
    }

    // Getter
    public int getNum1(){
        return Integer.parseInt(num1.getText());
    }
    public int getNum2(){
        return Integer.parseInt(num2.getText());
    }
    public JButton getSumButton(){
        return sumButton;
    }
    public JButton getSubButton(){
        return subButton;
    }
}