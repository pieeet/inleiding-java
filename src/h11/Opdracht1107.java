package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1107 extends Applet {


    public void init() {
        setSize(1000,1000);
    }

    public void paint(Graphics g) {

        int t;
        int x = 300;
        int y = 300;
        int w = 10;
        int h = 10;



        for (t = 0; t < 50; t++) {

            x -= 5;
            y -= 5;
            w += 10;
            h += 10;

            g.drawOval(x, y, w, h);


        }


    }
}