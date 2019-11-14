package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1105 extends Applet {


    public void init() {
    }


    public void paint(Graphics g) {


        int t;
        int x1 = 50;
        int y1 = 50;

        for (t = 0; t < 5; t++) {

            y1 += 25;
            x1 += 25;

            g.drawRect(x1, y1, 25, 25);


        }


    }


}

