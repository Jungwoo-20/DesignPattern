package decorator.window;

class VerticalScrollBar extends WindowDecorator {
    public VerticalScrollBar(Window w) {
        super(w);
    }
    public void draw() {
        super.draw(); // 위임
        System.out.println("수직 스크롤바 그리기");

    }
}