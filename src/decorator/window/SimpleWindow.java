package decorator.window;

class SimpleWindow
        implements Window {
    public void draw() {
        System.out.println("기본 윈도우 그리기");
    }
}