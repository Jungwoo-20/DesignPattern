package proxy.Virtual;

import javax.swing.*;
import java.net.*;
import java.util.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ImageProxyTestDrive {
    RealImage imageComponent;
    JFrame frame = new JFrame("Image Cover Viewer");
    JMenuBar menuBar;
    JMenu menu;
    Hashtable cds = new Hashtable();

    public static void main(String[] args) throws Exception {
        ImageProxyTestDrive testDrive = new ImageProxyTestDrive();
    }

    public ImageProxyTestDrive() throws Exception {

        // http 서버
        cds.put("세계 채소의 날","https://image.shutterstock.com/image-photo/world-vegetable-day-on-fresh-600w-1832735578.jpg");
        cds.put("세계 식량의 날","https://image.shutterstock.com/image-vector/world-food-day-600w-1193857195.jpg");
        cds.put("할로윈","https://image.shutterstock.com/image-illustration/halloween-pumpkin-halo-angel-on-600w-1493264564.jpg");

        URL initialURL = new URL((String) cds.get("세계 채소의 날"));
        menuBar = new JMenuBar();
        menu = new JMenu("Image");
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        for (Enumeration e = cds.keys(); e.hasMoreElements(); ) {
            String name = (String) e.nextElement();
            JMenuItem menuItem = new JMenuItem(name);
            menu.add(menuItem);
            menuItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    imageComponent.setIcon(new ImageProxy(getCDUrl(event.getActionCommand())));
                    frame.repaint();
                }
            });
        }

        // set up frame and menus
        Icon icon = new ImageProxy(initialURL);
        imageComponent = new RealImage(icon);
        frame.getContentPane().add(imageComponent);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);
    }

    URL getCDUrl(String name) {
        try {
            return new URL((String) cds.get(name));
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
