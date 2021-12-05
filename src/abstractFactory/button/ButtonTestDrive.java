package abstractFactory.button;

public class ButtonTestDrive {
    public static void main(String[] args) {
        GUIFactory guiFactory = new WinFactory();
        GUIFactory guiFactory1 = new OSXFactory();
        Button button = guiFactory.createButton();
        Button button1 = guiFactory1.createButton();
        button.print();
        button1.print();
    }
}
