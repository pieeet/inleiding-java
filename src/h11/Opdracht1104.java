package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1104 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {

        int t;
        int antw;
        int x = 50;
        int y = 50;

        for(t = 1; t < 11; t++){
            antw = 3 * t;
        g.drawString(" " + antw, x , y);
        y += 20;

        }


    }






}
