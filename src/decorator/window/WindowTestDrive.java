package decorator.window;

public class WindowTestDrive {
    public static void main(String[] args) {
        Window w = new SimpleWindow();
        w = new VerticalScrollBar(w);
        w = new HorizontalScrollBar(w);
        w.draw();
    }
}
