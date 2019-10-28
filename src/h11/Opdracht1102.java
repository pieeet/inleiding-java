package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1102 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int teller = 20;
        int x = 50;
        int y = 50;

        for (int i = 20; i > 10; i--){
        g.drawString(" " + i, x,y);
        y += 20;
        }

    }




}
