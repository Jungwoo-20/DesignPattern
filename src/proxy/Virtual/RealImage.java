package proxy.Virtual;

import javax.swing.*;
import java.awt.*;

class RealImage extends JComponent {
    private Icon icon;

    public RealImage(Icon icon) {
        this.icon = icon;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int w = icon.getIconWidth();
        int x = (800 - w) / 2;
        int h = icon.getIconHeight();
        int y = (600 - h) / 2;
        icon.paintIcon(this, g, x, y);
    }
    public void setIcon(Icon icon){
        this.icon = icon;
    }
} // RealImage
