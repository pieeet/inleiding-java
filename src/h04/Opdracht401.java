package h04;

import java.awt.*;
import java.applet.*;


public class Opdracht401 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {

        setBackground(Color.WHITE);
        g.drawLine(100, 100, 200, 200);
        g.drawLine(200,200,200,100);
        g.drawLine(100,100,200,100);
    }
}