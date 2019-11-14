package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1106 extends Applet {

    public void init() {
        setSize(500, 500);
    }

    public void paint(Graphics g) {

        int t;
        int x = 200;
        int y = 250;
        int w = 10;
        int h = 10;


        for (t = 0; t < 5; t++) {

            x -= 5;
            y -= 5;
            w += 10;
            h += 10;

            g.drawOval(x, y, w, h);


        }


    }
}



