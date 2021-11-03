package decorator.window;

public class HorizontalScrollBar extends WindowDecorator {
    public HorizontalScrollBar(Window w) {
        super(w);
    }

    public void draw() {
        super.draw(); // 위임
        System.out.println("수평 스크롤바 그리기");
    }
}