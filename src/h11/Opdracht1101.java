package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1101 extends Applet {
    public void init() {
    setSize(500,500);

    }

    public void paint(Graphics g) {
       int x = 0;

        for (int i = 0; i < 10; i++){
            x += 20;
            g.drawLine(x, 50, x,200);
            ;
        }

    }
}
