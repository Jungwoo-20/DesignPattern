package decorator.window;

abstract class WindowDecorator implements Window {
    protected Window wrappedWindow; //구성

    public WindowDecorator(Window w) {
        wrappedWindow = w;
    }

    public void draw() {
        wrappedWindow.draw(); //위임
    }
}