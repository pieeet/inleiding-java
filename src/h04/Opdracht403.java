package h04;

import java.awt.*;
import java.applet.*;


public class Opdracht403 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.CYAN);
        g.drawLine(200,100,200,300);
        g.setColor(Color.RED);
        g.fillRect(100,100,100,25);
        g.setColor(Color.WHITE);
        g.fillRect(100,125,100,25);
        g.setColor(Color.BLUE);
        g.fillRect(100,150,100,25);


    }
}